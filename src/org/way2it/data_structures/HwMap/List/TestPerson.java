package org.way2it.data_structures.HwMap.List;
/*Описати структуру коли людині може належати список акаунтів та зробити можливість
додати людину до списку;
додати акаунт до списку;
видалити акаунт для певної людини;
видалити людину;
показати всю мапу людей та їх акаунти.

Вважаємо, що людина - унікальний ключ, за значення value беремо List<Account>

Map<Person, List<Account> >*/
public class TestPerson {

  public static void main(String[] args) {
    Person persons = new Person();
    persons.addAccount("Smith",25,"smitnik","Smit@email");
    persons.addAccount("Smith",25,"smitTo97","ToSmit@email");
    persons.addAccount("Barn",20,"Bar3","bar34@email");
    persons.addAccount("Alex",28,"Alex3","alexmail@email");
    persons.addAccount("Inga",18,"ing","ingababy@email");
    persons.printAll();
    persons.deleteAccount("Barn");
    System.out.println(" persons.deleteAccount(\"Barn\");");
    persons.printAll();
    persons.addAccount("Barn",20,"Ba23","bar34@email");
    System.out.println("  persons.addAccount(\"Barn\",\"Ba23\",\"bar34@email\")");
    persons.printAll();
    persons.deletePerson("Smith");
    System.out.println(" persons.deletePerson(\"Smith\")");
    persons.printAll();
  }

}
