package org.way2it.data_structures.Flower;

import java.util.Arrays;
import java.util.List;

public class FlowerTest {

    public static void main(String[] args) {

        Double sum = 0.00;
        Rose rose = new Rose("Red" , 20.50);
        Peony peony = new Peony("Purpur" , 12.20);
        Chamomile chamomile = new Chamomile("White" , 10.00);
        Carnation carnation = new Carnation("Blue" , 17.00);
        List<Flower> bouquet = Arrays.asList(rose , peony , chamomile , carnation);
        for(Flower ibouquet: bouquet) {
            System.out.printf(ibouquet.getColor() + ", ");
            sum = sum + ibouquet.getPrice();
        }
        System.out.println(sum);


        Bouquet bouquet1 = new Bouquet();
        bouquet1.setBouquet(rose);
        bouquet1.setBouquet(rose);
        bouquet1.setBouquet(rose);
        bouquet1.setBouquet(peony);
        bouquet1.setBouquet(chamomile);
        System.out.println(bouquet1);
        System.out.println("Total - " + bouquet1.getPrice());
        System.out.println(bouquet1.getBouquet());
    }
}
