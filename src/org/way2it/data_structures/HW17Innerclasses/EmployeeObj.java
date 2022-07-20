package org.way2it.data_structures.HW17Innerclasses;
/*Створити клас Employee, описати даний клас наступними полями: name, id, salary. Дані поля повинні
бути private. Описати getters and setters. Створити клас Methods де описати всього два методи
serialize() and deserealize().

4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.*/

import java.io.Serializable;

public class EmployeeObj implements Serializable {

  private static final long serialVersionUID = 1L;
  private String name;
  private int id;
  private Salary salary;

  public EmployeeObj(String name, int id,
      int salary, String curr) {
    this.name = name;
    this.id = id;
    this.salary = new Salary(salary, curr);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Salary getSalary() {
    return salary;
  }

  public void setSalary(int salary, String curr) {
    this.salary.salary = salary;
    this.salary.curr = curr;
  }

  @Override
  public String toString() {
    return "EmployeeObj{" +
        "name='" + name + '\'' +
        ", id=" + id +
        "," + salary.toString() +
        '}';
  }

  private class Salary implements Serializable {

    private int salary;
    private String curr;

    public Salary(int salary, String curr) {
      this.salary = salary;
      this.curr = curr;
    }

    public int getSalary() {
      return salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }

    public String getCurr() {
      return curr;
    }

    public void setCurr(String curr) {
      this.curr = curr;
    }

    @Override
    public String toString() {
      return "Salary{" +
          "salary=" + salary +
          ", curr='" + curr + '\'' +
          '}';
    }
  }
}
