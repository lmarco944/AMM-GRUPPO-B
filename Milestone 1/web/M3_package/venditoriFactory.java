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
public class venditoriFactory {
    
    private static venditoriFactory singleton;
    public static venditoriFactory getInstance() {
        if (singleton == null) {
            singleton = new venditoriFactory();
        }
        return singleton;
    }
}
