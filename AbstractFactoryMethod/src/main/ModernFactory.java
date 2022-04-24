/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.FurnitureFactory;
import products.Chairs;
import products.ModernChair;
import products.ModernSofa;
import products.Sofas;

/**
 *
 * @author Flord
 */
public class ModernFactory implements FurnitureFactory{

    @Override
    public Sofas createSofa() {
        Sofas mSofa = new ModernSofa();
        return mSofa;
    }

    @Override
    public Chairs createChairs() {
        Chairs mChair = new ModernChair();
        return mChair;
                
    }
    
}
