package org.way2it.data_structures.Calculator.second;

import org.way2it.data_structures.Calculator.first.Numerable;

public class MyCalculator implements Numerable {

    double a;
    double b;

    public MyCalculator(double a , double b) {

        this.a = a;
        this.b = b;
    }

    public MyCalculator() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double division() {

        return this.a / this.b;
    }

    @Override
    public double minus() {

        return this.a - this.b;
    }

    @Override
    public double multiply() {

        return this.a * this.b;
    }

    @Override
    public double plus() {

        return this.a + this.b;
    }

    public void printRez(double rez) {

        System.out.println("Result operation - " + rez);

    }
}
