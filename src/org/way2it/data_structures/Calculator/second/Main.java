package org.way2it.data_structures.Calculator.second;

public class Main {

    public static void main(String[] args) {

        MyCalculator mcalc = new MyCalculator(8.50 , 4.25);
        mcalc.printRez(mcalc.division());
        mcalc.printRez(mcalc.plus());
        mcalc.printRez(mcalc.minus());
        mcalc.printRez(mcalc.multiply());
    }
}
