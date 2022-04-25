/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Flord
 */
public class Singleton {

    private static Singleton instance;
    
    private Singleton(){
        this.instance = new Singleton();
        // here should be the connection to the database
    }
    
    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    
    
    
}
