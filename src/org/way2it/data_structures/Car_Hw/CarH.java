package org.way2it.data_structures.Car_Hw;

public class CarH {

private CarBody carBody;
private Wheel wheel;
private Sreering sreering;

    public CarH(CarBody carBody , Wheel wheel , Sreering sreering) {
        this.carBody = carBody;
        this.wheel = wheel;
        this.sreering = sreering;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Sreering getSreering() {
        return sreering;
    }

    public void setSreering(Sreering sreering) {
        this.sreering = sreering;
    }

    @Override
    public String toString() {
        return "CarH{" +
                "carBody=" + carBody +
                ", wheel=" + wheel +
                ", sreering=" + sreering +
                '}';
    }
}
