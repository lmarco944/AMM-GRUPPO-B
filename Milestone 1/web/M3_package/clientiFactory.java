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
public class clientiFactory {
    
    private static clientiFactory singleton;
    public static clientiFactory getInstance() {
        if (singleton == null) {
            singleton = new clientiFactory();
        }
        return singleton;
    }
    

}
