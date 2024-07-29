package com.sda.exercitii;

import java.util.Scanner;

public class Exercitiul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int numar = scanner.nextInt();
        scanner.close();

        if (numar % 2 == 0) {
            System.out.println("Numarul " + numar + " este par.");
        } else {
            System.out.println("Numarul " + numar + " este impar.");
        }
    }
}
