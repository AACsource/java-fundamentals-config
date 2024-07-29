package com.sda.oop;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex);

        Dog max = new Dog("Max","ciobanesc german","maro",2,41.5, true);
        System.out.println(max);

        // apelul metodelor
        rex.eat();
        max.eat();

        // accesarea campurilor
//        rex.name = "Rex";
//        System.out.println(rex.name + " are varsta " + rex.age);
        rex.setName("Rex");
        rex.setBreed("Maidanez");
        rex.setAge(4);
        rex.setColor("Negru");
        rex.setSize(15.8);
        System.out.println(rex.getName()+ " are varsta " + rex.getAge());
        System.out.println(rex);

        Dog nini = new Dog("Nini", 7);
        System.out.println(nini);
    }
}
