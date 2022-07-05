package org.way2it.data_structures.HW_8_Enum;

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

  final static String MONTHEXIST = "Такий місяць існує ";
  final static String MONTHNOTEXIST = "Такий місяць відсутній ";
  final static String DAYPAR = "Прана кількість днів ";
  final static String DAYNOTPAR = "Не парана кількість днів";
  final int days;
  final Season season;

  Months(int days, Season season) {
    this.days = days;
    this.season = season;
  }

  private static List<Months> asList() {
    return List.of(values());
  }

  public static void isMonth(String month) {
    if (asList().stream().anyMatch(e -> e.name().equals(month))) {

      System.out.println(MONTHEXIST);
    } else {
      System.out.println(MONTHNOTEXIST);
    }
  }

  public static void thisSeasons(String month) {
    var montIs = Months.valueOf(month);
    asList().stream().filter(e -> e.season.equals(montIs.season))
        .forEach((e) -> System.out.println(e.name()));
  }

  public static void equalsDays(String month) {
    var montIs = Months.valueOf(month);
    asList().stream().filter(e -> e.days == montIs.days)
        .forEach((e) -> System.out.println(e.name() + " " + e.getDays()));
  }

  public static void beforeDays(String month) {
    var montIs = Months.valueOf(month);
    var monthExist = asList().stream().anyMatch(e -> e.days < montIs.days);
    if (monthExist) {
      asList().stream().filter(e -> e.days < montIs.days)
          .forEach(e -> System.out.println(e.name() + " " + e.getDays()));
    } else {
      System.out.println(MONTHNOTEXIST);

    }

  }

  public static void afterDays(String month) {
    var montIs = Months.valueOf(month);
    var monthExist = asList().stream().anyMatch(e -> e.days > montIs.days);

    if (monthExist) {
      asList().stream().filter(e -> e.days > montIs.days)
          .forEach(e -> System.out.println(e.name() + " " + e.getDays()));
    } else {
      System.out.println(MONTHNOTEXIST);

    }


  }

 /* public static void nextSeason(String month) {

    int index = Season.valueOf(String.valueOf(Months.valueOf(month).getSeason())).ordinal();
    Season nextSeason = Season.values()[index + 1 > 3 ? 0 : index + 1];
    System.out.println(nextSeason.name());

  }*/

  /* public static void preSeason(String month) {

     int index = Season.valueOf(String.valueOf(Months.valueOf(month).getSeason())).ordinal();
     Season nextSeason = Season.values()[index - 1 < 0 ? 3 : index - 1];
     System.out.println(nextSeason.name());

   }*/
  public static void nextSeasonNext(String month) {

    System.out.println(Months.valueOf(month).getSeason().getNext());
  }

  public static void preSeasonPrev(String month) {

    System.out.println(Months.valueOf(month).getSeason().getPrev());
  }

  public static void getParDays() {

    asList().stream().filter(e -> e.days % 2 == 0)
        .forEach((e) -> System.out.println(e.name() + " " + e.getDays()));
  }

  public static void getNotParDays() {

    asList().stream().filter(e -> e.days % 2 != 0)
        .forEach((e) -> System.out.println(e.name() + " " + e.getDays()));
  }

  public static void isParDays(String month) {
    var montIs = Months.valueOf(month).getDays();
    if (montIs % 2 == 0) {
      System.out.println(DAYPAR);
    } else {
      System.out.println(DAYNOTPAR);
    }
  }

  public int getDays() {
    return days;
  }

  public Season getSeason() {
    return season;
  }
}
