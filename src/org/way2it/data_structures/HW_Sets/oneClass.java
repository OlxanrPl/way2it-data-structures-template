package org.way2it.data_structures.HW_Sets;

public class oneClass  implements Comparable <oneClass>{
    private String name;
    private int age;

    public oneClass() {
    }

    public oneClass(String name , int codeId) {
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
    public int compareTo(oneClass o) {
        if (this.getAge()==(o.getAge())){
            return 0;
        }else if (this.getAge() >o.getAge()) {
            return 1;
        }else {
            return -1;
        }

    }
}
