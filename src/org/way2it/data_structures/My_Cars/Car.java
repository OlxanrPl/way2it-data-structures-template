package org.way2it.data_structures.My_Cars;

public class Car {

    final static private Integer maxLoadCapacity = null;
    private String modeCar;
    private Integer enginePower;
    private Integer loadCapacity;
    private Integer speedAvg;
    private Integer fuelConsumpt;


    public Car(String modeCar , Integer enginePower , Integer loadCapacity , Integer speedAvg , Integer fuelConsumpt) {

        this.modeCar = modeCar;
        this.enginePower = enginePower;
        this.loadCapacity = loadCapacity;
        this.speedAvg = speedAvg;
        this.fuelConsumpt = fuelConsumpt;
    }

    public Car() {

    }

    public Integer getSpeedAvg() {
        return speedAvg;
    }

    public void setSpeedAvg(Integer speedAvg) {
        this.speedAvg = speedAvg;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getModeCar() {

        return modeCar;
    }

    public void setModeCar(String modeCar) {

        this.modeCar = modeCar;
    }

    public Integer getFuelConsumpt() {

        return fuelConsumpt;
    }

    public void aboutAuto() {  // Про машину

        System.out.println(modeCar + ", engine power is - " + enginePower + ", load capacity is -" + loadCapacity);
    }

    public double fuelPerToneKm() { // Коєфіцієнт витраит палива на тонно кілометр

        return (loadCapacity / Double.parseDouble(String.valueOf(maxLoadCapacity)) * fuelConsumpt / speedAvg);
    }
}
