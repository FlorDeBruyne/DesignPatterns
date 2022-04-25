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
public class Circle extends Shape{
    
    private double radius;

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }
    
    @Override
    public Shape clone() {
        return new Circle(this);
    }
    
    
    
}
