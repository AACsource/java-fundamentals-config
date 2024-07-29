package com.sda.loops;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        // cititi capetele unui interval
        // parcurgeti intervalul si afisati doar numerele pare
        // folosind instructiunea continue pentru a exclude numerele impare

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea min a intervalului: ");
        int minNumber = scanner.nextInt();
        System.out.println("Introduceti valoarea max a intervalului: ");
        int maxNumber = scanner.nextInt();

        scanner.close();

        for (int i = minNumber; i <= maxNumber; i++) {
            if (i % 2 != 0) { // daca numarul este impar
                continue; // sare peste iteratia curenta (sare peste numerele impare)
            }
            System.out.println(i);
        }

        // varianta fara continue:
        for (int i = minNumber; i <= maxNumber; i++) {
            if (i % 2 == 0) { // verificam daca un numar este par
                System.out.println(i);
            }
        }

    }
}
