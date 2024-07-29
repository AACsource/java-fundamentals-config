package com.sda.exercitii;

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int numar = scanner.nextInt();
        int count = 0;
        scanner.close();

        System.out.println("Numerele pare pana la " + numar + " sunt:");
        for (int i = 0; i <= numar; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nAu fost gasite " + count + " numere pare.");
    }
}
