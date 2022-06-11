package org.way2it.data_structures.hwMap.zooClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
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
  public static final String ERROR_PERSON_NOT_FOUND = "\n Error! Person -  %s not found ";

  Map<Person, List<Animal>> mapZooClub = new HashMap<Person, List<Animal>>();
  Person person;
  Animal animal;
  List<Animal> animalList;

  public ZooClubService() {
  }

  public void menu() {


    Scanner sc = new Scanner(System.in);
    String sCase = sc.next();
    caseMenu(sCase);
  }

  private void caseMenu(String sCase) {
    while (true) {
      switch (sCase) {
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
    putPerson(lName, lAge, new ArrayList<Animal>());
    menu();
  }

  private void putPerson(String lName, int lAge, ArrayList<Animal> value) {
    mapZooClub.put(new Person(lName, lAge),
        value);
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
    putAnimal(sc, lNamePerson, lGenus, lName);
    menu();
  }

  private void putAnimal(Scanner sc, String lNamePerson, String lGenus, String lName) {
    if (mapZooClub.containsKey(searchPerson(lNamePerson))) {
      mapZooClub.get(searchPerson(lNamePerson)).add(new Animal(lGenus, lName));
    } else {
      System.out.println(PUT_AGE);
      int lAge = sc.nextInt();
      putPerson(lNamePerson, lAge, new ArrayList<Animal>());
      putAnimal(sc, lNamePerson, lGenus, lName);
    }

  }

  @Override
  public void pickUpAnimal() {
    Scanner sc = new Scanner(System.in);
    System.out.println(PUT_ANIMALS_NAME);
    String lName = sc.next();
    removeAnimal(lName);
    menu();
  }

  private void removeAnimal(String lName) {
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
    menu();
  }

  @Override
  public void exitFromZoo() {
    System.exit(0);
  }

  private Person searchPerson(String namePerson) {
    Optional<Entry<Person, List<Animal>>> personS = mapZooClub.entrySet().stream()
        .filter(next -> next.getKey().getName().equals(namePerson))
        .findFirst();
        if (personS.isPresent()){
          return personS.get().getKey();
        }else{
          System.out.printf(ERROR_PERSON_NOT_FOUND,namePerson);
         menu();

        }
        return person;
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
