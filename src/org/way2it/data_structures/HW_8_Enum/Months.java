package org.way2it.data_structures.HW_8_Enum;

import java.util.Arrays;
import java.util.List;

public enum Months {
  JANUARY(31, Season.WINTER),
  FEBRUARY(28, Season.WINTER),
  MARCH(31, Season.SPRING),
  APRIL(30, Season.SPRING),
  MAY(31, Season.SPRING),
  JUNE(30, Season.SUMMER),
  JULY(31, Season.SUMMER),
  AUGUST(31, Season.SUMMER),
  SEPTEMBER(30, Season.AUTUMN),
  OCTOBER(31, Season.AUTUMN),
  NOVEMBER(30, Season.AUTUMN),
  DECEMBER(31, Season.WINTER);

  final static String MONTH_EXIST = "Такий місяць існує ";
  final static String MONTH_NOT_EXIST = "Такий місяць відсутній ";
  final static String DAY_PAR = "Прана кількість днів ";
  final static String DAY_NOT_PAR = "Не парана кількість днів";
  final int days;
  final Season season;

  Months(int days, Season season) {
    this.days = days;
    this.season = season;
  }

  private static List<Months> asList() {
    return List.of(values());
  }

  public static void isMonthExist(String month) {
    if (asList().stream().anyMatch(e -> e.name().equals(month))) {

      System.out.println(MONTH_EXIST);
    } else {
      System.out.println(MONTH_NOT_EXIST);
    }
  }

  public static void printThisSeasons(String month) {
    var montIs = Months.valueOf(month);
    asList().stream().filter(e -> e.season.equals(montIs.season))
        .forEach((e) -> System.out.println(e.name()));
  }

  public static void printEqualsDays(String month) {
    var montIs = Months.valueOf(month);
    asList().stream().filter(e -> e.days == montIs.days)
        .forEach((e) -> System.out.println(e.name() + " " + e.getDays()));
  }

  public static void printBeforeDays(String month) {
    var montIs = Months.valueOf(month);
    var monthExist = asList().stream().anyMatch(e -> e.days < montIs.days);
    if (monthExist) {
      asList().stream().filter(e -> e.days < montIs.days)
          .forEach(e -> System.out.println(e.name() + " " + e.getDays()));
    } else {
      System.out.println(MONTH_NOT_EXIST);

    }

  }

  public static void printAfterDays(String month) {
    var montIs = Months.valueOf(month);
    var monthExist = asList().stream().anyMatch(e -> e.days > montIs.days);

    if (monthExist) {
      asList().stream().filter(e -> e.days > montIs.days)
          .forEach(e -> System.out.println(e.name() + " " + e.getDays()));
    } else {
      System.out.println(MONTH_NOT_EXIST);

    }


  }

  public static void printNextSeason(String month) {

    int index = Season.valueOf(String.valueOf(Months.valueOf(month).getSeason())).ordinal();
    Season nextSeason = Season.values()[index + 1 > Arrays.stream(Season.values()).count()-1 ? 0 : index + 1];
    System.out.println(nextSeason.name());

  }

   public static void printPreSeason(String month) {

     int index = Season.valueOf(String.valueOf(Months.valueOf(month).getSeason())).ordinal();
     Season nextSeason = Season.values()[index - 1 < 0 ? ((int)Arrays.stream(Season.values()).count()-1) : index - 1];
     System.out.println(nextSeason.name());

   }
 /* public static void printNextSeasonNext(String month) {

    System.out.println(Months.valueOf(month).getSeason().getNext());
  }

  public static void printPreSeasonPrev(String month) {

    System.out.println(Months.valueOf(month).getSeason().getPrev());
  }*/

  public static void printParDays() {

    asList().stream().filter(e -> e.days % 2 == 0)
        .forEach((e) -> System.out.println(e.name() + " " + e.getDays()));
  }

  public static void printNotParDays() {

    asList().stream().filter(e -> e.days % 2 != 0)
        .forEach((e) -> System.out.println(e.name() + " " + e.getDays()));
  }

  public static void isParDays(String month) {
    var montIs = Months.valueOf(month).getDays();
    if (montIs % 2 == 0) {
      System.out.println(DAY_PAR);
    } else {
      System.out.println(DAY_NOT_PAR);
    }
  }

  public int getDays() {
    return days;
  }

  public Season getSeason() {
    return season;
  }
}
