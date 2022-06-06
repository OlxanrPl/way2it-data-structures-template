package org.way2it.data_structures.HW_Bank;

/*Написати структуру Банк :
Створити клас Account, від нього унаслідувати різні типи акаунтів : DebitAccount(в нього поле Id є стрінговим), CreditAccount(в нього поле Id є числовим).
Створити клас User.
Створити параметризований інтерфейс - User service, який буде в якості параметрі приймати Account(та наслідників) та User і буде мати наступні методи :

показати всіх користувачів(посортованих по user name)
показати всі рахунки
повернути кількість податку для людини, яка розраховується як загальну суму на рахунку * 0,05*/

public interface UserService<T extends Account, R extends User> {

    String getUsers();

    String getAccount();

    double Tax();


}
