package org.way2it.data_structures.Сircle;

public class Circle {

    private Double radius;
    private Double diameter;


    public Circle() {

    }

    public void setRadius(Double radius) {

        this.radius = radius;
    }

    public void setDiameter(Double diameter) {

        this.diameter = diameter;
    }

    public double areaCircle (){

        return (Math.PI * (diameter*diameter))/4;
    }

    public double lengthCircle(){

       return Math.PI * 2*radius;
    }

    public void printResult (){

        System.out.printf("Площа кола = %s , Периметр кола = %s%n" , areaCircle() , lengthCircle());
    }
}