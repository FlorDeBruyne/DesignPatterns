/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builders;

import Cars.CarType;
import Cars.Manual;
import Components.Engine;
import Components.GPSNavigator;
import Components.Transmission;
import Components.TripComputer;

/**
 *
 * @author Flord
 */
public class CarManualBuilder implements Builder{
    
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tComputer;
    private GPSNavigator gps;
    
    
    

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {        
        this.tComputer = tripComputer;
    }

    @Override
    public void setGPS(GPSNavigator gpsNavigator) {
        this.gps = gpsNavigator;
    }
    
    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public Manual getResult(){
        return new Manual(type, seats, engine, transmission, tComputer, gps);
    }

    

    
}
