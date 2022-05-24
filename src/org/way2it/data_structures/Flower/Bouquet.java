package org.way2it.data_structures.Flower;

import java.util.ArrayList;

public class Bouquet {

    private final ArrayList<Flower> bouquet = new ArrayList<Flower>();

    public Bouquet() {
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(Flower bouquete) {
        this.bouquet.add(bouquete);
    }

    @Override
    public String toString() {

        String sBouquet = "";
        for(int i = 0; i < bouquet.size(); i++) {
            sBouquet = sBouquet + " Flower - " + bouquet.get(i).getColor() + " price - " + bouquet.get(i).getPrice() + "\n";
        }
        return sBouquet;
    }

    public double getPrice() {

        double price = 0.00;
        for(Flower prc: bouquet) {
            price = price + prc.getPrice();
        }
        return price;
    }
}
