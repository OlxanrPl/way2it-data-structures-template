package org.way2it.data_structures.hwLambda;

import java.util.Optional;
/*Створити будь-який клас-модель.
Зробити Optional<Class-model>  використати методи з попередніх презентацій.
*/

public class TestOptional {

  public static void main(String[] args) {
    String name = "Bill";
    String emptyName = null;
    String addName = " Plus Optional";
    Optional<String> optionalName = Optional.of(name);
    System.out.println(optionalName.get());
    Optional<String> optionalEmptyName = Optional.ofNullable(emptyName);
    System.out.println(optionalEmptyName);
    Optional<String> optionalEmpty = Optional.empty();
    System.out.println(optionalEmpty);
    optionalEmptyName.ifPresent(n -> System.out.println(optionalEmptyName.get()));  // null
    optionalEmpty.ifPresent(n -> System.out.println(optionalEmpty.get()));
    optionalName.ifPresent(n -> System.out.println(optionalName.get()));
    System.out.println(optionalEmptyName.orElse("Empty Object!!"));
    System.out.println(optionalEmpty.orElseGet(() -> "Empty Object!! from Lambda"));
    //System.out.println(optionalEmpty.orElseThrow(()->new NullPointerException()));
    System.out.println(
        optionalEmptyName.map(d -> d.toLowerCase() + addName).orElseGet(() -> "OrElse his empty"));
    System.out.println(
        optionalName.map(d -> d.toLowerCase() + addName).orElseGet(() -> "OrElse his empty"));

  }

  public void whenCreatesEmptyOptional_thenCorrect() {
    Optional<String> empty = Optional.empty();

  }

}
