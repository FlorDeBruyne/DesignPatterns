/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author Flord
 */
public class VictorianChair implements Chairs{

    @Override
    public Boolean hasLegs() {
        return true;
    }

    @Override
    public Boolean sitOn() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("VistorianChair\n%B\n%B", hasLegs(), sitOn());
    }
    
    
    
    
    
}
