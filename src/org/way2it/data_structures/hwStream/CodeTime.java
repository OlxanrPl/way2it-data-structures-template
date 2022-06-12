package org.way2it.data_structures.hwStream;
/*Дана колекція стрічок : “One”, “Two”, “Three”, “Four”, “Five”, “One”.

Повернути кількість входжень об'єкта «One»
Повернути перший елемент колекції або 0, якщо колекція порожня
Повернути останній елемент колекції або «empty», якщо колекція порожня
Знайти елемент в колекції рівний «Three» або кинути помилку
Повернути третій елемент колекції по порядку
Повернути два елементи починаючи з другого
Вибрати всі елементи в яких є більше ніж 3 букви у слові
Повернути колекції без дублікатів
Знайти чи існують хоч один «One» елемент в колекції
Знайти чи є символ «o» у всіх елементів колекції
Додати "_1" до кожного елементу колекції
Відсортувати колекцію рядків за алфавітом і прибрати дублікати*/

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CodeTime {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>() {{
      add("One");
      add("Two");
      add("Three");
      add("Four");
      add("Five");
      add("One");
      add("Seven");
    }};
    ArrayList<String> alEmpty = new ArrayList<>();
    System.out.println("Повернути кількість входжень об'єкта «One»");
    System.out.println("One count - " + al.stream().filter(s -> s.equals("One")).count());
    System.out.println("Повернути перший елемент колекції або 0, якщо колекція порожня");
    System.out.println(al.stream().findFirst().orElseGet(() -> "0"));
    System.out.println(alEmpty.stream().findFirst().orElseGet(() -> "0"));
    System.out.println("Повернути останній елемент колекції або «empty», якщо колекція порожня");
    System.out.println(al.stream().skip(al.size() - 1).findFirst().orElseGet(() -> "empty"));
    System.out.println(alEmpty.stream().skip(al.size() - 1).findFirst().orElseGet(() -> "empty"));
    System.out.println("Знайти елемент в колекції рівний «Three» або кинути помилку");
    System.out.println("Three count - " + al.stream().filter(s -> s.equals("Three")).findFirst()
        .orElseThrow(() -> new NullPointerException()));
    System.out.println("Повернути третій елемент колекції по порядку");
    System.out.println("Third - " + al.stream().skip(2).findFirst().orElseGet(() -> "empty"));
    System.out.println("Повернути два елементи починаючи з другого");
    System.out.println("Повернути два елементи починаючи з другого");
    al.stream().skip(1).limit(2).forEach(System.out::println);
    System.out.println("Вибрати всі елементи в яких є більше ніж 3 букви у слові");
    al.stream().filter(e->e.length()>3).forEach(System.out::println);
    System.out.println("Повернути колекції без дублікатів");
    al.stream().distinct().forEach(System.out::println);
    System.out.println("Знайти чи існують хоч один «One» елемент в колекції");
    System.out.println(al.stream().anyMatch(e->e.equals("One")));
    System.out.println("Знайти чи є символ «o» у всіх елементів колекції");
    System.out.println(al.stream().allMatch(e->e.toLowerCase().equals("o")));
    System.out.println("Додати \"_1\" до кожного елементу колекції");
    al.stream().map(e->e+"_1").forEach(System.out::println);
    System.out.println("Відсортувати колекцію рядків за алфавітом і прибрати дублікати");
    al.stream().distinct().sorted().forEach(System.out::println);

  }


}
