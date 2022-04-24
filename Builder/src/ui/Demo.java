/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Builders.CarBuilder;
import Builders.CarManualBuilder;
import Cars.Car;
import Cars.Manual;
import Director.Director;

/**
 *
 * @author Flord
 */
public class Demo {
    
    
    public static void main(String[] args){
        
        Director d = new Director();
        
        CarBuilder cBuilder = new CarBuilder();
        d.makeCityCar(cBuilder);
        
        Car car = cBuilder.getResult();
        System.out.println("Car built:\n" + car.getType());
        
        
        
        CarManualBuilder mBuilder = new CarManualBuilder();
        d.makeSUV(mBuilder);
        
        Manual manual = mBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());
        
    }
}
