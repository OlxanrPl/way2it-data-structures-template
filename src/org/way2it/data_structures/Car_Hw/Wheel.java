package org.way2it.data_structures.Car_Hw;

public class Wheel {

    private int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.valueOf(this.diameter) ;
    }

    public void incDiameter(){
        diameter++;
    }
    public void minusDiameter(){
        diameter--;
    }
}
