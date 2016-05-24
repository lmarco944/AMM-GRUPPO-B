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
public abstract class Utente {

    
    protected int id_v;
    protected int id_c;
    protected String nome;
    protected String cognome;
    protected String username;
    protected String password;
    protected String indirizzo;
    protected String residenza;
    protected String email;
    protected double saldo;
    
    
    public Utente()
    {
        id_v=0;
        id_c=0;
        nome = "";
        cognome = "";
        username="";
        password="";
        indirizzo="";
        residenza="";
        email="";
        saldo = 0.00;
        
    }
    
    
        /**
     * @return the id_v
     */
    public int getId_v() {
        return id_v;
    }

    /**
     * @param id_v the id_v to set
     */
    public void setId_v(int id_v) {
        this.id_v = id_v;
    }
    
        /**
     * @return the id_c
     */
    public int getId_c() {
        return id_c;
    }

    /**
     * @param id_c the id_c to set
     */
    public void setId_c(int id_c) {
        this.id_c = id_c;
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
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * @param indirizzo the indirizzo to set
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    /**
     * @return the residenza
     */
    public String getResidenza() {
        return residenza;
    }

    /**
     * @param residenza the residenza to set
     */
    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * @return the saldo
     */
     public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the nome to set
     */
    public void setSaldo (Double saldo) {
        this.saldo = saldo;
    }
    
    
}
