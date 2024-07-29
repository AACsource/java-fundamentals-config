package com.sda.loops;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        // cititi toate numerele introduse de utilizator, pana cand acesta introduce numarul 0
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numere (0 pentru a opri citirea): ");

        while (true) {
            int number = scanner.nextInt();

            if(number == 0) {
                break; // forteaza iesirea din bucla while
            }

            System.out.println(number);
        }

        scanner.close();
    }
}
