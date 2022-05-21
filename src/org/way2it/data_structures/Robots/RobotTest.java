package org.way2it.data_structures.Robots;

import java.util.Arrays;
import java.util.List;

public class RobotTest {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Robot.CoffeRobot cofferrobot = new Robot.CoffeRobot();
        Robot.RobotDancer robotDancer = new Robot.RobotDancer();
        Robot.RobotCoocker robotCoocker = new Robot.RobotCoocker();
        List <Robot> robots = Arrays.asList(robot , cofferrobot , robotDancer , robotCoocker);
        for(Robot irobots :robots){
            irobots.work();
        }
        }

    }

