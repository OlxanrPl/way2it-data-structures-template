package org.way2it.data_structures.hwMap.zooClub;

public class Animal {

  private String genus;
  private String name;

  public Animal(String genus, String name) {
    this.genus = genus;
    this.name = name;
  }

  public Animal() {

  }

  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "genus='" + genus + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
