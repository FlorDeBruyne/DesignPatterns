/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Director;
import Builders.Builder;
import Builders.CarManualBuilder;
import Cars.CarType;
import Components.Engine;
import Components.GPSNavigator;
import Components.Transmission;
import Components.TripComputer;

/**
 *
 * @author Flord
 */
public class Director {
    
    
    public void makeSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(2);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPSNavigator());
        
    }
    
    public void makeSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(8.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPSNavigator());
    }
    
    public void makeCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPSNavigator());
    }
    
    
    
    
    
}
