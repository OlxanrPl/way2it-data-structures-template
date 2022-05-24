package org.way2it.data_structures.Car_Hw;

public class CarBody {

    private double weight;

    public CarBody(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.valueOf(this.weight) ;
    }

    public void mltpWeight(){
        weight=weight*1.25;
    }

    public void divWeight(){
        weight=weight/1.25;
    }
}
