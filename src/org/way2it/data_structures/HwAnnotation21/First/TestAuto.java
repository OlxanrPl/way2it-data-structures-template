package org.way2it.data_structures.HwAnnotation21.First;
/*1.Створити власну анотацію, яка буде приймати хоча б один параметр. Створити клас із певними
полями і над декількома полями написати власну анотацію.
Створити метод який буде записувати поля класу які промарковані анотацією в файл(рефлексія).
*/

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TestAuto {

  public static void main(String[] args) throws IOException {
    ArrayList<String> annoList = new ArrayList<String>();
    Field[] fieldAuto = Auto.class.getDeclaredFields();
    for (Field fa : fieldAuto) {
      if (fa.getAnnotation(FirstAnno.class) instanceof FirstAnno) {
        annoList.add(fa.getType().getSimpleName() + " " + fa.getName() + " - " + fa.getAnnotation(
            FirstAnno.class).value());

      }
    }
    for (String aLst : annoList) {
      System.out.println(aLst);
    }

    Path file = Paths.get("AutoOut.txt");
    Files.write(file, annoList);
  }

}
