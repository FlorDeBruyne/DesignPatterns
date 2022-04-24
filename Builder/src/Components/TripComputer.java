/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import Cars.Car;

/**
 *
 * @author Flord
 */
public class TripComputer {
    
    private Car car;
    
    public void setCar(Car car){
        this.car = car;
    }
    
    public void showFuelLevel(){
        System.out.printf("Fuel level: ", this.car.getFuel());
    }
    
    public void showStatus(){
        if(!this.car.getEngine().isStarted())
            System.out.println("The engine is turned off");
        System.out.println("The engine is turend on");
    }
    
    
    
}
