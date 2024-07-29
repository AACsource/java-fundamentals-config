package com.sda.arrays;

public class BidimensionalArraysMain {
    public static void main(String[] args) {
        double[][] array = new double[2][3];
        // 2 -> numarul de linii
        // 3 -> numarul de coloane

        array[0][0] = 5.0;
        array[0][1] = 1.1;
        array[1][1] = 7.9;
        array[0][2] = 1.2;
        array[1][2] = 4.5;

        // array[i][j] - elementul
        // array[i] - linia
        for (int i = 0; i < array.length; i++) { // parcurgerea fiecarei linii din array
            for (int j = 0; j < array[i].length; j++) { // parcurgerea coloanelor (a elementelor de pe linia curenta)
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names = {{"Matei", "David", "Eduard"}, {"Maria","Teodora"}};
//        System.out.println("Elementul names[1][2] = " + names[1][2]); // nu exista si va da eroare
        for (String[] rand : names) { // parcurgerea randurilor
            for (String element : rand) { // parcurgerea elementelor de pe randul curent
                System.out.print(element + " ");
            }
            System.out.println();
        }


        int[][] numbers = new int[2][]; // specificam numarul de linii
        numbers[0] = new int[] {10,20}; // fiecare linie va fi la randul sau un array unidimensional
        numbers[1] = new int[] {30,40,50};

    }
}
