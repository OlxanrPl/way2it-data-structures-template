package org.way2it.data_structures.hwLambda;
/*Створіть функціональний інтерфейс із методом, який приймає три значення int та повертає значення int.
Створіть лямбда-функції (як змінні в основному методі), що реалізує цей інтерфейс:
Перша лямбда повертає максимальне значення
Друга - середнє значення
Третя - суму всіх трьох значень
Викликати ці лямбди.
*/

public class Hometask {

  public static void main(String[] args) {
    CalcFunc maxNumber = (v, k, p) -> Math.max(Math.max(v, k), p);
    CalcFunc avgNumber = ((v, k, p) -> (v + k + p) / 3);
    CalcFunc sumNumber = ((v, k, p) -> v + k + p);

    System.out.println("Max - "+maxNumber.func(5,9,2));
    System.out.println("Avenger - "+avgNumber.func(5,9,2));
    System.out.println("Summa - "+sumNumber.func(5,9,2));
  }


  interface CalcFunc {

    int func(int v, int k, int p);
  }

}
