package org.way2it.data_structures.Animal;

public class Animal {

    private String name;
    private Integer speed;
    private Integer age;

    public Animal(String name , Integer speed , Integer age) {

        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {

        this.speed = speed;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    @Override
    public String toString() {

        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}
