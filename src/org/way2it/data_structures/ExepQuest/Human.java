package org.way2it.data_structures.ExepQuest;

public class Human {

  public static final String UNDER_AGE = "You are under 18, sorry.";
  public static final String INCORRECT_EMAIL = "Incorrect email";
  private String name;
  private int age;
  private String email;


  public Human() {
  }

  static void isUnderAge18(int age) throws Exception {
      if (age < 18) {
          throw new UnderAgeException(UNDER_AGE);
      }
  }

  static void isIncorrectEmail(String email) throws Exception {
      if (email.lastIndexOf("@") < 0) {
          throw new IncorrectEmailException(INCORRECT_EMAIL);
      }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) throws Exception {
    try {
      isUnderAge18(age);
      this.age = age;
    } catch (Exception ex) {
      System.out.println(ex);
      throw ex;
    }

  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) throws Exception {
    try {
      isIncorrectEmail(email);
      this.email = email;
    } catch (Exception ex) {
      System.out.println(ex);
      throw ex;

    }

  }
}
