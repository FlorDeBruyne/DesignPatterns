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
public class GPSNavigator {
    
    public String route;

    public GPSNavigator() {
        this.route = "1A catherine street, Liverpool, United Knigdom";
    }
    
    public void manualRoute(String mRoute){
        this.route = mRoute;
    }
    
    public String getRoute(){
        return route;
    }
    
    
    
    
    
    
    
}
