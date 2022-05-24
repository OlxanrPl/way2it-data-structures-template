package org.way2it.data_structures.Car_Hw;

public class Sreering {

    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Sreering(int diameter) {
        this.diameter = diameter;
    }


    @Override
    public String toString() {
        return String.valueOf(this.diameter) ;
    }

    public void mltpDiameter(){
        diameter=diameter*1.2;
    }
    public void divDiameter(){
        diameter=diameter/1.2;
    }
}
