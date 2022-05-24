package org.way2it.data_structures.Car_Hw;

public class Car_Hw_Test {

    public static void main(String[] args) {

        Wheel wheel = new Wheel(16);
        Sreering sreering = new Sreering(12);
        CarBody carBody = new CarBody(1100);
        CarH carH = new CarH(carBody , wheel , sreering);
        System.out.println(carH);
        wheel.incDiameter();
        sreering.divDiameter();
        carBody.divWeight();
        System.out.println(carH);
    }
}
