package com.sda.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        // operatori pe biti
        System.out.println(10&12);
        // transformam numerele in baza 2
        // realizam operatia de & pentru numerele din baza 2
        // rezultatul in transformam inapoi in baza 10

        // 10 in baza 2 = 1010
        // 12 in baza 2 = 1100

        // 1010
        // 1100
        // ---- &
        // 1000

        // 2^3 2^2 2^1 2^0
        //  1   0   0   0
        // 0 * 2^0 + 0 * 2^1 + 0 * 2^2 + 1 * 2^3 = 1 * 8 = 8

        // int - 32 biti
        // 10 = 0000 0000 0000 0000 0000 0000 0000 1010
        // 12 = 0000 0000 0000 0000 0000 0000 0000 1100

        System.out.println(10|12);
        // 1010
        // 1100
        //----- |
        // 1110 = 1*2^3 + 1*2^2 + 1*2^1 + 0*2^0 = 8 + 4 + 2 = 14 in baza 10
        // 2^3 2^2 2^1 2^0
        //  1   1   1   0


        System.out.println(10^12);
        // 1010
        // 1100
        // ----- ^
        // 0110 (in baza 2)

        // 2^3=8 2^2=4 2^1=2 2^0=1
        //   0     1     1     0
        // => 6 (in baza 10)

        System.out.println(~10);
        // ~n = -(n+1)
        // ~10 = -(10+1) = -11

        // 1010 (in baza 2)
        // 00...00 1010 (numarul int in memorie este stocat pe 32 de biti)
        // 0000 1010
        // 1111 0101 (complementul numarului)

        // transformarea unui numar negativ pe biti intr-un numar din baza 10
        // primul bit de la stanga ne da semnul -> 1 - numar negativ; 0 - numar pozitiv
        // 1. facem complement 1 (1 devine 0, iar 0 devine 1)
        // 1111 0101 => 0000 1010
        // 2. facem complement 2
        // 0000 1010 + 1 = 0000 1011

        // 2^3=8 2^2=4 2^1=2 2^0=1
        //   1     0     1     1    => 8 + 2 + 1 = 11 => (deoarece bitul de semn este 1) -11

        int number = 2;
        System.out.println(number<<2); // deplasare la stanga cu 2 biti
        // 2 (in baza 10) = 0010 (in baza 2)
        // eliminam 2 biti de la stanga si completam la final cu 0
        // 1000 => scris in baza 10 este 8

        number = 8;
        System.out.println(number>>>2); // deplasare la dreapta fara semn cu 2 biti
        // 8 (in baza 10) = 1000 (in baza 2)
        // eliminam 2 biti de la dreapta si completam la inceput cu 0
        // 1000
        // 0010 => scris in baza 10 este 2


        // >> - deplasare la dreapta cu semn
        // daca numarul e pozitiv - eliminam x biti de la dreapta si completam la inceput cu 0
        // daca numarul e negativ - eliminam x biti de la dreapta si completam la inceput cu 1


        /*
        https://www.geeksforgeeks.org/bitwise-operators-in-java/
        https://www.baeldung.com/java-bitwise-operators
         */
    }
}
