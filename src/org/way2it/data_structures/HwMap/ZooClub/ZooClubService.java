package org.way2it.data_structures.HwMap.ZooClub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


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
public class ZooClubService implements ZooClub {

  public static final String PUT_NAME = "Enter the person's name ";
  public static final String PUT_AGE = "Enter the person's age ";
  public static final String PUT_ANIMALS_NAME = "Enter the pet's name ";
  public static final String PUT_ANIMALS_GENUS = "Enter the pet's genus ";
  public static final String MENU =
      "     Make a choice \n Add a person to the club - 1 \n Add a pet to a person - 2 " +
          " \n Take away the animal from the person - 3 \n"
          + " Remove a person from the club - 4 \n Display a zoo club - 5 \n   Exit from program - 6 ";
  Map<Person, List<Animal>> mapZooClub = new HashMap<Person, List<Animal>>();
  Person person = new Person();
  Animal animal = new Animal();
  List<Animal> animalList = new ArrayList<>();

  public ZooClubService() {
  }

  public void menu() {

    System.out.println(MENU);
    Scanner sc = new Scanner(System.in);
    while (true) {
      switch (sc.next()) {
        case "1": {
          addPerson();
          break;
        }
        case "2": {
          addAnimal();
          break;
        }
        case "3": {
          pickUpAnimal();
          break;
        }
        case "4": {
          dismissPerson();
          break;
        }
        case "5": {
          printAll();
          break;
        }
        case "6": {
          exitFromZoo();
          break;
        }
      }
    }
  }

  @Override
  public void addPerson() {
    Scanner sc = new Scanner(System.in);
    System.out.println(PUT_NAME);
    String lName = sc.next();
    System.out.println(PUT_AGE);
    int lAge = sc.nextInt();
    mapZooClub.put(new Person(lName, lAge),
        new ArrayList<Animal>());
  }

  @Override
  public void addAnimal() {
    Scanner sc = new Scanner(System.in);
    System.out.println(PUT_NAME);
    String lNamePerson = sc.next();
    System.out.println(PUT_ANIMALS_GENUS);
    String lGenus = sc.next();
    System.out.println(PUT_ANIMALS_NAME);
    String lName = sc.next();
    if (mapZooClub.containsKey(searchPerson(lNamePerson))) {
      mapZooClub.get(searchPerson(lNamePerson)).add(new Animal(lGenus, lName));
    } else {
      System.out.println(PUT_AGE);
      int lAge = sc.nextInt();
      mapZooClub.put(new Person(lNamePerson, lAge), new ArrayList<Animal>(
          Collections.singleton(new Animal(lGenus, lName))));
    }
  }

  @Override
  public void pickUpAnimal() {
    Scanner sc = new Scanner(System.in);
    System.out.println(PUT_ANIMALS_NAME);
    String lName = sc.next();
    Iterator<Entry<Person, List<Animal>>> iterator = mapZooClub.entrySet().iterator();
    while (iterator.hasNext()) {
      Entry<Person, List<Animal>> next = iterator.next();
      List<Animal> nextAnimal = next.getValue();
      nextAnimal.removeIf(next2 -> next2.getName().equalsIgnoreCase(lName));
    }
  }

  @Override
  public void dismissPerson() {
    Scanner sc = new Scanner(System.in);
    System.out.println(PUT_NAME);
    String lNamePerson = sc.next();
    mapZooClub.remove(searchPerson(lNamePerson));
  }

  @Override
  public void printAll() {
    mapZooClub.forEach((k, v) -> System.out.println(k.toString() + " - " + v.toString()));

  }

  @Override
  public void exitFromZoo() {
    System.exit(0);
  }

  private Person searchPerson(String namePerson) {

    Iterator<Entry<Person, List<Animal>>> iterator = mapZooClub.entrySet().iterator();
    while (iterator.hasNext()) {
      Entry<Person, List<Animal>> next = iterator.next();
      if (next.getKey().getName().equals(namePerson)) {
        return next.getKey();

      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "ZooClubService{" +
        "mapZooClub=" + mapZooClub +
        ", person=" + person +
        ", animal=" + animal +
        ", animalList=" + animalList +
        '}';
  }
}
