package com.sda.dateAndTime;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//local time
        System.out.println("LocalTime");

        LocalTime oraCurenta = LocalTime.now();
        System.out.println(oraCurenta);

       int ora = oraCurenta.getHour();
       int minute = oraCurenta.getMinute();
       int secunde = oraCurenta.getSecond();

        System.out.println("ora curenta:" + ora + "h" + minute + "m"+secunde + "s");

        LocalTime startCurs = LocalTime.of(18, 5, 48);
        System.out.println(startCurs);

        LocalTime endCurs = startCurs.plusHours(3);
        System.out.println(startCurs);




    }
}
