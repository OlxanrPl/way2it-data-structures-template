package org.way2it.data_structures.HwMap.List;
/*
Описати структуру коли людині може належати список акаунтів та зробити можливість
додати людину до списку;
додати акаунт до списку;
видалити акаунт для певної людини;
видалити людину;
показати всю мапу людей та їх акаунти.

Вважаємо, що людина - унікальний ключ, за значення value беремо List<Account>

Map<Person, List<Account> >
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Person {

  List<Account> accountList = new ArrayList<>();
  Account account = new Account();
  Map<Person, List<Account>> mapPerson = new HashMap<>();

  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public void addAccount(String name, Integer age, String nikName, String email) {
    if (mapPerson.containsKey(new Person(name, age))) {
      Iterator<Entry<Person, List<Account>>> iterator = mapPerson.entrySet().iterator();
      while (iterator.hasNext()) {
        Entry<Person, List<Account>> next = iterator.next();
        if (next.getKey() == new Person(name, age)) {
          List<Account> tmpList = next.getValue();
          Account tmpAccount = new Account(nikName, email);
          if (tmpList == null) {
            tmpList = new ArrayList<Account>(Collections.singleton(tmpAccount));
          } else {
            tmpList.add(tmpAccount);

          }

          next.setValue(tmpList);
        }
      }
    } else {
      mapPerson.put(new Person(name, age), new ArrayList<Account>(
          Collections.singleton(new Account(nikName, email))));

    }

  }

  public void deleteAccount(String name) {
    mapPerson.put(seekPerson(name), null);
  }

  public void deletePerson(String name) {
    mapPerson.remove(seekPerson(name));
  }

  public void printAll() {
    Set<Entry<Person, List<Account>>> entries = this.mapPerson.entrySet();
    for (Entry<Person, List<Account>> pair : entries) {
      Person person = pair.getKey();
      List<Account> value = pair.getValue();
      System.out.println(person + " --> " + value);
    }
  }

  private Person seekPerson(String name) {
    Iterator<Entry<Person, List<Account>>> iterator = mapPerson.entrySet().iterator();
    while (iterator.hasNext()) {
      Entry<Person, List<Account>> next = iterator.next();
      if (next.getKey().name.equals(name)) {
        return next.getKey();

      }
    }
    return null;
  }

}
