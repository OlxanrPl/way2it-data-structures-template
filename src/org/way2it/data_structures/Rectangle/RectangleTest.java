package org.way2it.data_structures.Rectangle;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle(4 , 6);
        rect.printResult();
        rect = new Rectangle();
        System.out.println("Enter the length and width of the rectangle ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        rect.setLength(length);
        rect.setWidth(width);
        rect.printResult();

    }
}
