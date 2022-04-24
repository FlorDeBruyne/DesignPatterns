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
public class Car {
    
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tComputer;
    private final GPSNavigator gps;
    private double fuel = 0;

    public Car(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tComputer, GPSNavigator gps) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tComputer = tComputer;
        if (this.tComputer != null)
            this.tComputer.setCar(this);
        this.gps = gps;
    }

    public CarType getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer gettComputer() {
        return tComputer;
    }

    public GPSNavigator getGps() {
        return gps;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

   
    
    
 
}

    
    