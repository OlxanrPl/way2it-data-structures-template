package org.way2it.data_structures.hwMap.zooClub;

public class TestZooClub {
  public static final String MENU =
      "     Make a choice \n Add a person to the club - 1 \n Add a pet to a person - 2 " +
          " \n Take away the animal from the person - 3 \n"
          + " Remove a person from the club - 4 \n Display a zoo club - 5 \n   Exit from program - 6 ";

  public static void main(String[] args) {
    ZooClubService zooClubService = new ZooClubService();
    System.out.println(MENU);
    zooClubService.menu();


  }

}
