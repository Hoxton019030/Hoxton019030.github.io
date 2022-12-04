package org.example;


import java.lang.annotation.Annotation;

@MyAnnotation
public class Main {
    public static void main(String[] args) {

        Annotation annotation = Main.class.getAnnotation(MyAnnotation.class);
        System.out.println("annotation = " + annotation);

    }
}