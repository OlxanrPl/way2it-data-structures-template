package org.way2it.data_structures.hwMap.map;
/*Описати структуру коли людині належить акаунт та зробити можливість

додати акаунт до списку;
видалити акаунт для певної людини;
видалити людину;
показати всю мапу людей та їх акаунти.

Вважаємо, що людина - унікальний ключ, за значення value беремо Account

Map<Person, Account>
*/

public class Account {

  private String nikName;
  private String email;

  public Account() {
  }

  public Account(String nikName, String email) {
    this.nikName = nikName;
    this.email = email;
  }

  public void setNikName(String nikName) {
    this.nikName = nikName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Account{" +
        "nikName='" + nikName + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}

