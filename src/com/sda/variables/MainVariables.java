package com.sda.variables;

public class MainVariables {
    public static void main(String[] args) {
        // tipuri de date -> primitive si non-primitive

        // String (non-primitiv)- siruri de caractere = texte
        // 1. declarare variabila -> tip_de_data + denumire_variabila;
        String firstName;

        // 2. initializare variabila (prima atribuire a unei variabile cu o valoare)
        // denumire_variabila = valoare;
        firstName = "Gheorghe";
        System.out.println(firstName);

        // 3. atribuim valoare
        firstName = "Ana";
        System.out.println(firstName);

        // declarare si initializare pe acelasi rand
        String lastName = "Mihalache";

        // concatenare
        // operatorul + folosit pentru siruri de caractere va realiza concatenarea acestora
        System.out.println(firstName + " " + lastName);

        // tipuri de date primitive
        // numerice intregi

        // byte
        byte byteNumber = 100;
        System.out.println("Numarul de tip byte = " + byteNumber);

        // short
        short shortNumber = 1000;
        System.out.println("Numarul de tip short = " + shortNumber);

        // int
        int intNumber = 1000000;
        System.out.println("Numarul de tip int = " + intNumber);

        // long
        long longNumber = 10000000000L;
        // in mod implicit, valorile numerice sunt considerate de tip int
        // pentru ca valoarea sa fie considerata de tip long,
        // vom adauga la final "L"
        long longNumber2 = 1_234_567_890L;
        System.out.println("longNumber = " + longNumber + "; longNumber2 = " + longNumber2);
        System.out.println(longNumber + longNumber2); // suma celor doua numere
        // + se comporta ca operator de concatenare atunci cand cel putin un operand este sir de caractere
        // + se comporta ca operator de adunare atunci cand operanzii sunt de tipuri numerice
        System.out.println(longNumber + " " + longNumber2); // concatenare

        // numerice reale

        // float
        float floatNumber = 35.5F;
        System.out.println("Numarul de tip float = " + floatNumber);

        // double
        double doubleNumber = 105.9;
        System.out.println("Numarul de tip double = " + doubleNumber);

        System.out.printf("variabila double = %.3f; variabila float = %.2f", doubleNumber, floatNumber);
        System.out.println(); // adaugam un rand nou

        // char
        char a = 'a';
        char b = 98; // codul din tabelul ASCII
        System.out.println(b);
        System.out.println(a + b); // se realizeaza adunarea
        System.out.println(a + " " + b); // se realizeaza concatenarea
        System.out.println("Gigel spune: \"Salut!\"");

        char symbol = '\u00B0'; // U+00B0 - unicode
        System.out.println("Temperatura este de " + floatNumber + symbol + "C");

        // boolean
        boolean isHotOutside = true;
        System.out.println(isHotOutside);
        boolean isTrue = (a == 97);
        System.out.println(isTrue);


    }
}
