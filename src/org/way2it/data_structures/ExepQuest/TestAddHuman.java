package org.way2it.data_structures.ExepQuest;
/*Створити клас Людина, дати властивості (ім’я, вік, емейл).

Створити свій кастомний Exception - 2 шт.

Перевіряти вік та емейл коистувача і відповідно кидати :
UnderAgeException - якщо людина має вік менше 18 років
IncorrectEmailException - якщо людина ввела електронну адресу і в ній немає символа ‘@’.
*/

import java.util.Scanner;

public class TestAddHuman {
    public static final String ENTER_NAME = "Enter your name or exit to log out";
    public static final String ENTER_AGE = "Enter your age ";
    public static final String ENTER_EMAIL = "Enter your email ";
    public static final String EXIT = "exit";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanService qDb = new HumanService();
        while(true) {
            Human human = new Human();
            System.out.println(ENTER_NAME);
            String inputName = sc.nextLine();
            if(EXIT.equalsIgnoreCase(inputName)) {
                break;
            }
            human.setName(inputName);
            System.out.println(ENTER_AGE);
            String inputAge = sc.nextLine();
            try {
                human.setAge(Integer.parseInt(inputAge));
            } catch(Exception ex) {
                continue;
            }
            System.out.println(ENTER_EMAIL);
            String inputEmail = sc.nextLine();
            try {
                human.setEmail(inputEmail);
            } catch(Exception ex) {
                continue;
            }
            qDb.setQuestDb(human);
        }

        System.out.println(qDb.toString());
    }

}

