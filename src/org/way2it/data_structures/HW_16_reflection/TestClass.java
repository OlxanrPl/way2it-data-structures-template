package org.way2it.data_structures.HW_16_reflection;

public class TestClass {
  private Integer number;
  private String name;

 public TestClass(Integer number, String name) {
    this.number = number;
    this.name = name;
  }
  public TestClass() {

  }

  public Integer getNumber() {
    return number;
  }

  private String getName() {
    return name;
  }

public void setNumber(Integer number) {
    this.number = number;

  }

 private void setName(String name) {
    this.name = name;
   System.out.println("Month - -"+ this.name);
  }

  private void PrintName() {
    System.out.println("Month is " + name + ", day - "+number);
  }
}
