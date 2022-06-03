package org.way2it.data_structures.HW_Sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/*Створити клас (будь який), описати в ньому мінімум два поля, одне з яких String, інше числове (довільно яке).
Створити в мейн методі Set. Наповнити його об’єктами даного класу.
Вивести спершу невідсортований список, потім відсортований на консоль(використати Comparable для сортування за цими полями);
Спробувати зробити завдання з HashSet, LinkedHashSet та TreeSet .*/
public class Test_Hw_sets {

    public static void main(String[] args) {
       // Comparator<oneClass> poneClass = new oneClass().compareTo(o);
        HashSet<oneClass> hset = new HashSet<oneClass>();
        oneClass oneclass;
        hset.add(oneclass = new oneClass("Peet",23));
        hset.add(oneclass = new oneClass("Annet",19));
        hset.add(oneclass = new oneClass("Angela",18));
        hset.add(oneclass = new oneClass("Danny",20));
        hset.add(oneclass = new oneClass("Helga",21));

        for(oneClass ppl:hset
            ) {
            System.out.println("Name "+ppl.getName()+", age "+ppl.getAge());
        }


    }
}
