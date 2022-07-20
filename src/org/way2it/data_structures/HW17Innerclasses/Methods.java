package org.way2it.data_structures.HW17Innerclasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Methods {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Employee emp1 = new Employee("Maxx", 123, 500);
    serialize(emp1);
    System.out.println(deserealize().toString());

    ArrayList<Employee> empList = new ArrayList<>();
    empList.add(new Employee("Vaser", 123, 500));
    empList.add(new Employee("Anna", 584, 540));
    empList.add(new Employee("Genk", 007, 1200));
    serializeArrayList(empList);
    deserliseArrayList().forEach(System.out::println);
    EmployeeObj emplObj = new EmployeeObj("DjBobo", 002, 1000, "USD");
    emplObj.setSalary(1200, "EUR");
    serialize(emplObj);
    System.out.println(deserealizeObj().toString());
  }

  private static ArrayList<Employee> deserliseArrayList()
      throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("outListEmployee.txt"));
    ArrayList<Employee> desEmpList = (ArrayList<Employee>) ois.readObject();
    ois.close();
    System.out.println("Arraylist was Deserialize");
    return desEmpList;
  }

  private static void serializeArrayList(ArrayList<Employee> empList) throws IOException {
    ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("outListEmployee.txt"));
    ous.writeObject(empList);
    ous.close();
    System.out.println("Arraylist was serialize");
  }

  public static void serialize(Object o) throws IOException {
    FileOutputStream fos = new FileOutputStream("outEmployee.txt");
    ObjectOutputStream ost = new ObjectOutputStream(fos);
    ost.writeObject(o);
    ost.close();
    fos.close();
    System.out.println("Object was serialized!");
  }

  public static Object deserealize() throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("outEmployee.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Employee o = (Employee) ois.readObject();
    ois.close();
    fis.close();
    System.out.println("Employee was Deserialized!");
    return o;
  }

  public static Object deserealizeObj() throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("outEmployee.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    EmployeeObj o = (EmployeeObj) ois.readObject();
    ois.close();
    fis.close();
    System.out.println("EmployeeObj was Deserialized!");
    return o;
  }

}
