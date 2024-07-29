package com.sda.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // 1. Cream obiectul Pattern folosind metoda compile()
        // 2. Cream obiectul Matcher folosind metoda matcher() -> face legatura intre textul verificat si salblonul regex
        // 3.1. Verificarea existentei potrivirilor din text cu sablonul -> metoda find()
        // 3.2. Verificarea potrivirii intregului text cu saablonul regex -> metoda matches()

        // 1. sa extragem toate numerele din cadrul unui text
        String text1 = "Astazi este 24 martie (03), anul 2024, iar temperatura este de -15 grade celsius";
        String regex1 = "[-]?\\d+"; // \d+ sau [0-9]+
        // [-]?\d+

        Pattern pattern1 = Pattern.compile(regex1); // transformam String-ul in care avem sablonul regex in obiect Pattern
        Matcher matcher1 = pattern1.matcher(text1); // cream obiectul Matcher pe baza pattern-ului si a textului verificat

        while (matcher1.find()) { // cat timp exista potriviri ale sablonului in text
            System.out.println(matcher1.group());
        }

        // 2. verificam o adresa de email dupa un sablon
        // https://regexr.com/3e48o
        String email = "exemplu@gmail.com";
        String emailRegex = "[\\w-\\.]+@([\\w]+){1}\\.[\\w]{2,4}"; // [\w-\.]+@([\w]+){1}\.[\w]{2,4}

        // varianta 1
        Pattern pattern2 = Pattern.compile(emailRegex);
        Matcher matcher2 = pattern2.matcher(email);

        if (matcher2.matches()) { // daca email-ul dat se potriveste cu sablonul
            System.out.println("Email valid");
        } else {
            System.out.println("Email invalid");
        }

        // varianta 2
        boolean isMatched = Pattern.compile(emailRegex).matcher(email).matches();

        if (isMatched) {
            System.out.println("Email valid");
        } else {
            System.out.println("Email invalid");
        }

    }
}
