/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builders;

import Cars.Car;
import Cars.CarType;
import Components.Engine;
import Components.GPSNavigator;
import Components.Transmission;
import Components.TripComputer;

/**
 *
 * @author Flord
 */
public class CarBuilder implements Builder{
    
    private Car car;
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tComputer;
    private GPSNavigator gps;


    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
        
    }

    @Override
    public void setTripComputer(TripComputer tComputer) {
        this.tComputer = tComputer;
    }

    @Override
    public void setGPS(GPSNavigator gps) {
        this.gps = gps;
        
    }
    
    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }
    
    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public Car getResult(){
        return new Car(type, seats, engine, transmission, tComputer, gps);
    }

    

    

  

    
}
