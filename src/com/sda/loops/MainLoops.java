package com.sda.loops;

import java.util.Scanner;

public class MainLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int number = sc.nextInt();
        sc.close();

        // sa se afiseze toate numerele de la 0 pana la un numar intreg citit
        System.out.println("FOR");
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        System.out.println("parcurgere descrescatoare");
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        int i;
        System.out.println("afisam numerele din 3 in 3 pornind de la 3 pana la numarul citit");
        for (i = 3; i <= number; i+=3) {
            System.out.println(i);
        }

        // TEMA: afisati toate numerele pare, pana la numarul citit

        System.out.println("Ultima valoare a lui i = " + i);

        System.out.println("WHILE");
        // sa se afiseze toate numerele de la 0 pana la un numar intreg citit
        i = 0;
        while (i <= number) {
            System.out.println(i);
            i++;
        }

        System.out.println("Ultima valoare a lui i = " + i);

        System.out.println("DO-WHILE");
        // sa se afiseze toate numerele de la 0 pana la un numar intreg citit
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= number);

        System.out.println("Ultima valoare a lui i = " + i);
    }
}
