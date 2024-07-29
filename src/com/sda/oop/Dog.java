package com.sda.oop;

public class Dog {
    // variabile de instanta = campurile clasei -> starea
    // incapsulare
    private String name;
    private String breed;
    private String color;
    private int age;
    private double size;
    private boolean sterilised;

    // constructori
    // metode speciale pentru crearea obiectului
    // nu au tip de returnare
    // numele constructructorilor corespunde cu numele clasei
    // this = cuvant cheie care acceseaza instanta curenta a clasei, din interiorul clasei
    public Dog() {
        // constructorul implicit
    }

    public Dog(String name, String breed, String color, int age, double size, boolean sterilised) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.size = size;
        this.sterilised = sterilised;
    }

    public Dog(String name, int age) {
        // apelam constructorul din cadrul unui alt constructor folosind this
        this(name, "Maidanez", "N/A", age, 1, false);
    }

    void eat() {
       if(sterilised) {
           System.out.println(name + " mananca mancare speciala");
       } else {
           System.out.println(name + " mananca mancare normala");
       }
    }

    public String bark() {
        return "HAM! HAM!";
    }

    public void sleep() {
        System.out.println(name + " doarme 12h pe zi si are varsta " + age);
    }

    // stteri si getteri
    // setterii sunt metode care ne ajuta sa setam valoarea campurilor private din exteriorul clasei
    // getterii sunt metode care ne ajuta sa preluam valoarea campurilor private din exteriorul clasei
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("Valoare incorecta");
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isSterilised() {
        return sterilised;
    }

    public void setSterilised(boolean sterilised) {
        this.sterilised = sterilised;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", sterilised=" + sterilised +
                '}';
    }
}

