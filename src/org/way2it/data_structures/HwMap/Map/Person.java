package org.way2it.data_structures.HwMap.Map;
/*
* Описати структуру коли людині належить акаунт та зробити можливість

додати акаунт до списку;
видалити акаунт для певної людини;
видалити людину;
показати всю мапу людей та їх акаунти.

Вважаємо, що людина - унікальний ключ, за значення value беремо Account

Map<Person, Account>
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Person {

  Map<String, Account> mapPerson = new HashMap<>();
  private String person;

  public Person() {
  }

  public Person(String person) {
    this.person = person;
  }

  public void setPerson(String person) {
    this.person = person;
  }

  public void addAccount(String person, String nikName, String email) {
    Account account = new Account(nikName, email);
    mapPerson.put(person, account);
  }

  public void deleteAccount(String person){
    mapPerson.put(person, null);
  }

  public void deletePerson(String person){
    mapPerson.remove(person);
  }

  public void printAll(){
    Set<Entry<String, Account>> entries = mapPerson.entrySet();
    for(Entry<String, Account> pair: entries)
    {
      String key = pair.getKey();
     Account value = pair.getValue();
      System.out.println(key + " --> " + value);
    }
  }

}
