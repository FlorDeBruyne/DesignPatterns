/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Flord
 */
public class CreatorA extends Creator{

    @Override
    public Product createProduct(String name, String trainConductor) {
        Product p = new ProductA(name);
        return p;
    }


    
    
    
    
    
}
