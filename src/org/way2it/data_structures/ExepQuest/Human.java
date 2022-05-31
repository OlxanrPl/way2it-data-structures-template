package org.way2it.data_structures.ExepQuest;

public class Human {
    public static final String UNDER_AGE = "You are under 18, sorry.";
    public static final String INCORRECT_EMAIL = "Incorrect email";
    private String name;
    private int age;
    private String email;


    public Human() {
    }

    static void UnderAgeException(int age) throws Exception {
        if(age < 18)
            throw new Exception(UNDER_AGE);
    }

    static void IncorrectEmailException(String email) throws Exception {
        if(email.lastIndexOf("@") < 0)
            throw new Exception(INCORRECT_EMAIL);
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
            UnderAgeException(age);
            this.age = age;
        } catch(Exception ex) {
            System.out.println(ex);
            throw ex;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        try {
            IncorrectEmailException(email);
            this.email = email;
        } catch(Exception ex) {
          System.out.println(ex);
            throw ex;

        }

    }
}
