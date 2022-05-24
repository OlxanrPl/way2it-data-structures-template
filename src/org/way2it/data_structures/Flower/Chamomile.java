package org.way2it.data_structures.Flower;

public class Chamomile extends Flower{
    public Chamomile(String color , double price) {
        super(color , price);
    }
    @Override
    public String toString() {

        return this.getColor();
    }
}
