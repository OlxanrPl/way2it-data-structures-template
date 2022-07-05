package org.way2it.data_structures.HW_8_Enum;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Services {

  final static String MENU = "1 - Перевірити чи є такий місяць .\n"
      + "2 - Вивести всі місяці з такою ж порою року.\n"
      + "3 - Вивести всі місяці які мають таку саму кількість днів.\n"
      + "4 - Вивести на екран всі місяці які мають меншу кількість днів.\n"
      + "5 - Вивести на екран всі місяці які мають більшу кількість днів.\n"
      + "6 - Вивести на екран наступну пору року.\n"
      + "7 - Вивести на екран попередню пору року.\n"
      + "8 - Вивести на екран всі місяці які мають парну кількість днів.\n"
      + "9 - Вивести на екран всі місяці які мають непарну кількість днів.\n"
      + "10 - Вивести на екран чи введений з консолі місяць має парну кількість днів.\n"
      + "11 - Вийти з программи";
  final static String ENTER_MONTH = "Введіть назву місяця ";

  public static void main(String[] args) {
    String month;
    System.out.println(ENTER_MONTH);
    Scanner sc = new Scanner(System.in);
    month = sc.nextLine().toUpperCase(Locale.ROOT);
    System.out.println(MENU);
    try {
      while (true)
      switch (sc.nextInt()) {
        case 1:
          Months.isMonth(month);
          break;
        case 2:
          Months.thisSeasons(month);
          break;
        case 3:
          Months.equalsDays(month);
          break;
        case 4:
          Months.beforeDays(month);
          break;
        case 5:
          Months.afterDays(month);
          break;
        case 6:
          Months.nextSeasonNext(month);
          break;
        case 7:
          Months.preSeasonPrev(month);
          break;
        case 8:
          Months.getParDays();
          break;
        case 9:
          Months.getNotParDays();
          break;
        case 10:
          Months.isParDays(month);
          break;

        case 11:

          System. exit(0);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }


  }

}
