package org.way2it.data_structures.My_Cars;

public class Howo extends Car {
    final static private Integer maxLoadCapacity = 32800;


    public Howo(String modeCar , Integer enginePower , Integer loadCapacity , Integer speedAvg, Integer fuelConsumpt) {
        super(modeCar , enginePower , loadCapacity , speedAvg, fuelConsumpt);
    }

    @Override
    public double fuelPerToneKm() {

        return getLoadCapacity() / Double.parseDouble(String.valueOf(maxLoadCapacity))*getFuelConsumpt()/getSpeedAvg();

    }
}
