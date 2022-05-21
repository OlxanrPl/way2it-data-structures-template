package org.way2it.data_structures.Robots;

public class Robot {

    public Robot() {

    }
    public void work(){
        System.out.println("Я Robot - я посто працюю");
    }

    public static class CoffeRobot extends Robot {

        @Override
        public void work() {
            System.out.println("Я CoffeRobot - я варю каву");
        }
    }

    public static class RobotDancer extends Robot {

        @Override
        public void work() {
            System.out.println("Я RobotDancer - я просто танцюю");
        }
    }

    public static class RobotCoocker extends Robot {

        @Override
        public void work() {
            System.out.println("Я RobotCoocker - я просто готую");
        }
    }
}
