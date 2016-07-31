/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class UtentiFactory {
    // Attributi e singleton
     private static UtentiFactory singleton;
    String connectionString; 
    
    // E' l'unico metodo che restituisce il singleton. Provvede a inizializzarlo alla prima chiamata.
    // Nelle successive chiamate lo restituisce e basta.
    public static UtentiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiFactory();
        }
        return singleton;
    }

    /* Costruttore */
    private UtentiFactory() {

    }        
    
    // Metodi
    //
    
    public Utente getUtente(String username,String password){
        
        
        
        try{
            Connection conn = DriverManager.getConnection(connectionString,"lmarco94","0000"); // username e password
            // sql command
            String query= "select * from venditore where username= ? "+"and password= ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            /// eseguo query
            ResultSet res = stmt.executeQuery();
            
            //controllo dei risultati
            if(res.next())
            {   // qui tutti gli attributi del venditore gli imposto
                Venditore venditore=new Venditore();
                venditore.setId_v(res.getInt("id_v"));
                venditore.setNome(res.getString("nome"));
                venditore.setCognome(res.getString("cognome"));
                venditore.setUsername(res.getString("username"));
                venditore.setPassword(res.getString("password"));
                venditore.setIndirizzo(res.getString("indirizzo"));
                venditore.setResidenza(res.getString("residenza"));
                venditore.setEmail(res.getString("email"));
                venditore.setSaldo(res.getDouble("saldo"));
                //oggetti in vendita dal venditore 
                query= "select * from oggetto join venditore on venditore.id_v=oggetto.id_venditore "
                        +"where oggetto.id_venditore = "+venditore.getId_v();
                Statement st= conn.createStatement();
                ResultSet res2=st.executeQuery(query);
                //controllo dei risultati restituiti dalla query
                while(res2.next()){
                    Oggetto o=new Oggetto() {};
                    o.setId_o(res2.getInt("id_o"));
                    o.setNome(res2.getString("nome"));
                    o.setDescrizione(res2.getString("descrizione"));
                    o.setPrezzo(res2.getDouble("prezzo"));
                    o.setQuantita(res2.getInt("quantita"));
                    o.setFoto(res2.getString("foto"));
                    venditore.getListaOggetti().add(o);
                }
                
                // chiudo tutto e faccio il ritorno
                st.close();
                stmt.close();
                conn.close();
                return venditore;
                
            }
        
            // sql command
            query ="select * from cliente"+" where username= ? "+"and password = ? ";
            stmt = conn.prepareStatement(query);
            // dati
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            res= stmt.executeQuery();
            if(res.next()){
                Cliente cliente = new Cliente();
                cliente.setId_c(res.getInt("id_c"));
                cliente.setNome(res.getString("nome"));
                cliente.setCognome(res.getString("cognome"));
                cliente.setUsername(res.getString("username"));
                cliente.setPassword(res.getString("password"));
                cliente.setIndirizzo(res.getString("indirizzo"));
                cliente.setResidenza(res.getString("residenza"));
                cliente.setEmail(res.getString("email"));
                cliente.setSaldo(res.getDouble("saldo"));
                //tutti gli oggetti in vendita nel sito
                query= "select * from oggetto";
                Statement st= conn.createStatement();
                ResultSet res2=st.executeQuery(query);
                //controllo dei risultati restituiti dalla query
                while(res2.next()){
                    Oggetto o=new Oggetto() {};
                    o.setId_o(res2.getInt("id_o"));
                    o.setNome(res2.getString("nome"));
                    o.setDescrizione(res2.getString("descrizione"));
                    o.setPrezzo(res2.getDouble("prezzo"));
                    o.setQuantita(res2.getInt("quantita"));
                    o.setFoto(res2.getString("foto"));
                    cliente.getListaOggetti().add(o);
                }
                stmt.close();
                conn.close();
                return cliente;
            }
            
            stmt.close();
            conn.close();
               
        }
        catch(SQLException e){
           // gestione errore 
        }
        
        return null; //se non c'è corrispodenza ritorno null
    }
    // Venditore
    // Dato un id restituisce il relativo venditore (se esiste un venditore con quell'id, altrimenti
    // restituisce null).
    public Utente getVenditore(int id_v)
    {
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            // Query
            String query = "select * from venditore "
            + "where id_v = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, id_v);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
            
             // ciclo sulle righe restituite
            if(res.next()) 
            {
                Venditore venditore = new Venditore();
                venditore.setId_v(res.getInt("id_v"));
                venditore.setNome(res.getString("nome"));
                venditore.setCognome(res.getString("cognome"));
                venditore.setUsername(res.getString("username"));
                venditore.setPassword(res.getString("password"));
                venditore.setIndirizzo(res.getString("indirizzo"));
                venditore.setResidenza(res.getString("residenza"));
                venditore.setEmail(res.getString("email"));
                venditore.setSaldo(res.getDouble("saldo"));
                //Oggetti in vendita dal venditore corrente
                query = "select oggetto.id_o, oggetto.nome from oggetto "
                        + "join venditore "
                        + "on oggetto.id_venditore = venditore.id_v "
                        + "where venditore.id_v="+venditore.getId_v();
                Statement st = conn.createStatement();
                ResultSet res2 = st.executeQuery(query);
                while(res2.next()) //ciclo sulle righe restituite dalla query soprastante
                {
                    Oggetto o = new Oggetto() {};
                    o.setId_o(res2.getInt("id_o"));
                    o.setNome(res2.getString("nome"));
                    o.setDescrizione(res2.getString("descrizione"));
                    o.setPrezzo(res2.getDouble("prezzo"));
                    o.setQuantita(res2.getInt("quantita"));
                    o.setFoto(res2.getString("foto"));
                    o.setId_venditore(res2.getInt("id_venditore"));
                    venditore.getListaOggetti().add(o);
                }           
                
                st.close();
                stmt.close();
                conn.close();
                return venditore;
            }   
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }
    
    // Restituisce la lista di tutti i venditori
    public ArrayList<Venditore> getVenditori()
    {
        ArrayList<Venditore> listaVenditori = new ArrayList<Venditore>();
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            Statement stmt = conn.createStatement();
            String query = "select * from "
            + "venditore";
            ResultSet set = stmt.executeQuery(query);
            
             // ciclo sulle righe restituite
            while(set.next()) 
            {
                Venditore current = new Venditore();
                current.setId_v(set.getInt("id_v"));
                current.setNome(set.getString("nome"));
                current.setCognome(set.getString("cognome"));
                current.setUsername(set.getString("username"));
                current.setPassword(set.getString("password"));
                current.setIndirizzo(set.getString("indirizzo"));
                current.setResidenza(set.getString("residenza"));
                current.setEmail(set.getString("email"));
                current.setSaldo(set.getDouble("saldo"));
                listaVenditori.add(current);
            } 
            
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return listaVenditori;
    }
    
    // Studenti
    // Restituisce la lista di tutti i clienti
    public ArrayList<Cliente> getClienti()
    {
        ArrayList<Cliente> listaClienti = new ArrayList<Cliente>();
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            Statement stmt = conn.createStatement();
            String query = "select * from cliente";
            ResultSet set = stmt.executeQuery(query);
            
             // ciclo sulle righe restituite
            while(set.next()) 
            {
                Cliente current = new Cliente();
                current.setId_c(set.getInt("id_c"));
                current.setNome(set.getString("nome"));
                current.setCognome(set.getString("cognome"));
                current.setUsername(set.getString("username"));
                current.setPassword(set.getString("password"));
                current.setIndirizzo(set.getString("indirizzo"));
                current.setResidenza(set.getString("residenza"));
                current.setEmail(set.getString("email"));
                current.setSaldo(set.getDouble("saldo"));
                listaClienti.add(current);
            }     
            
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return listaClienti;
    }
    
    // Dato un id restituisce il relativo cliente (se esiste un cliente con quell'id, altrimenti
    // restituisce null).
    public Utente getCliente(int id_c)
    {
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            String query = "select * from cliente "
            + "where id_c = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, id_c);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
           
             // ciclo sulle righe restituite
            if(res.next()) 
            {
                Cliente current = new Cliente();
                current.setId_c(res.getInt("id_c"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setUsername(res.getString("username"));
                current.setPassword(res.getString("password"));
                current.setIndirizzo(res.getString("indirizzo"));
                current.setResidenza(res.getString("residenza"));
                current.setEmail(res.getString("email"));
                current.setSaldo(res.getDouble("saldo"));
                
                stmt.close();
                conn.close();
                return current;
            }
            
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    
     // Dato un id restituisce il relativo oggetto (se esiste un oggetto con quell'id, altrimenti
    // restituisce null).
    public Oggetto getOggetto(int id_o)
    {
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            String query = "select * from oggetto "
            + "where id_o = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, id_o);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
           
             // ciclo sulle righe restituite
            if(res.next()) 
            {
                Oggetto current = new Oggetto();
                current.setId_o(res.getInt("id_o"));
                current.setNome(res.getString("nome"));
                current.setDescrizione(res.getString("descrizione"));
                current.setPrezzo(res.getDouble("prezzo"));
                current.setQuantita(res.getInt("quantita"));
                current.setFoto(res.getString("foto"));
                current.setId_venditore(res.getInt("id_venditore"));
                
                stmt.close();
                conn.close();
                return current;
            }
            
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }
    
 
    
    
    public Oggetto getOggetto(Oggetto ogg){
        try {       
        Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
        String query = "select * from Oggetto where id_o = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, ogg.id_o);
        ResultSet res = stmt.executeQuery();
        
        if(res.next()){
            Oggetto oggetto = new Oggetto();
            oggetto.setId_o(res.getInt("id"));
            oggetto.setNome(res.getString("nome"));
            oggetto.setDescrizione(res.getString("descrizione"));
            oggetto.setPrezzo(res.getDouble("prezzo"));
            oggetto.setQuantita(res.getInt("quantita"));
            oggetto.setFoto(res.getString("foto"));
            oggetto.setId_venditore(res.getInt("id_venditore"));
            
            stmt.close();
            conn.close();
            return oggetto;
        }
        
        stmt.close();
        conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;       
    }

    
    public ArrayList<Oggetto> getOggettiList(){
        ArrayList<Oggetto> lista = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            Statement stmt = conn.createStatement();
            String query = "select * from Oggetto";
            ResultSet set = stmt.executeQuery(query);
            
            while(set.next()){
                Oggetto oggetto = new Oggetto();
                oggetto.setId_o(set.getInt("id"));
                oggetto.setNome(set.getString("nome"));
                oggetto.setDescrizione(set.getString("descrizione"));
                oggetto.setPrezzo(set.getDouble("prezzo"));
                oggetto.setQuantita(set.getInt("quantita"));
                oggetto.setFoto(set.getString("foto"));
                oggetto.setId_venditore(set.getInt("id_venditore"));
                lista.add(oggetto);
            }
            
            stmt.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return lista;        
    }
    
    
    public ArrayList<Oggetto> getOggettiList(Utente utente){
        ArrayList<Oggetto> lista = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            Statement stmt = conn.createStatement();
            String query = "select * from Oggetto where id_venditore =" + utente.getId_v();
            ResultSet set = stmt.executeQuery(query);
            
            while(set.next()){
                Oggetto oggetto = new Oggetto();
                oggetto.setId_o(set.getInt("id"));
                oggetto.setNome(set.getString("nome"));
                oggetto.setPrezzo(set.getDouble("prezzo"));
                oggetto.setQuantita(set.getInt("pezzi"));
                oggetto.setDescrizione(set.getString("descrizione"));
                oggetto.setFoto(set.getString("foto"));
                oggetto.setId_venditore(set.getInt("idVenditore"));
                lista.add(oggetto);
            }
            
            stmt.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return lista;        
    }
    
    // Oggetto
    // Restituisce la lista di tutti gli oggetti
    public ArrayList<Oggetto> getOggetti()
    {
        ArrayList<Oggetto> listaOg = new ArrayList<Oggetto>();
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            Statement stmt = conn.createStatement();
            String query = "select * from "
            + "oggetto";
            ResultSet set = stmt.executeQuery(query);
            
             // ciclo sulle righe restituite
            while(set.next()) 
            {
                Oggetto current = new Oggetto();
                current.setId_o(set.getInt("id_o"));
                current.setNome(set.getString("nome"));
                current.setDescrizione(set.getString("descrizione"));
                current.setPrezzo(set.getDouble("prezzo"));
                current.setQuantita(set.getInt("quantita"));
                current.setFoto(set.getString("foto"));
                listaOg.add(current);
            }
            
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return listaOg;
    }
    

    public ArrayList<Oggetto> getOggettiRicerca (String text)
    {
        ArrayList<Oggetto> lista = new ArrayList<>();
        
        try
        {
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            String query = "select * from oggetto " + 
                           "where oggetto.nome LIKE ? OR oggetto.descrizione LIKE ?";         
            PreparedStatement stmt = conn.prepareStatement(query);
            // Assegna dati
            String testo = "%" +text+ "%";
            stmt.setString(1, testo);
            stmt.setString(2, testo);
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Oggetto oggetto = new Oggetto();
                oggetto.setId_o(res.getInt("id_o"));
                oggetto.setNome(res.getString("nome"));
                oggetto.setFoto(res.getString("foto"));
                oggetto.setDescrizione(res.getString("descrizione"));
                oggetto.setQuantita(res.getInt("quantita"));
                oggetto.setPrezzo(res.getDouble("prezzo"));
                lista.add(oggetto);
            }
            
            stmt.close();
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();}
        
        
        return lista;
    }
    
    
    //TASK 5: vendita di un nuovo oggetto
    public void InserisciOggetto(int id_venditore, int id_o, String nome, String descrizione, Double prezzo, int quantita) throws SQLException 
    {
        Connection conn = DriverManager.getConnection(connectionString,"lmarco94","0000");
        PreparedStatement newOggetto= null;
        //sql command
        String nuovoOggetto = "INSERT INTO oggetto(id_venditore, id_o, nome, descrizione, prezzo, quantita)"
                +" VALUES (?, ?, ?, ?, ?, ?)"; //inserisce un oggetto nuovo nel database
       
        try{
            conn.setAutoCommit(false); // in modo da iniziare la transazione
            newOggetto = conn.prepareStatement(nuovoOggetto);
                        
            newOggetto.setInt(1,id_venditore);
            newOggetto.setInt(2,id_o);
            newOggetto.setString(3,nome);
            newOggetto.setString(4,descrizione);
            newOggetto.setDouble(5,prezzo);
            newOggetto.setInt(6,quantita);
            

                      
            
            int r1= newOggetto.executeUpdate();
            
            if(r1 != 1)
                conn.rollback();
                conn.commit(); 
        }
        catch(SQLException e){
            try {conn.rollback();}
            
            catch(SQLException e2){}
        }
        finally{
            
            if(newOggetto != null)
                newOggetto.close();
            
            conn.setAutoCommit(true);
            conn.close();
        }
    
    
    }
    
    public void AggiornaOggetto(String nome, Double prezzo, int quantita) {
        try {  
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            String query = "update Oggetto set nome = ?, prezzo = ?, quantita = ?, descrizione = ?, where id_o = " + Oggetto.getId_o();
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, Oggetto.getNome());
            stmt.setDouble(2, Oggetto.getPrezzo());
            stmt.setInt(3, Oggetto.getQuantita());        
            stmt.setString(4, Oggetto.getDescrizione());
       
            int r1 = stmt.executeUpdate();
        
            if (r1 == 1){
                System.out.println("\nOggetto aggiornato\n");
            }
            
            stmt.close();
            conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public void CancellaOggetto(int id) {
        try {  
            Connection conn = DriverManager.getConnection(connectionString, "lmarco94", "0000");
            String query = "delete from Oggetto where id_o = " + id;
            PreparedStatement stmt = conn.prepareStatement(query);
       
            int r1 = stmt.executeUpdate();
        
            if (r1 == 1){
                System.out.println("\nOggetto cancellato\n");
            }
            
            stmt.close();
            conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        // TASK 6: compravendita di un oggetto
    public void AcquistoOggetto(int quantita,int id_o, int id_a,int id_compratore,int id_c,int id_oggetto) throws SQLException 
    {
        Connection conn = DriverManager.getConnection(connectionString,"lmarco94","0000");
        PreparedStatement updateOggetto= null;
        PreparedStatement updateSaldoC= null;
        PreparedStatement updateAcquisto= null;
        PreparedStatement updateSaldoV= null;
        //sql command
        String diminuisciQuantita = "UPDATE oggetto SET quantita = quantita -1" +" WHERE id_o= ?"; //diminuisce la quantità dell'oggetto selezionato di un elemento
        String diminuisciCredito = "UPDATE cliente SET saldo = saldo -(SELECT prezzo FROM oggetto WHERE id_o=?) WHERE id_c=?"; //diminuisce il saldo del cliente del prezzo dell'oggetto acquistato
        String insertAcquisto= "insert into acquisto(id_a,id_compratore,id_oggetto)"+"values(?,?,?)";
        String aumentaCredito = "UPDATE venditore SET saldo = saldo +(SELECT prezzo FROM oggetto WHERE id_o=?)"; //aumenta il saldo del venditore del prezzo dell'oggetto acquistato
        
        try{
            conn.setAutoCommit(false); // in modo da iniziare la transazione
            updateOggetto = conn.prepareStatement(diminuisciQuantita);
            updateSaldoC = conn.prepareStatement(diminuisciCredito);            
            updateAcquisto = conn.prepareStatement(insertAcquisto);
            updateSaldoV = conn.prepareStatement(aumentaCredito); 
            
            updateOggetto.setInt(1,id_o);
            
            updateSaldoC.setInt(1,id_o);
            updateSaldoC.setInt(1,id_c);
            
            updateAcquisto.setInt(1,id_a);
            updateAcquisto.setInt(2,id_compratore);
            updateAcquisto.setInt(3,id_oggetto);
            
            updateSaldoV.setInt(1,id_o);
            
            int r1= updateOggetto.executeUpdate();
            int r2 = updateSaldoC.executeUpdate();
            int r3 = updateAcquisto.executeUpdate();
            int r4 = updateSaldoV.executeUpdate();
            
            if(r1 != 1 || r2 != 1 || r3 !=1 || r4 !=1){
                conn.rollback();
            }
            
        }
        catch(SQLException e){
            //errore
            conn.rollback();
            throw e;
        }
        finally{
            
            if(updateOggetto != null){
                updateOggetto.close();
                
            }
            
            if(updateSaldoC != null){
                updateSaldoC.close();
            }
            
            if(updateAcquisto != null){
                updateAcquisto.close();
            }
            
            if(updateSaldoV != null){
                updateSaldoV.close();
            }
            
            conn.setAutoCommit(true);
            conn.close();
        }
    
    
    }

       // ConnectionString
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    public String getConnectionString(){
	return this.connectionString;
    }
    

}
