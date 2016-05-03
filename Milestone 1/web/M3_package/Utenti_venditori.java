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
public class Utenti_venditori {
    
    private int id_venditore;
    private String nome_v;
    private String cognome_v;
    

    /**
     * @return the nome_c
     */
    public String getNome_v() {
        return nome_v;
    }

    /**
     * @param nome_v the nome to set
     */
    public void setNome_v(String nome_v) {
        this.nome_v = nome_v;
    }
    
     public String getCognome_v() {
        return cognome_v;
    }

    /**
     * @param cognome_v the nome to set
     */
    public void setCognome_v(String cognome_v) {
        this.cognome_v = cognome_v;
    }

    /**
     * @return the id
     */
    public int getId_venditore() {
        return id_venditore;
    }

    /**
     * @param id_venditore the id to set
     */
    public void setId_venditore(int id_venditore) {
        this.id_venditore = id_venditore;
    }
    
    
}
