package org.way2it.data_structures.Flower;

public class Peony extends Flower {

    public Peony(String color , double price) {

        super(color , price);
    }

    @Override
    public String toString() {

        return this.getColor();
    }
}
