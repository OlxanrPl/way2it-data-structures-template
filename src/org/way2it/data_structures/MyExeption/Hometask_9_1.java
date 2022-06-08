/*Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним.
Якщо користувач введе не ціле число, то повідомляти йому про помилку.*/
package org.way2it.data_structures.MyExeption;

import java.util.Scanner;

public class Hometask_9_1 {

  public static final String ENTER_NUMBER = "Enter an integer number. ";
  public static final String EVEN = "This number is even. ";
  public static final String NOT_EVEN = "This number is not even. ";
  public static final String INCORRECT_NUMBER = "Error!!! This number is not an integer.";
  static int num;

  public static void main(String[] args) {

    enterNumber();
      if (num % 2 == 0) {
          System.out.println(EVEN);
      } else {
          System.out.println(NOT_EVEN);
      }
  }

  private static void enterNumber() {

    Scanner sc = new Scanner(System.in);
    System.out.println(ENTER_NUMBER);

    try {
      num = sc.nextInt();
    } catch (Exception ex) {
      System.out.println(INCORRECT_NUMBER);
      enterNumber();
    }
  }

}
