package org.way2it.data_structures.Animal;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal = new Animal("Леопард" , 60 , 20);
        System.out.println(animal);
        animal.setName("Бик");
        animal.setSpeed(6);
        animal.setAge(45);
        System.out.println(animal);

    }


}
