package org.way2it.data_structures.HW_Bank;

import java.util.TreeSet;

/*Написати структуру Банк :
Створити клас Account, від нього унаслідувати різні типи акаунтів : DebitAccount(в нього поле Id є стрінговим), CreditAccount(в нього поле Id є числовим).
Створити клас User.
Створити параметризований інтерфейс - User service, який буде в якості параметрі приймати Account(та наслідників) та User і буде мати наступні методи :

показати всіх користувачів(посортованих по user name)
показати всі рахунки
повернути кількість податку для людини, яка розраховується як загальну суму на рахунку * 0,05*/
public class TestBank {

  public static void main(String[] args) {

    TreeSet<UserServiceImpl> tsBank = new TreeSet<>();
    tsBank.add(new UserServiceImpl(new User("Somith"), new DebitAccount("db235", 210000.00)));
    tsBank.add(new UserServiceImpl(new User("Smith"), new DebitAccount("db452", 310000.00)));
    tsBank.add(new UserServiceImpl(new User("Piter"), new DebitAccount("db1223", 150000.00)));
    tsBank.add(new UserServiceImpl(new User("Albert"), new CreditAccount(123, 2000.00)));
    tsBank.add(new UserServiceImpl(new User("Smith"), new CreditAccount(129, 1000.00)));
    for (UserServiceImpl iBank : tsBank) {
      System.out.println(iBank.getUsers() + " " + iBank.getAccount() + " tax " + iBank.tax());
    }

  }

}
