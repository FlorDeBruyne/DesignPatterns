/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import Components.Engine;
import Components.GPSNavigator;
import Components.Transmission;
import Components.TripComputer;

/**
 *
 * @author Flord
 */
public class Manual {
    
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tComputer;
    private GPSNavigator gps;

    public Manual(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tComputer, GPSNavigator gps) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tComputer = tComputer;
        this.gps = gps;
    }
    
    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gps != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
    
    
}
