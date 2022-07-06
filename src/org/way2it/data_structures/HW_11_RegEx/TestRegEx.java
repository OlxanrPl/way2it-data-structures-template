package org.way2it.data_structures.HW_11_RegEx;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*1. Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.*/
/*2. Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com*/
/*3. Вхідним параметром є стрічка :
String str = "I love Java more than my friend. Java is so beautiful.";
перевірити чи є в стрічці слово “Java”;
замінити слово “Java” на “C#”;
замінити всі слова “Java” на “C#”;
*/
public class TestRegEx {

  final static String MENU = "Input any words.\n"
      + "Enter 'bye'  - to exit the program.\n";
  final static String WORD_ADD = "'%s' added to array.%n";
  final static String WORD_NOT_ADD = "'%s' not added to array!%n";
  final static String MENU_EMAIL = "Input any email.\n"
      + "Enter 'bye'  - to exit the program.\n";
  final static String FIND = "'Java' find in '%s'.%n";
  final static String NOT_FIND = "'Java' not find in '%s'!%n";

  public static void main(String[] args) {
    String str = "I love Java more than my friend. Java is so beautiful.";
    ArrayList<String> words = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    firstPoint(words, sc);
    onlyGmailPost(words, sc);
    words.forEach(System.out::println);
    testReplace(str);
  }

  private static void testReplace(String str) {
    Pattern pattern = Pattern.compile("Java");
    Matcher matcher = pattern.matcher(str);
    if (matcher.find()) {
      System.out.printf(FIND, str);
    } else {
      System.out.printf(NOT_FIND ,str);
    }
    System.out.println(matcher.replaceFirst("C#"));
    System.out.println(matcher.replaceAll("C#"));
  }

  private static void onlyGmailPost(ArrayList<String> words, Scanner sc) {
    System.out.println(MENU_EMAIL);
    while (true) {
      String inputWord = sc.nextLine();
      if (inputWord.equals("bye")) {
        return;
      }
      if (Pattern.matches(
          "^[a-z0-9]+(?!.*(?:\\+{2,}|\\-{2,}|\\.{2,}))(?:[\\.+\\-]{0,1}[a-z0-9])*@gmail\\.com$",
          inputWord)) {
        words.add(inputWord);
        System.out.printf(WORD_ADD, inputWord);
      } else {
        System.out.printf(WORD_NOT_ADD, inputWord);
      }

    }
  }

  private static void firstPoint(ArrayList<String> words, Scanner sc) {
    System.out.println(MENU);
    while (true) {
      String inputWord = sc.nextLine();
      if (inputWord.equals("bye")) {
        return;
      }
      if (Pattern.matches("^a.+", inputWord)) {
        words.add(inputWord);
        System.out.printf(WORD_ADD, inputWord);
      } else {
        System.out.printf(WORD_NOT_ADD, inputWord);
      }

    }
  }

}
