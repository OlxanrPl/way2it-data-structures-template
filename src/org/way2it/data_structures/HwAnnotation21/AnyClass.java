package org.way2it.data_structures.HwAnnotation21;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*Створити власну анотацію, якою можна анотувати методи та поля класу, яка буде описана в JavaDoc
та використовуватися у Runtime. Анотація має мати 1 або більше параметрів.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@interface MyAnno {

  String str();

  int val();
}

public class AnyClass {

  @MyAnno(str = " Annotation AnnyClass", val = 12)
  public String strField = "";

  public static void anyMethod() {

  }

}
