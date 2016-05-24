/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Marco
 */
public class Oggetto {
    
    protected int id_o; //numero identificativo dell'oggetto in vendita
    protected String nome;
    protected String descrizione;
    protected Double prezzo;
    protected int quantita;
    protected String foto; //specifica il percorso della foto memorizzato nel database
    protected int id_venditore;
 
    
        /**
     * @return the id_o
     */
    public int getId_o() {
        return id_o;
    }

    /**
     * @param id_o the id_o to set
     */
    public void setId_o (int id_o) {
        this.id_o = id_o;
    }
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return the descrizione
     */
    public String getdescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the nome to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    /**
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
    
    /**
     * @return the quantita
     */
    public int getquantita() {
        return quantita;
    }

    /**
     * @param quantita the quantita to set
     */
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    
    /**
     * @return the foto
     */
    public String getfoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    /**
     * @return the id_venditore
     */
    public int getId_venditore() {
        return id_venditore;
    }

    /**
     * @param id_venditore the id_venditore to set
     */
    public void setId_venditore (int id_venditore) {
        this.id_venditore = id_venditore;
    }


}