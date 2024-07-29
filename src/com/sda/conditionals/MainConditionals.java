package com.sda.conditionals;

import java.util.Scanner;

public class MainConditionals {
    public static void main(String[] args) {
        // structuri de control -> conditionale + repetitive
        // if switch
//        double temperature = 33.4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti temperatura: ");
        double temperature = scanner.nextDouble();
        System.out.println("Temperatura citita este = " + temperature);

        System.out.println("Ce zi este astazi?");
        String zi = scanner.next();

        scanner.close();

        System.out.println("IF");
        if (temperature > 30) {
            System.out.println("Temperatura caniculara");
            System.out.println("Folositi SPF");
        }

        System.out.println("IF-ELSE");
        if (temperature > 30) {
            System.out.println("Temperatura caniculara");
            System.out.println("Folositi SPF");
        } else { // temperature <= 30
            System.out.println("Temperatura normala");
        }

        System.out.println("IF-ELSE IF-ELSE");
        if (temperature <= 0) {
            System.out.println("Afara este frig");
        } else if (temperature <= 20) { // (0,20]
            System.out.println("Afara, temperatura este potrivita");
        } else if (temperature < 40) { // (20, 40)
            System.out.println("Afara este cald");
        } else { // [40,infinit)
            System.out.println("Temperatura este caniculara");
        }

        // TEMA:
        // verificati daca un numar citit cu Scanner (de la tastatura)
        // este mai mare decat 100 si este par
        // iar daca condtiile sunt adevarate, afisati un mesaj sugestiv

        if (temperature <= 25 || temperature >= 50) {
            System.out.println("Temperaturi extreme");
        }

        System.out.println("SWITCH 1:");
        zi = zi.toLowerCase(); // transformam toate caracterele din sir in caractere mici
        switch (zi) {
            case "luni":
                System.out.println("Work day");
                break;
            case "marti":
                System.out.println("Work day");
                break;
            case "miercuri":
                System.out.println("Work day");
                break;
            case "joi":
                System.out.println("Work day");
                break;
            case "vineri":
                System.out.println("Work day");
                break;
            case "sambata":
                System.out.println("Weekend");
                break;
            case "duminica":
                System.out.println("Weekend");
                break;
        }

        System.out.println("SWITCH 2:");
        switch (zi) {
            case "luni":
            case "marti":
            case "miercuri":
            case "joi":
            case "vineri":
                System.out.println("Work day");
                break;
            case "sambata":
            case "duminica":
                System.out.println("Weekend");
                System.out.println("Zi de relaxare");
                break;
            default:
                System.out.println("Zi invalida");
        }

        System.out.println("SWITCH 3:");
        // fiecare zi a saptamanii va avea un numar corespunzator de la 1-7
        int numarulZilei = switch (zi) {
            case "luni" -> 1;
            case "marti" -> 2;
            case "miercuri" -> 3;
            case "joi" -> 4;
            case "vineri" -> 5;
            case "sambata" -> 6;
            case "duminica" -> 7;
            default -> 0;
        };
        System.out.println("Numarul zilei este = " + numarulZilei);


        System.out.println("SWITCH 4:");
        String message = switch (zi) {
            case "luni", "marti", "miercuri", "joi", "vineri"  -> "Zi de lucru";
            case "sambata", "duminica" -> "Zi de odihna";
            default -> "Zi invalida";
        };
        System.out.println(message);

    }
}
