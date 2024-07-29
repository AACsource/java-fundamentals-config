package com.sda;

import com.sda.methods.Utils;
import com.sda.oop.Dog;

public class Main {
    // psvm sau main
    public static void main(String[] args) { // metoda main = punctul de intrare in program
        // = metoda care se executa atunci cand se ruleaza programul
        // comentariu pe o singura linie
        // comentariile sunt ignorate de compilatorul java

        /* comentariu
        pe mai
        multe linii
         */

        // sout
        System.out.println("Hello, Java74!");
        // java este un limbaj case-sensitive = tine cont de literele mici si mari (Main != main)
        System.out.println("Hello");
        System.out.println("Java");
        // folosind o singura instructiune -> avem caracterul \n care reprezinta new line
        System.out.println("Hello\nJava");
        System.out.println(); // o sa ne afiseze doar un rand nou

        System.out.print("Java is cool");
        // print afiseaza textul fara a adauga un rand nou la final
        // println afiseaza textul si adauga un rand nou la final
        System.out.println("Salutare!");
        // vom adauga un \n la instructiunea System.out.print("Java is cool"); pentru a afisa pe randuri diferite

        // conventia de denumire camel case
        // numarPar (variabila)
        // DetaliuProdus (clasa)
        // calculeazaMediaNotelor (metoda)

        System.out.println(Utils.sumaNumerelor(3, 18.2));

    }
}
