/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Venditore extends Utente {
    /* Attributi */

    protected ArrayList<Oggetto> listaOggetti = new ArrayList<Oggetto>(); 
    
    /* Costruttore */
    public Venditore()
    {
        super();
    }
    /* Metodi */



    /**
     * @return the listaOggetti
     */
    public ArrayList<Oggetto> getListaOggetti() {
        return listaOggetti;
    }

    /**
     * @param listaOggetti the listaOggetti to set
     */
    public void setListaOggetti(ArrayList<Oggetto> listaOggetti) {
        this.listaOggetti = listaOggetti;
    }
}