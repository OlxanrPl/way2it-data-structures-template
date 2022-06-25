package org.way2it.data_structures.HwAnnotation21.Second;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/*Створити методи які дозволять конвертувати дату з
Date --> LocalDate.
Date --> LocalTime,
Date --> LocalDateTime
*/
public class DateClass {

  public static void main(String[] args) {

    Date date = new Date();
    toLocalDate(date);
    toLocalTime(date);
    toLocalDateTime(date);
  }

  private static void toLocalDateTime(Date date) {

    LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    System.out.println(ldt);
  }

  private static void toLocalTime(Date date) {

    LocalTime currentTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    System.out.println(currentTime);
  }

  private static void toLocalDate(Date date) {

    LocalDate current = LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    System.out.println(current);
  }


}
