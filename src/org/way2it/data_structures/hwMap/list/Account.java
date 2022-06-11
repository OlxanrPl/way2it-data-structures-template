package org.way2it.data_structures.hwMap.list;
/*Описати структуру коли людині може належати список акаунтів та зробити можливість
додати людину до списку;
додати акаунт до списку;
видалити акаунт для певної людини;
видалити людину;
показати всю мапу людей та їх акаунти.

Вважаємо, що людина - унікальний ключ, за значення value беремо List<Account>

Map<Person, List<Account> >
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

