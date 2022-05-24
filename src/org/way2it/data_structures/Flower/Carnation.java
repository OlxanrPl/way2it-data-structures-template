package org.way2it.data_structures.Flower;

public class Carnation extends Flower {
    public Carnation(String color , double price) {
        super(color , price);
    }

    @Override
    public String toString() {

        return this.getColor();
    }
}
