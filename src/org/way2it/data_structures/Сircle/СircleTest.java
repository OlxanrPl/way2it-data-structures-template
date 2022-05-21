package org.way2it.data_structures.Сircle;

import org.way2it.data_structures.Rectangle.Rectangle;

import java.util.Scanner;

public class СircleTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle circleNew = new Circle();
        System.out.println("Enter the radius and diameter of the circle ");
        double radius = sc.nextDouble();
        double diameter = sc.nextDouble();
        circleNew.setDiameter(diameter);
        circleNew.setRadius(radius);
        circleNew.printResult();
    }
}
