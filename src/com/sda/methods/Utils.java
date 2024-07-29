package com.sda.methods;

public class Utils {
    public static double sumaNumerelor (int x, double y) {
        return x + y;
    }

    // supraincarcarea metodelor (overload)
    static double sumaNumerelor (double x, double y) {
        return x + y;
    }

    static double sumaNumerelor (int x, double y, double z) {
        return x + y +z;
    }

    // sumaNumerelor care sa primeasca ca parametru un array de numere double
    // in cadrul metodei, sa se parcurga array-ul si sa se realizeze suma elementelor
    public static double sumaNumerelor(double[] numere) {
        double s = 0.0;
        for (int i = 0; i < numere.length; i++) {
            s += numere[i]; // s = s + numere[i];
        }
        return s;
    }

    // TEMA: creati o metoda mediaNumerelor(), care sa calculeze media
    // apeland metoda sumaNumerelor()
    // parametru un array de numere double
    // returneaza media de tip double
    public static double mediaNumerelor(double[] numere) {
        return sumaNumerelor(numere) / numere.length;
    }

    // varargs
    // supraincarcati metoda sumaNumerelor care sa primeasca un parametru de tip varargs
    public static int sumaNumerelor(int... numere) {
        int s = 0;
        for (int i = 0; i < numere.length; i++) {
            s += numere[i]; // s = s + numere[i];
        }
        return s;
    }

    // parametrul vararg se pune intotdeauna ultimul
    public static String sumaNumerelor(String message, int... numere) {
        int s = 0;
        for (int i = 0; i < numere.length; i++) {
            s += numere[i]; // s = s + numere[i];
        }
        return message + s;
    }


}
