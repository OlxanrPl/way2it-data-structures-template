package org.way2it.data_structures.hwLambda;
/*Створити клас Person з полями вік, ім’я, timestamp. Зробити конструктор і включити в нього 2 поля
 вік та ім’я.Написати лямбда-функцію , яка для кожного елемента(елементом є користувач) ліста
 перевіряє вік, і повнолітніх заносить в інший ліст.Написати лямбда-функцію, яка для кожного
 елемента ліста(List<Person>) встановлює (setDate) поле поточна дата.Написати лямбда-функцію яка
 перебирає кожен елемент списку (List<String>) і записує в інший ліст довжини слів з першого списку.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestPerson {


  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();
    Person person1 = new Person("Peeter", 23);
    Person person2 = new Person("Anna", 25);
    Person person3 = new Person("Bobi", 40);
    Person person4 = new Person("Ingard", 17);

    personList.add(person1);
    personList.add(person2);
    personList.add(person4);
    personList.add(person3);
    System.out.println(personList.toString());
    List<Person> personListCopy = personList.stream().filter(person -> person.age > 18).toList();
    System.out.println(personListCopy);
    personList.stream().peek(person -> person.setTimestamp(LocalDate.now()));
    System.out.println(personList.toString());
    List<String> listString = new ArrayList<>(
        Arrays.asList("Benny", "Returns", "surrogate", "if the index"));
    IntStream lengthPerson = listString.stream().mapToInt(String::length);
    System.out.println(listString);
    lengthPerson.forEach(System.out::println);
    System.out.println(personList.toString());
    personList.stream().map(p->p.name.toString()).forEach(System.out::println);
IntStream lengthPerson2 = personList.stream().mapToInt(p->p.name.length());
    lengthPerson2.forEach(System.out::println);
  }
}
