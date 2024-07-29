package com.sda.operators;

public class MainOperators {
    public static void main(String[] args) {
        // (a + b - c) -> expresie
        // a + b -> a si b sunt operanzi
        // + -> operatorul

        System.out.println("Operatori unari -> au un singur operand");
        // operatorii de semn: +, -
        int y = 10;
        System.out.println(-y);

        // operatorul logic unar: ! (negare)
        boolean isColdOutside = false;
        System.out.println(!isColdOutside);
        // !true - false
        // !false - true

        // operatorii de incrementare si decrementare: ++, --
        // pre-incrementare / pre-decrementare  ++a / --a
        int number = 7;
        System.out.println("Pre-incrementare: " + ++number); // 8
        System.out.println("Dupa pre-incrementare: " + number); // 8
        System.out.println("Pre-decrementare: " + --number); // 7
        System.out.println("Dupa pre-decrementare: " + number); // 7

        System.out.println("number = " + number);

        // post-incrementare / post-decrementare a++ / a--
        // modificarea nu se face imediat, ci se face dupa evaluare expresiei de post-incrementare / post-decrementare
        System.out.println("Post-incrementare: " + number++); // 7
        System.out.println("Dupa post-incrementare: " + number); // 8
        System.out.println("Post-decrementare: " + number--); // 8
        System.out.println("Dupa post-decrementare: " + number); // 7

        System.out.println("Operatori binari -> au 2 operanzi");
        // operatorii aritmetici: +, -, *, / (impartire), % (restul impartirii = modulo)
        int result = ((7 + 5) * 2) % 2;
        System.out.println(result);
        // 24 % 2 = 0
        // 24 / 2 = 12 rest 0
        // 25 % 2 = 1
        // 25 / 2 = 12 rest 1
        // pentru impartirea la 2 -> restul 1 - numere impare; restul 0 - numere pare
        // pentru impartirea la 3 -> restul 0 - numarul este divizibil cu 3

        // operatorii de comparatie: >, <, >=, <=, == (egallitatea), != (diferit)
        // operatorii logici: && (si) , || (sau)
        int a = 5, b = 7, c = 4;
        boolean isTrue = (a < b) && (c <= b); // adevarat && adevarat = adevarat
        isTrue = (a > b) || (b != c); // fals || adevarat  = adevarat
        isTrue = a == b; // fals
        System.out.println("Valoarea de adevar a expresiei = " + isTrue);

        // &&
        // true && true - true
        // true && false - false
        // false && true - false
        // false && false - false

        // daca expresia din stanga este adevarata, atunci se evalueaza si expresia dim dreapta
        // daca expresia din stanga este falsa, atunci nu se mai evalueaza expresia din dreapta
        // cand cel putin una dintre expresii este falsa, atunci rezultatul este fals

        // ||
        // true || true - true
        // true || false - true
        // false || true - true
        // false || false - false

        // daca expresia din stanga exte adevarata, atunci nu se mai evalueaza expresia din dreapta
        // daca expresia din stanga exte falsa, atunci se evalueaza expresia din dreapta
        // cand cel putin una dintre expresii este adevarata, atunci rezultatul este adevarat

        // operatorii de atribuire: =, +=, -=, *=, /=, %=
        int x = 15;
        x += 2; // x = x + 2;
        System.out.println("x = " + x);

        // operatorii pe biti: & (si), | (sau), ^ (sau exclusiv = xor), >>, >>>, << (operatorii de deplasare)


        System.out.println("Operatorul ternar -> are 3 operanzi");
        double temperature = 30;
        String message = (temperature > 30) ? "Este canicula" : "Temperatura este potrivita";
        // daca conditia este adevarata, atunci intoarcem primul rezultat
        // daca conditia este falsa, atunci intoarcem al doilea rezultat
        System.out.println(message);

        double resultTemperature = (temperature > 30) ? 30.9 : 29.9;
        System.out.printf("%.2f\n",resultTemperature);
        // %d - numere intregi %.xf - numere reale, unde x este numarul de zecimale afisate
        // %s - siruri de caractere %c - un singur caracter

        double waterTemperature;
        boolean isBoiling = true;
        if (isBoiling) {
            waterTemperature = 100;
            System.out.println("apa fierbe la 100 de grade");
        } else {
            waterTemperature = 10;
        }
        System.out.println("(if) waterTemperature = " + waterTemperature);

        waterTemperature = (isBoiling) ? 100 : 10;
        System.out.println("(?:) waterTemperature = " + waterTemperature);

        // 1. 2 * m++ + m-- + 1
        int m = 6;
        System.out.println(2 * (m++) + (m--) + m);
        System.out.println("m = " + m);
        // 2 * 6 + (m--) + m
        // m = 7
        // 2 * 6 + 7 + m
        // m = 6
        // 12 + 7 + 6 = 25

        // 2. (++m * n-- + ++n) / 2
        int n = 3;
        System.out.println((++m * n-- + ++n) / 2);
        // (7 * n-- + ++n) / 2
        // m = 7 n = 3
        // (7 * 3 + ++n) / 2
        // m = 7 n = 2
        // (7 * 3 + 3) / 2
        // m = 7 n = 3
        // (21 + 3) / 2 = 12
        System.out.println("m = " + m + " n = " + n);

    }
}
