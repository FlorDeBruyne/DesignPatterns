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
public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
        
    }
    
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    
    
    
}
