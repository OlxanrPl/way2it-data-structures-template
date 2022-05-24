package org.way2it.data_structures.Flower;

public class Rose extends Flower{

    public Rose(String color , double price) {

        super(color , price);
    }

    @Override
    public String toString() {

        return this.getColor();
    }

}
