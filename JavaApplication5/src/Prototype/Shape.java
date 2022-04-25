/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Flord
 */
public abstract class Shape {
    private int x, y;
    private String color;
    
    
    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    
    public Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }
    
    public abstract Shape clone();
    
    
    
    
    
}
