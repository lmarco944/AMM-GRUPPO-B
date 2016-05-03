/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3_package;

/**
 *
 * @author Marco
 */
public class oggetti_vendita {
    
    private int id_oggetto; //numero identificativo dell'oggetto in vendita
    private String nome_o;
    private String categoria_o; //categoria dell'oggetto in vendita (se è un computer, una cover, una penna ecc)
    private String username;
    private String password;
    private int prezzo;
    
    /* Costruttore */
    public oggetti_vendita()
    {
        id_oggetto = 0;
        nome_o = "";
        categoria_o = "";
        username="";
        password="";
    }
    
    
    /**
     * @return the nome_c
     */
    public String getNome_o() {
        return nome_o;
    }

    /**
     * @param nome_o the nome to set
     */
    public void setNome_o(String nome_o) {
        this.nome_o = nome_o;
    }
    
    /**
     * @return the nome_c
     */
    public String getCategoria_o() {
        return categoria_o;
    }

    /**
     * @param categoria_o the nome to set
     */
    public void setCategoria_o(String categoria_o) {
        this.categoria_o = categoria_o;
    }
    
    /**
     * @return the prezzo
     */
     public int getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the nome to set
     */
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the nome to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    /**
     * @return the id
     */
    public int getId_oggetto() {
        return id_oggetto;
    }

    /**
     * @param id_oggetto the id to set
     */
    public void setId_oggetto (int id_oggetto) {
        this.id_oggetto = id_oggetto;
    }
}
