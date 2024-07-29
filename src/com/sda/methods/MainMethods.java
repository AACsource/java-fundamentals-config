package com.sda.methods;

public class MainMethods {
    public static void main(String[] args) {
//        System.out.println("V-ati conectat cu succes");
//        System.out.println("Bine ati venit in aplicatie!");
//        System.out.println("Adrian, alege te rog o optiune din meniu");
//        System.out.println("V-ati conectat cu succes");
//        System.out.println("Bine ati venit in aplicatie!");
//        System.out.println("Maria, alege te rog o optiune din meniu");
//        System.out.println("V-ati conectat cu succes");
//        System.out.println("Bine ati venit in aplicatie!");
//        System.out.println("Eduard, alege te rog o optiune din meniu");
//        System.out.println("V-ati conectat cu succes");
//        System.out.println("Bine ati venit in aplicatie!");
//        System.out.println("Teodora, alege te rog o optiune din meniu");

        // apelul metodei: denumire_metoda + argumente
        // argumentele sunt valorile efective pe care le vor avea parametrii metodei
        conectareUtilizator("Adrian");
        conectareUtilizator("Maria");
        conectareUtilizator("Eduard");
        conectareUtilizator("Teodora");
        String name = "Alex";
        conectareUtilizator(name);

        int a = 5;
        double b = 7.5;
        double sum = a + b;
        System.out.println("sum = " + sum);

        System.out.println(Utils.sumaNumerelor(a, b));
        System.out.println(Utils.sumaNumerelor(1, a)); // se face conversie implicita de la a (int) la double
        System.out.println(Utils.sumaNumerelor(2.4,7.9));
        System.out.println(Utils.sumaNumerelor(5, 7.2, b));

        double[] numereArray = {1.2,2.3,3.4,4.5,5.7};
        System.out.println(Utils.sumaNumerelor(numereArray));

        double[] note = {8.0,8.5,10.0};
        System.out.println("Media notelor = " + Utils.mediaNumerelor(note));
        System.out.printf("Media notelor = %.2f\n",Utils.mediaNumerelor(note));

        System.out.println(Utils.sumaNumerelor(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Utils.sumaNumerelor());
        System.out.println(Utils.sumaNumerelor(10,20,30,40));

        String afisareSuma = "Suma numerelor intregi este = ";
        System.out.println(Utils.sumaNumerelor(afisareSuma,100,200,300));

    }

    // declararea metodei: modificator_de_acces + tip_returnare + denumire_metoda + lista+parm
    public static void conectareUtilizator(String name) {
        System.out.println("V-ati conectat cu succes");
        System.out.println("Bine ati venit in aplicatie!");
        System.out.println(name + ", alege te rog o optiune din meniu");
    }

}
