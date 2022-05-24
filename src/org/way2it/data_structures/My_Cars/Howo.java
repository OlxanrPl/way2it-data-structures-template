package org.way2it.data_structures.My_Cars;

public class Howo extends Car {
    final private Integer maxLoadCapacity = 32800;

    @Override
    public Integer getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public Howo(String modeCar , Integer enginePower , Integer loadCapacity , Integer speedAvg, Integer fuelConsumpt) {
        super(modeCar , enginePower , loadCapacity , speedAvg, fuelConsumpt);
    }


}
