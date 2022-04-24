/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main ;

import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author Flord
 */
public class ProductA implements Product{
    
    public String name;


    public ProductA(String name) {
        setName(name);

    }
    

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isEmpty())
            throw new IllegalArgumentException("Name has to be filled in");
        this.name = name;
    }


    @Override
    public String toString() {
        return "ProductA{" + "name=" + name +'}';
    }    
    
    
    //abstract interface method
    @Override
    public Product getProduct() {
        return this;
    }

}
