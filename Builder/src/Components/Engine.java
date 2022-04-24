/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

/**
 *
 * @author Flord
 */
public class Engine {
    
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }
    
    public void on(){
        started = true;
    }
    
    public void off(){
        started = false;
    }
    
    public boolean isStarted(){
        return started;
    }
    
    public void go(double mileage){
        if(!started){
            throw new IllegalStateException("You need to turn on the engine first");
        }
        this.mileage += mileage;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    
    
    
    
    
    
}
