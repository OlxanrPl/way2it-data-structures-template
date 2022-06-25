package org.way2it.data_structures.HwAnnotation21;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Аннотация маркер, яку можно використати до типу данних
@Target(ElementType.TYPE_USE)
@interface TypeAnno {

}

//Аннотация маркер, яку можно використати до типу данних
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {

}

//Аннотация маркер, яку можно використати до типу данних
@Target(ElementType.TYPE_USE)
@interface Unique {

}

//Аннотация маркер, яку можно використати до типу данних
@Target(ElementType.TYPE_USE)
@interface MaxLen {

  int value();
}

//Аннотация маркер, яку можно використати до типу параметра
@Target(ElementType.TYPE_PARAMETER)
@interface What {

  String description();
}

//Аннотация маркер, яку можно використати в оголошенні поля
@Target(ElementType.FIELD)
@interface EmptyOK {

}

//Аннотация маркер, яку можно використати в оголошенні методу
@Target(ElementType.METHOD)
@interface Recommended {

}


public class AnnoDemo<@What(description = "Generic data type") T> {


}
