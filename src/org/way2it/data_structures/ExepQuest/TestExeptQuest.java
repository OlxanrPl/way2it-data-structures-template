package org.way2it.data_structures.ExepQuest;


import java.util.Scanner;

public class TestExeptQuest {
    public static final String ENTER_NAME = "Enter your name or exit to log out";
    public static final String ENTER_AGE = "Enter your age ";
    public static final String ENTER_EMAIL = "Enter your email ";
    public static final String EXIT = "exit";
    public static final String UNDER_AGE = "You are under 18, sorry.";
    public static final String INCORRECT_EMAIL = "Incorrect email";

    static void UnderAgeException(int age) throws Exception {
        if(age < 18)
            throw new Exception(UNDER_AGE);
    }

    static void IncorrectEmailException(String email) throws Exception {
        if(email.lastIndexOf("@") < 0)
            throw new Exception(INCORRECT_EMAIL);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionnaireDatabase qDb = new QuestionnaireDatabase();
        while(true) {
            Human human = new Human();
            System.out.println(ENTER_NAME);
            String inputName = sc.nextLine();
            if(inputName.toLowerCase().equals(EXIT)) {
                break;
            }
            human.setName(inputName);

            System.out.println(ENTER_AGE);
            String inputAge = sc.nextLine();
            try {
                UnderAgeException(Integer.parseInt(inputAge));
                human.setAge(Integer.parseInt(inputAge));
            } catch(Exception e) {
                System.out.println(e);
                continue;
            }

            System.out.println(ENTER_EMAIL);
            String inputEmail = sc.nextLine();
            try {
                IncorrectEmailException(inputEmail);
                human.setEmail(inputEmail);
            } catch(Exception e) {
                System.out.println(e);
                continue;
            }

          qDb.setQuestDb(human);
        }


        System.out.println(qDb.toString());
    }

}

