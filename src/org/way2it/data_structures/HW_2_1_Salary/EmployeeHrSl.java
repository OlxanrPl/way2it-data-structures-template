package org.way2it.data_structures.HW_2_1_Salary;

public class EmployeeHrSl implements Salary {

    private int hour;
    private double prise;

    public EmployeeHrSl(int hour , double prise) {

        this.hour = hour;
        this.prise = prise;
    }

    public double getPrise() {

        return prise;
    }

    public void setPrise(double prise) {

        this.prise = prise;
    }

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    @Override
    public double salary() {

        return hour * prise;
    }
}
