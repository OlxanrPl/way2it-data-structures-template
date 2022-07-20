package org.way2it.data_structures.HW17Innerclasses;
/*
Створити класс CPU з внутрішніми классами Processor та RAM
У классах повинні бути такі поля:
- CPU: double price
- Processor: int cores, String manufacturer
- RAM: double memory, String manufacturer

Придумати методи для цих внутрішніх классів. У main створити і викликати їх методи
*/

public class CPU {

  double price;

  public CPU(double price) {
    this.price = price;
  }

  public static void main(String[] args) {
    CPU cpu1 = new CPU(250.20);
    Processor proc = cpu1.new Processor(4, "Intel");
    RAM ram = cpu1.new RAM(8.0, "Transcent");
    printCPU(cpu1, proc, ram);
    proc.coreDown();
    ram.setMemory(12.00);
    printCPU(cpu1, proc, ram);
  }

  private static void printCPU(CPU cpu1, Processor proc, RAM ram) {
    System.out.printf("Processor  %s core i %d, RAM %s %.2f Gb, price %.2f %n",
        proc.getManufacturer(),
        proc.getCores(), ram.getManufacturer(), ram.getMemory(), cpu1.getPrice());
  }

  @Override
  public String toString() {
    return "CPU{" +
        "price=" + price +
        '}';
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  private class Processor {

    int cores;
    String manufacturer;

    Processor(int cores, String manufacturer) {
      this.cores = cores;
      this.manufacturer = manufacturer;
    }

    int getCores() {
      return cores;
    }

    void setCores(int cores) {
      this.cores = cores;
    }

    void coreUp() {
      this.cores++;
    }

    void coreDown() {
      this.cores--;
    }

    String getManufacturer() {
      return manufacturer;
    }

    void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
    }
  }

  private class RAM {

    double memory;
    String manufacturer;

    RAM(double memory, String manufacturer) {
      this.memory = memory;
      this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
      return "RAM{" +
          "memory=" + memory +
          ", manufacturer='" + manufacturer + '\'' +
          '}';
    }

    double getMemory() {
      return memory;
    }

    void setMemory(double memory) {
      this.memory = memory;
    }

    String getManufacturer() {
      return manufacturer;
    }

    void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
    }
  }
}
