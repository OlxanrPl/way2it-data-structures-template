package org.way2it.data_structures.HW_2_1_Salary;

public class EmployeeDaySl implements Salary {

    private int days;
    private double prise;

    public EmployeeDaySl(int days , double prise) {

        this.days = days;
        this.prise = prise;
    }

    public int getDays() {

        return days;
    }

    public void setDays(int days) {

        this.days = days;
    }

    public double getPrise() {

        return prise;
    }

    public void setPrise(double prise) {

        this.prise = prise;
    }

    @Override
    public double salary() {

        return days * (prise/20);
    }
}
