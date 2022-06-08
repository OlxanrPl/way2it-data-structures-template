package org.way2it.data_structures.HwMap.ZooClub;
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
