package com.sda.exercitii;

import java.util.Scanner;

public class Exercitiul3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti nota: ");
        int nota = scanner.nextInt();
        scanner.close();

        System.out.println("Varianta cu if: ");
        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficient");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Suficient");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Bine");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelent");
        } else {
            System.out.println("Nota introdusa nu este valida");
        }

        System.out.println("Varianta cu switch: ");
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficient");
                break;
            case 5,6:
                System.out.println("Suficient");
                break;
            case 7,8:
                System.out.println("Bine");
                break;
            case 9,10:
                System.out.println("Excelent");
                break;
            default:
                System.out.println("Nota introdusa nu este valida");

        }
    }
}
