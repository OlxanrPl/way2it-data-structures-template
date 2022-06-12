package org.way2it.data_structures.hwStream;
/*Дана колекція клас People (з полями name - ім'я, age - вік, sex - стать)
Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)
Знайти середній вік серед чоловіків
Знайти кількість потенційно працездатних людей увибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)
Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
Знайти найстаршу людину
Знайти наймолодшу людину
Вивести скільки є чоловіків
Вивести скільки є жінок
Вивеcти всіх жінок в яких ім’я починається на “A”
*/

import java.util.ArrayList;
import java.util.Comparator;

public class Hometask {

  public static final String PRINT_PEOPLE = "Name - %s, age - %s, sex - %s  %n";

  public static void main(String[] args) {

    People people = new People("Piter", 21, "MAN");
    People people1 = new People("Anna", 18, "WOMEN");
    People people2 = new People("Bobbi", 61, "MAN");
    People people3 = new People("Inga", 56, "WOMEN");
    People people4 = new People("Smith", 19, "MAN");
    People people5 = new People("Anna", 15, "WOMEN");
    ArrayList<People> pl = new ArrayList<>() {{
      add(people);
      add(people1);
      add(people2);
      add(people3);
      add(people4);
      add(people5);
    }};
    System.out.println("Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)");
    pl.stream().filter(p -> p.sex.equals("MAN") && (p.age > 17 && p.age < 28))
        .forEach((e) -> System.out.printf(PRINT_PEOPLE, e.name, e.age, e.sex));
    System.out.println("Знайти середній вік серед чоловіків");
    System.out.println(pl.stream().filter(p -> p.sex.equals("MAN")).mapToInt(p -> p.age).average());
    System.out.println(
        "Знайти кількість потенційно працездатних людей увибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)");
    pl.stream().filter(p -> ((p.sex.equals("MAN") && (p.age > 17 && p.age < 61)) ||
            (p.sex.equals("WOMEN") && (p.age > 17 && p.age < 56))))
        .forEach(
            (e) -> System.out.printf(PRINT_PEOPLE, e.name, e.age, e.sex));
    System.out.println("Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку");
    pl.stream().sorted((o1, o2) -> -o2.compareTo(o1)).forEach(
        (e) -> System.out.printf(PRINT_PEOPLE, e.name, e.age, e.sex));
    System.out.println("Відсортувати колекцію людей спочатку за ім’ям, а потім за віком");
    pl.stream().sorted(Comparator.comparing(People::getName).thenComparing(People::getAge)).forEach(
        (e) -> System.out.printf(PRINT_PEOPLE, e.name, e.age, e.sex));
    System.out.println("Знайти найстаршу людину");
    System.out.println(
        pl.stream().sorted(Comparator.comparing(People::getAge)).skip(pl.size() - 1).findFirst());
    System.out.println("Вивести скільки є чоловіків");
    System.out.println(pl.stream().filter(e -> e.sex.equals("MAN")).count());
    System.out.println("Вивести скільки є жінок");
    System.out.println(pl.stream().filter(p -> p.sex.equals("WOMEN")).count());
    System.out.println("Вивеcти всіх жінок в яких ім’я починається на “A”");
    pl.stream().filter(p -> p.sex.equals("WOMEN") && p.name.indexOf("A") == 0).forEach(
        (e) -> System.out.printf(PRINT_PEOPLE, e.name, e.age, e.sex));
  }

}
