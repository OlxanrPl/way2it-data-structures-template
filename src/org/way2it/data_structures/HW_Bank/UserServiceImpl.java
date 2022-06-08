package org.way2it.data_structures.HW_Bank;

/*Написати структуру Банк :
Створити клас Account, від нього унаслідувати різні типи акаунтів : DebitAccount(в нього поле Id є стрінговим), CreditAccount(в нього поле Id є числовим).
Створити клас User.
Створити параметризований інтерфейс - User service, який буде в якості параметрі приймати Account(та наслідників) та User і буде мати наступні методи :

показати всіх користувачів(посортованих по user name)
показати всі рахунки
повернути кількість податку для людини, яка розраховується як загальну суму на рахунку * 0,05*/

public class UserServiceImpl implements UserService, Comparable<UserServiceImpl> {

  User name;
  Account account;

  public UserServiceImpl(User name, Account account) {

    this.name = name;
    this.account = account;
  }

  @Override
  public String getAccount() {

    return account.toString();
  }

  @Override
  public double tax() {

    return this.account.getBalance() * 0.05;
  }

  @Override
  public String getUsers() {

    return name.getName();
  }


  @Override
  public int compareTo(UserServiceImpl o) {

    return getUsers().compareTo(o.getUsers());
  }
}
