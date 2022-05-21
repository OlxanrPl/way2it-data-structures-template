package org.way2it.data_structures.Rectangle;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length , int width) {

        this.length = length;
        this.width = width;

    }

    public int getLength() {

        return length;
    }

    public int getWidth() {

        return width;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public Rectangle() {

    }

    public int rectangleArea() {

        return length * width;

    }

    public int rectanglePerimeter() {

        return (length + width)*2;

    }

    public void printResult (){

        System.out.println("Площа прямокутника = " + rectangleArea() + " , Периметр прямокутника = " + rectanglePerimeter());
    }


}
