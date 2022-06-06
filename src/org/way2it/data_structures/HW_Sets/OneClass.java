package org.way2it.data_structures.HW_Sets;

public class OneClass implements Comparable <OneClass>{
    private String name;
    private int age;

    public OneClass() {
    }

    public OneClass(String name , int codeId) {
        this.name = name;
        this.age = codeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return   "Name=" + name + ", Age=" + age +  "\n";
    }


    @Override
    public int compareTo(OneClass o) {
        if (this.getAge()==(o.getAge())){
            return 0;
        }else if (this.getAge() >o.getAge()) {
            return -1;
        }else {
            return 1;
        }

    }
}
