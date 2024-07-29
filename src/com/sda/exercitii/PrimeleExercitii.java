package com.sda.exercitii;

public class PrimeleExercitii {
    public static void main(String[] args) {
        System.out.println("Exercitiul 1");
        int varInt = 10;
        double varDouble = varInt;
        System.out.println("varDouble = " + varDouble);

        System.out.println("\nExercitiul 2");
        int a = 5, b = 4;
        System.out.println("suma = " + (a + b));
        System.out.println("diferenta = " + (a - b));
        System.out.println("inmultirea = " + (a * b));
        System.out.println("impartirea = " + ((double) a / b));
        System.out.println("restul = " + (a % b));

        System.out.println("\nExercitiul 3");
        int x = 4;
        int y = 6;
        int z = 2;
        int result = x * y + z / 2;
        System.out.println(result);

        System.out.println("\nExercitiul 4");
        float number = 7.5f;
        String text = "Valoarea este: ";
        String concatenat = text + number;
        System.out.println(concatenat);

        System.out.println("\nExercitiul 5");
        double distance = 123.456789;
        String unit = "metri";
        System.out.printf("%.2f %s %n", distance, unit);

        System.out.println("\nExercitiul 6");
        int m = 5, n = 7;
        boolean resultExpr = (m > 0 && n < 10) || (m == n);
        System.out.println(resultExpr);

        System.out.println("\nExercitiul 7");
        int age = 20;
        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("Persoana este considerata " + status);

        System.out.println("\nExercitiul 8");
        double doubleValue = 9.99;
        int intValue = (int) doubleValue;
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);
        // Conversia unui double la int duce la pierderea parții zecimale,
        // pastrand doar partea intreaga a valorii

        System.out.println("\nExercitiul 9");
        short shortValue = 12345;
        float floatValue = shortValue;
        System.out.println("shortValue = " + shortValue);
        System.out.println("floatValue = " + floatValue);
        // Conversia unui short la float nu duce la pierdere de precizie
        // deoarece float poate reprezenta aceste valori cu exactitate

    }
}
