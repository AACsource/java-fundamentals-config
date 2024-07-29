package com.sda.strings;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = str1;
        String str4 = new String("Hello, World!");

        str3 = str3 + "-"; // imutabilitate = obiectul nu mai poate fi modificat dupa ce a fost creat

        // verificarea egalitatii referintelor
        if (str1 == str3) {
            System.out.println("Referinte egale");
        } else {
            System.out.println("Referinte diferite");
        }

        // verificarea egalitatii valorilor efective ale obiectelor
        if (str1.equals(str3)) {
            System.out.println("Valori egale");
        } else {
            System.out.println("Valori diferite");
        }

        char[] chars = {'S','a','l','u','t','!'};
        String str5 = new String(chars);
        System.out.println(str5);

        String str6 = new String(chars,0, chars.length-1);
        System.out.println(str6);

        // comparare siruri de caractere

        // alte metode

    }

}
