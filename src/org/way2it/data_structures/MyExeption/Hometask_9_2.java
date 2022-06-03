/*Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.*/
package org.way2it.data_structures.MyExeption;

import java.util.Scanner;

public class Hometask_9_2 {

    public static final String ENTER_NUMBER = "Enter an integer number. ";
    public static final String SUMMA = " %d + %d = %d";
    public static final String INCORRECT_NUMBER = "Error!!! This number is not an integer.";
    static int numA;
    static int numB;
    static int num;

    public static void main(String[] args) {
        numA = enterNumber();
        numB = enterNumber();
        int sumAB = numA + numB;
        System.out.printf(SUMMA , numA , numB , sumAB);
    }

    private static int enterNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_NUMBER);

        try {
            num = sc.nextInt();
        } catch(Exception ex) {
            System.out.println(INCORRECT_NUMBER);
            enterNumber();
        }
        return num;
    }

}
