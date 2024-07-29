package com.sda.conversions;

public class MainConversions {
    public static void main(String[] args) {
        System.out.println("Conversii implicite");
        System.out.println("1. short -> int");
        short shortNumber1 = 7;
        int intNumber1 = shortNumber1; // conversie prin egalarea cu o variabila de alt tip
        System.out.println(shortNumber1 + " " + intNumber1);

        System.out.println("2. float -> double");
        float floatNumber2 = 26.9f;
        double doubleNumber2 = floatNumber2;
        System.out.println(floatNumber2 + " " + doubleNumber2);
        System.out.printf("%.1f %.1f\n", floatNumber2, doubleNumber2);

        System.out.println("3. char -> int");
        char charNumber3 = '6';
        int intNumber3 = charNumber3;
        System.out.println(charNumber3 + " " + intNumber3);

        System.out.println("4. int -> float");
        int intNumber4 = 1234567890;
        float floatNumber4 = intNumber4;
        System.out.println(intNumber4 + " " + floatNumber4);
        System.out.printf("%d %.2f\n", intNumber4, floatNumber4);

        System.out.println("5. long -> float");
        long longNumber5 = 12345678901234567L;
        float floatNumber5 = longNumber5;
        System.out.println(longNumber5 + " " + floatNumber5);
        System.out.printf("%d %.2f\n", longNumber5, floatNumber5);

        System.out.println("6. long -> double");
        long longNumber6 = 1_112_345_678_901_234_567L;
        double doubleNumber6 = longNumber6;
        System.out.println(longNumber6 + " " + doubleNumber6);
        System.out.printf("%d %.2f\n", longNumber6, doubleNumber6);

        System.out.println("Conversii explicite");
        System.out.println("7. long -> int");
        long longNumber7 = 1_112_345_678_901_234_567L;
        longNumber7 = 1_112_345L;
        int intNumber7 = (int) longNumber7;
        System.out.println(longNumber7 + " " + intNumber7);

        System.out.println("8. float -> long");
        float floatNumber8 = 1631.6f;
        long longNumber8 = (long) floatNumber8;
        System.out.println(floatNumber8 + " " + longNumber8);

        System.out.println("9. int -> byte (-128 - 127)");
        int intNumber9 = 200;
        byte byteNumber9 = (byte) intNumber9;
        System.out.println(intNumber9 + " " + byteNumber9);

        // 200 - 128 = 72
        // 72 - 128 = -56

        // transformam numarul 200 in baza 2: 1100 1000
        // un numar int este scris pe 32 de biti
        // 0000 0000 0000 0000 0000 0000 1100 1000
        // un numar byte este scris pe 8 biti
        // 1100 1000

        // primul bit de la stanga se numeste bitul de semn -> 0 - numar pozitiv; 1 - numar negativ
        // transformam numarul 1100 1000 din baza 2 in baza 10 folosind complementul 1, apoi complementul 2
        // 1. complement 1 = transformam 1 in 0 si 0 in 1:
        // 1100 1000 => 0011 0111
        // 2. complement 2 = adaugam 1 la complementul 1:
        // 0011 0111 + 1 = 0011 1000
        // 2^7  2^6  2^5  2^4  2^3  2^2  2^1  2^0
        //  0    0    1    1    1    0    0    0   = 2^5 + 2^4 + 2^3 = 32 + 16 + 8 = 56
        // pentru ca bitul de semn a fost initial 1 => -56


    }
}
