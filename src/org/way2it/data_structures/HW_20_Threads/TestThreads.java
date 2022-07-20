package org.way2it.data_structures.HW_20_Threads;
/*Створити потік. Створити клас MyThread наслідувати його від класу Thread. Перевизначити метод run(),
так щоб можна було вивести введену з консолі кількість чисел Фібоначі. Тобто ми вводимо з консолі
скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.

Створити потік. Створити клас RunnableThread імплементувати його від інтерфейсу Runnable.
 Метод run() перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку.
 Тобто Спершу ввели через Scanner скільки ми хочемо бачити чисел Фібоначі, потім з затримкою в 1
 секунду вивести їх від останнього до першого значення*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestThreads {

  static Integer fibonacciLan;

  static Integer fibonachi(Integer max) {

    if (max <= 2) {
      return 1;
    } else {
      return fibonachi(max - 1) + fibonachi(max - 2);
    }

  }

  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("Введіть кількість чисел фібоначчі");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    fibonacciLan = Integer.parseInt(br.readLine());
    br.close();
    Thread tr = new MyThread();
    tr.start();
    tr.join();
    System.out.println(" ");
    RunnableThread rThr = new RunnableThread();
    Thread thread = new Thread(rThr);
    thread.start();
  }

  private static class MyThread extends Thread {

    @Override
    public void run() {
      System.out.print("Звичайний порядок : ");
      for (int i = 1; i <= fibonacciLan; i++) {
        System.out.print(fibonachi(i) + " ");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    }
  }

  private static class RunnableThread implements Runnable {

    @Override
    public void run() {
      System.out.print("Зворотній порядок : ");
      for (int i = fibonacciLan; i >= 1; i--) {
        System.out.print(fibonachi(i) + " ");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }

    }
  }


}
