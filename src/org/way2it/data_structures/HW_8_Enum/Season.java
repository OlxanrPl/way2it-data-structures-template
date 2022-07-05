package org.way2it.data_structures.HW_8_Enum;

public enum Season {
  WINTER,
  SPRING,
  SUMMER,
  AUTUMN;

  static {
    WINTER.next = SPRING;
    WINTER.prev = AUTUMN;
    SPRING.next = SUMMER;
    SPRING.prev = WINTER;
    SUMMER.next = AUTUMN;
    SUMMER.prev = SPRING;
    AUTUMN.next = WINTER;
    AUTUMN.prev = SUMMER;
  }

  Season() {
  }

  Season prev;

  Season next;

  public Season getPrev() {
    return prev;
  }

  public Season getNext() {
    return next;
  }
}
