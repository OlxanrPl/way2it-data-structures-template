package org.way2it.data_structures.HW_2_1_Salary;

public class SalaryTest {

    public static void main(String[] args) {

        EmployeeDaySl employeeDaySl = new EmployeeDaySl(21 , 14000);
        EmployeeHrSl employeeHrSl = new EmployeeHrSl(168 , 87.50);
        System.out.println("Hourly employee salary - " + employeeDaySl.salary());
        System.out.println("Days employee salary - " + employeeHrSl.salary());
    }
}
