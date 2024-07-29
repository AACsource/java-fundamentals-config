package com.sda.arrays;

import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        // declarare + initializare
        short[] arrayNumere;
        arrayNumere = new short[4];

        int[] arrayNumere2 = new int[3];

        long[] arrayNumere3 = new long[] {100000L, 9999999L};

        double[] arrayNumere4 = {10.2, 15.5, 25.9, 30.1, 25.9};

        // accesare element de pe o anumita pozitie
        arrayNumere[0] = 10;
        System.out.println("Elementul de pe pozitia 0 = " + arrayNumere[0]);
        System.out.println(arrayNumere[0] + " " + arrayNumere[1] + " " + arrayNumere[2] + " " + arrayNumere[3]);
//        System.out.println("Accesam un element de pe o pozitie inexistenta: " + arrayNumere[4]);

        // afisam elementul de pe pozitia 4 din arrayNumere4
        System.out.println("Elementul de pe pozitia 4 = " + arrayNumere4[4]);

        System.out.println(arrayNumere);

        System.out.println("Parcurgere FOR:");
        for (int i = 0; i < arrayNumere4.length; i++) {
            System.out.print(arrayNumere4[i] + " ");
        }
        System.out.println();

        String[] grupa74 = {"Iuli", "Maria", "Eduard", "Alex", "Adrian", "Andi", "Teodora"};

        System.out.println("Parcurgere FOREACH:");
        for (String cursant : grupa74) {
            System.out.println(cursant);
        }

        System.out.println("Cursantul de pe pozitia 1 = " + grupa74[1]);
        // Lungimea unui array
        System.out.println("Cati cursanti sunt in grupa 74? " + grupa74.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea: ");
        int n = sc.nextInt();

        float[] arrayCitit = new float[n];

//        for (int i = 0; i < arrayCitit.length; i++) {
//            System.out.println("Introduceti valoarea elementului: ");
//            arrayCitit[i] = sc.nextFloat();
//        }
        int index = 0;
        for (float number : arrayCitit) {
            System.out.println("Introduceti valoarea elementului: ");
            number = sc.nextFloat();
            arrayCitit[index++] = number;
        }
        sc.close();

        for (float number : arrayCitit) {
            System.out.println(number);
        }
    }
}
