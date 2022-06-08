package org.way2it.data_structures.HW_Bank;


public class Account<T> {

  protected T id;
  protected Double balance;


  public Account() {
  }

  public Account(T id, Double balance) {
    this.id = id;
    this.balance = balance;
  }

  public void deposit(Double balance) {
    this.balance += balance;
  }

  public void withdraw(Double balance) {
    this.balance -= balance;
  }

  public Double getBalance() {
    return balance;
  }

  @Override
  public String toString() {
    return "Account{" +
        "id=" + id +
        ", balance=" + balance +
        '}';
  }


}
