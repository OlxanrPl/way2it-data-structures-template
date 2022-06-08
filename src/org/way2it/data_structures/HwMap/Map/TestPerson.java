package org.way2it.data_structures.HwMap.Map;

public class TestPerson {

  public static void main(String[] args) {
    Person persons = new Person();
    persons.addAccount("Smith","smit97","Smit@email");
    persons.addAccount("Barn","Bar3","bar34@email");
    persons.addAccount("Alex","Alex3","alexmail@email");
    persons.addAccount("Inga","ing","ingababy@email");
    persons.printAll();
    persons.deleteAccount("Barn");
    System.out.println(" persons.deleteAccount(\"Barn\");");
    persons.printAll();
    persons.addAccount("Barn","Ba23","bar34@email");
    System.out.println("  persons.addAccount(\"Barn\",\"Ba23\",\"bar34@email\")");
    persons.printAll();
    persons.deletePerson("Smith");
    System.out.println(" persons.deletePerson(\"Smith\")");
    persons.printAll();
  }

}
