package com.sda.exercitii;

import java.util.Scanner;

public class Exercitiul5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        double numar1 = scanner.nextDouble();
        System.out.print("Introduceti al doilea numar: ");
        double numar2 = scanner.nextDouble();

        boolean running = true;

        while (running) {
            System.out.println("Alegeti numarul optiunii:");
            System.out.println("1. adunare");
            System.out.println("2. scadere");
            System.out.println("3. inmultire");
            System.out.println("4. impartire");
            System.out.println("5. iesire");

            int optiune = scanner.nextInt();

            switch (optiune) {
                case 1:
                    double suma = numar1 + numar2;
                    System.out.println("+: " + suma);
                    break;
                case 2:
                    double diferenta = numar1 - numar2;
                    System.out.println("-: " + diferenta);
                    break;
                case 3:
                    double produs = numar1 * numar2;
                    System.out.println("*: " + produs);
                    break;
                case 4:
                    if (numar2 != 0) {
                        double impartire = numar1 / numar2;
                        System.out.println("/: " + impartire);
                    } else {
                        System.out.println("Impartirea la zero nu poate fi realizata");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Iesire din program");
                    break;
                default:
                    System.out.println("Opțiune invalida");
                    break;
            }
        }

        scanner.close();
    }
}
