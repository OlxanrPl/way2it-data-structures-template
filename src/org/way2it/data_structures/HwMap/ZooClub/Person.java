package org.way2it.data_structures.HwMap.ZooClub;

/*Створити структуру Зооклуб.
Створити клас Person , який описати двома полями : ім’я , вік.
Створити клас Animal , який описати двома полями : тип тваринки(кіт,пес), ім’я тваринки.
Кожна людина може мати багато тваринок. Але одна тваринка належить лише одній людині.

Map<Person, List<Animal>> map;

Реалізувати консольне меню(НЕ обов’язково), таким чином щоб можна було:

Додати людину до клубу
Додати тваринку до людини
Видалити(забрати) тваринку від людини
Видалити людину з клубу
Вивести на екран зооклуб
Вийти з програми

Використати для побудови меню Switch.
*/
public class Person {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
