package org.way2it.data_structures.My_Cars;

public class CarsTest {

    public static void main(String[] args) {

        Howo howo_3485 = new Howo("Sinotruck" , 380 , 30000 , 30,46);
        howo_3485.aboutAuto();
        System.out.println(howo_3485.getModeCar() + " - " + howo_3485.fuelPerToneKm());
        RenaultMagnum460 reno_4459 = new RenaultMagnum460("Magnum 460.18" , 460 , 30000 , 38,42);
        reno_4459.aboutAuto();
        System.out.println(reno_4459.getModeCar() + " - " + reno_4459.fuelPerToneKm());

    }
}
