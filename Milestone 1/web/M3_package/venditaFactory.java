/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3_package;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class venditaFactory {
   
    private static venditaFactory singleton;
    public static venditaFactory getInstance() {
        if (singleton == null) {
            singleton = new venditaFactory();
        }
        return singleton;
    }
    
    // Lista categorie oggetti in vendita
    private ArrayList<oggetti_vendita> listaCategorie = new ArrayList<oggetti_vendita>();
    
    
    /* Costruttore */
    private venditaFactory() {
              
        // Categorie        
        oggetti_vendita cat_1 = new oggetti_vendita();
        cat_1.setCategoria_o ("2in1");
        listaCategorie.add(cat_1);
        oggetti_vendita cat_2 = new oggetti_vendita();
        cat_2.setCategoria_o ("Pen");
        listaCategorie.add(cat_2);
        oggetti_vendita cat_3 = new oggetti_vendita();
        cat_3.setCategoria_o ("Cover");
        listaCategorie.add(cat_3);              
}
}