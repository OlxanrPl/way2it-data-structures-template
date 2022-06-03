/*3.Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
Якщо a<0 і b<0 викидаємо IllegalArgumentException
Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
Якщо a=0 і b=0 викидаємо IllegalAccessException
Якщо a>0 і b>0 викидаємо MyException
Протестувати всі можливі варіанти, і вивести все на консоль.
*/
package org.way2it.data_structures.MyExeption;

public class Hometask_9_3 {

    public static void main(String[] args) throws Exception {

        Methods metods1 = new Methods(-56 , 5);
        System.out.println("* " + metods1.multiply());
        System.out.println("/ " + metods1.division());
        System.out.println("+ " + metods1.plus());
        System.out.println("- " + metods1.minus());
    }
}
