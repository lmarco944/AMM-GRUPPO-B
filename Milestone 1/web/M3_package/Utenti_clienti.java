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
public class Utenti_clienti {
    
    private int id_cliente;
    private String nome_c;
    private String cognome_c;
    

    /**
     * @return the nome
     */
    public String getnome_c() {
        return nome_c;
    }

    /**
     * @param nome_c the nome to set
     */
    public void setnome_c(String nome_c) {
        this.nome_c = nome_c;
    }
    
     public String getcognome_c() {
        return cognome_c;
    }

    /**
     * @param cognome_c the nome to set
     */
    public void setcognome_c(String cognome_c) {
        this.cognome_c = cognome_c;
    }

    /**
     * @return the id
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}

