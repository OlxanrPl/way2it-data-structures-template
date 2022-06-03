package org.way2it.data_structures.MyExeption;

public class Methods {
    double valueA;
    double valueB;

    public Methods(double valueA , double valueB) throws Exception {

        checkNum(valueA , valueB);
        MyException(valueA , valueB);
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public static void checkNum(double valueA , double valueB) throws IllegalAccessException {

        if(valueA < 0 && valueB < 0) {
            throw new IllegalArgumentException();
        } else if((valueA == 0 && valueB != 0) || (valueA != 0 && valueB == 0)) {
            throw new ArithmeticException();
        } else if(valueA == 0 && valueB == 0) {
            throw new IllegalAccessException();
        }
    }

    static void MyException(double valueA , double valueB) throws Exception {

        if(valueA > 0 && valueB > 0)
            throw new Exception("Error a>0 and b>0 !!!");
    }

    public double getValueA() {

        return valueA;
    }

    public double getValueB() {

        return valueB;
    }

    public double plus() {

        double rez = this.valueA + this.valueB;
        return rez;
    }

    public double division() {

        return this.valueA / this.valueB;
    }

    public double minus() {

        return this.valueA - this.valueB;
    }

    public double multiply() {

        return this.valueA * this.valueB;
    }
}
