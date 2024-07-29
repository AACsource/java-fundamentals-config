package com.sda.exercitii;

import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limita inferioara a intervalului: ");
        int start = scanner.nextInt();
        System.out.print("Limita superioara a intervalului: ");
        int end = scanner.nextInt();
        scanner.close();

        int suma = 0;
        for (int i = start; i <= end; i++) {
            suma += i;
        }

        System.out.println("Suma numerelor din intervalul [" + start + ", " + end + "] = " + suma);
    }
}
