package org.way2it.data_structures.HW_16_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*Створити довільний клас , описати його. Створити в мейн його екземпляр, дослідити всю інформацію про нього :
- отримати всі методи (private в тому числі);
- отримати поля класу (private в тому числі);
- отримати всі конструктори;
- створити екземпляр класу з двох різних конструкторів;
- викликати 2 методи (один - з параметрами, другий - без параметрів).*/

public class TestReflection {

  public static void main(String[] args) {

    TestClass secClass = null;
    try {
      Class<?> testsClass = Class.forName("org.way2it.data_structures.HW_16_reflection.TestClass");
      printMeta(testsClass);
      fieldsMetodsTest();
      constructTest();
    } catch (Exception e) {
      System.out.println("Exception - " + e);
    }
  }

  private static void printMeta(Class<?> testsClass) {

    Method metods[] = testsClass.getDeclaredMethods();
    System.out.println("Print all methods");
    Arrays.stream(metods).forEach(System.out::println);

    Field field[] = testsClass.getDeclaredFields();
    System.out.println("Print all fields ");
    Arrays.stream(field).forEach(System.out::println);

    Constructor cnstr[] = testsClass.getDeclaredConstructors();
    System.out.println("Print all constructors ");
    Arrays.stream(cnstr).forEach(System.out::println);
  }

  private static void fieldsMetodsTest()

      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
    TestClass firstClass = new TestClass();
    Method privateMethod = TestClass.class.getDeclaredMethod("PrintName");
    privateMethod.setAccessible(true);
    privateMethod.invoke(firstClass);
    System.out.println("Initialisation field name");
    firstClass.setNumber(28);
    Field field1 = firstClass.getClass().getDeclaredField("name");
    field1.setAccessible(true);

    field1.set(firstClass, (String) " From reflection - August");
    privateMethod.invoke(firstClass);
  }

  private static void constructTest() {

    TestClass secClass;
    System.out.println("Construction with parameters");

    try {
      Class claz = Class.forName(TestClass.class.getName());
      Class[] params = {Integer.class, String.class};
      secClass = (TestClass) claz.getConstructor(params).newInstance(23, "September");
      Method print = TestClass.class.getDeclaredMethod("PrintName");
      print.setAccessible(true);
      print.invoke(secClass);
      System.out.println("Reflection method with parameter");
      Method gtName = claz.getDeclaredMethod("setName", new Class[]{String.class});
      gtName.setAccessible(true);
      gtName.invoke(secClass, "October");

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }


}
