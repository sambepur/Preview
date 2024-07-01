package com.example.preview;


import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Check {
    public static void Call(@NotNull() Class<?> clazz, @NotNull Class<? extends Annotation> annotation){
       for (Method method: clazz.getMethods()){
           try {
               System.out.println(method);
               if (method.isAnnotationPresent(annotation)){
                    method.invoke(clazz);
               }
           }
           catch (Exception e){
               System.out.println("Class mismatch");
           }
        }
    }
}
