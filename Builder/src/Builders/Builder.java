/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builders;

import Cars.CarType;
import Components.Engine;
import Components.GPSNavigator;
import Components.Transmission;
import Components.TripComputer;

/**
 *
 * @author Flord
 */
public interface Builder {
    
    public void setCarType(CarType type);
    
    public void setSeats(int seats);
    
    public void setEngine(Engine engine);
    
    public void setTransmission(Transmission transmission);
    
    public void setTripComputer(TripComputer tripComputer);
    
    public void setGPS(GPSNavigator gpsNavigator);
    
}
