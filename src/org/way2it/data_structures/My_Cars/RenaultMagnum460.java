package org.way2it.data_structures.My_Cars;

public class RenaultMagnum460 extends Car {

    final static private Integer maxLoadCapacity = 30500;

    public RenaultMagnum460(String modeCar , Integer enginePower , Integer loadCapacity , Integer speedAvg , Integer fuelConsumpt) {
        super(modeCar , enginePower , loadCapacity , speedAvg , fuelConsumpt);
    }

    @Override
    public double fuelPerToneKm() {

        return getLoadCapacity() / Double.parseDouble(String.valueOf(maxLoadCapacity))*getFuelConsumpt()/getSpeedAvg();

    }
}
