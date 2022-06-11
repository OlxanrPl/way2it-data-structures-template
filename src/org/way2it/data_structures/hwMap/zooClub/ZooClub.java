package org.way2it.data_structures.hwMap.zooClub;
/*Додати людину до клубу
Додати тваринку до людини
Видалити(забрати) тваринку від людини
Видалити людину з клубу
Вивести на екран зооклуб
Вийти з програми*/
public interface ZooClub {
  void addPerson();
  void addAnimal();
  void pickUpAnimal();
  void dismissPerson();
  void printAll();
  void exitFromZoo();


}
