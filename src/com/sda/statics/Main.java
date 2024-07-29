package com.sda.statics;

//import static com.sda.oop.Dog.bark;
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        // accesare - se realizeaza prin numele clasei
//        System.out.println(bark());
//        System.out.println("Numar obiecte = " + getNumberOfDogs());
//        System.out.println("Speranta de viata = " + LIFE_EXPECTANCY);

        // import static
        System.out.println (bark());
        AtomicReference<String> getNumberOfDogs = null;
        System.out.println("Numar obiecte = " + getNumberOfDogs);
        String LIFE_EXPECTANCY = "";
        System.out.println("Speranta de viata = " + LIFE_EXPECTANCY);

        // creati o metoda care sa calculeze aria unui cerc (pi * raza la patrat)
        System.out.println(arieCerc(4.5));
        System.out.println(arieCerc(2));
    }

    private static boolean bark() {
        return false;
    }

    private static double arieCerc(double radius) {
        return Math.PI * pow(radius,2);
    }
}
