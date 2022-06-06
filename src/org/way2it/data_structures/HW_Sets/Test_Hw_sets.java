package org.way2it.data_structures.HW_Sets;

import java.util.*;

/*Створити клас (будь який), описати в ньому мінімум два поля, одне з яких String, інше числове (довільно яке).
Створити в мейн методі Set. Наповнити його об’єктами даного класу.
Вивести спершу невідсортований список, потім відсортований на консоль(використати Comparable для сортування за цими полями);
Спробувати зробити завдання з HashSet, LinkedHashSet та TreeSet .*/
public class Test_Hw_sets {

    public static void main(String[] args) {
        HashSet<OneClass> hset = new HashSet<OneClass>();
     
        hset.add (new OneClass("Peet",23));
        hset.add(new OneClass("Annet",19));
        hset.add(new OneClass("Angela",18));
        hset.add(new OneClass("Danny",20));
        hset.add(new OneClass("Helga",21));
        System.out.println("______ HashSet ________");
        for(OneClass ppl:hset
            ) {
            System.out.println("Name "+ppl.getName()+", age "+ppl.getAge());
        }
        System.out.println("______ TreeSet ________");
        TreeSet<OneClass> tset = new TreeSet<>();

        tset.add(new OneClass("Peet",23));
        tset.add(new OneClass("Annet",19));
        tset.add(new OneClass("Angela",18));
        tset.add(new OneClass("Danny",20));
        tset.add(new OneClass("Helga",21));

        for(OneClass ppl:tset
        ) {
            System.out.println("Name "+ppl.getName()+", age "+ppl.getAge());
        }
        System.out.println("_______LinkedHashSet_________");
        LinkedHashSet<OneClass> lhset =new LinkedHashSet<>();

        lhset.add(new OneClass("Peet",23));
        lhset.add(new OneClass("Annet",19));
        lhset.add(new OneClass("Angela",18));
        lhset.add(new OneClass("Danny",20));
        lhset.add(new OneClass("Helga",21));

        for(OneClass ppl:lhset
        ) {
            System.out.println("Name "+ppl.getName()+", age "+ppl.getAge());
        }

    }
}
