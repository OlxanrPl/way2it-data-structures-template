package org.way2it.data_structures.hwLambda;
/*Створити клас Person з полями вік, ім’я, timestamp. Зробити конструктор і включити в нього 2 поля
 вік та ім’я.Написати лямбда-функцію , яка для кожного елемента(елементом є користувач) ліста
 перевіряє вік, і повнолітніх заносить в інший ліст.Написати лямбда-функцію, яка для кожного
 елемента ліста(List<Person>) встановлює (setDate) поле поточна дата.Написати лямбда-функцію яка
 перебирає кожен елемент списку (List<String>) і записує в інший ліст довжини слів з першого списку.
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
  String name;
  Integer age;
  LocalDate  timestamp;

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", timestamp=" + timestamp +
        '}';
  }

  public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
  }

  public LocalDate getTimestamp() {
    return timestamp;
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

}
