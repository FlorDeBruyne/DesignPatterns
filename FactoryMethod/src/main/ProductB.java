/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Flord
 */
public class ProductB implements Product{

    public String name, trainConductor;

    public ProductB(String name, String trainConductor) {
        setName(name);
        setTrainConductor(trainConductor);
    }    

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isEmpty())
            throw new IllegalArgumentException("Name has to be filled in");
        this.name = name;
    }

    public String getTrainConductor() {
        return trainConductor;
    }

    private void setTrainConductor(String trainConductor) {
        if(trainConductor.isEmpty())
            throw new IllegalArgumentException("Conductor has to be filled in");
        this.trainConductor = trainConductor;
    }

    @Override
    public String toString() {
        return "ProductB{" + "name=" + name + ", trainConductor=" + trainConductor + '}';
    }
    

    @Override
    public Product getProduct() {
        return this;
    }
    
}
