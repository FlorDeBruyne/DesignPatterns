/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import products.Chairs;
import products.Sofas;
import products.VictorianChair;
import products.VictorianSofa;

/**
 *
 * @author Flord
 */
public class VictorianFactory implements FurnitureFactory{

    @Override
    public Sofas createSofa() {
        Sofas vSofa = new VictorianSofa();
        return vSofa;
    }

    @Override
    public Chairs createChairs() {
        Chairs vChair = new VictorianChair();
        return vChair;
                
    }
    
}
