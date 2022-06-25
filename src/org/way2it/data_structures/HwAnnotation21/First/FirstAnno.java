package org.way2it.data_structures.HwAnnotation21.First;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnno {

  String value() default "";
}
