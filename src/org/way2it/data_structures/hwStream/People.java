package org.way2it.data_structures.hwStream;

import java.util.Comparator;

/*Дана колекція клас People (з полями name - ім'я, age - вік, sex - стать)*/
public class People implements Comparator<People> {
  String name;
  Integer age;
  String sex;

  public People(String name, Integer age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "People{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        '}';
  }


  @Override
  public int compare(People o1, People o2) {
    return o1.name.compareTo(o2.getName());

  }

  @Override
  public boolean equals(Object obj) {
    return false;
  }

  public int compareTo(People o2) {
    return o2.name.compareTo(name);
  }
}
