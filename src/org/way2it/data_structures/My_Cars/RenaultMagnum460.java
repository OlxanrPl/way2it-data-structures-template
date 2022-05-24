package org.way2it.data_structures.My_Cars;

public class RenaultMagnum460 extends Car {

    final private Integer maxLoadCapacity = 30500;

    @Override
    public Integer getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public RenaultMagnum460(String modeCar , Integer enginePower , Integer loadCapacity , Integer speedAvg , Integer fuelConsumpt) {
        super(modeCar , enginePower , loadCapacity , speedAvg , fuelConsumpt);
    }

}
