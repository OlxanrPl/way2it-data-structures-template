package org.way2it.data_structures.Flower;

public class Flower {
    private String color;
    private double price;

    public Flower(String color , double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
