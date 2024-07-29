import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");
        int number1 = scanner.nextInt();
        System.out.println("Numarul intreg citit este " + number1);

        System.out.println("Introduceti un numar real: ");
        double number2 = scanner.nextDouble();
        System.out.println("Numarul real citit este " + number2);

        System.out.println("Introduceti un cuvant: ");
        String cuvant = scanner.next();
        System.out.println("Cuvantul citit este " + cuvant);

        scanner.nextLine();
        System.out.println("Introduceti un mesaj: ");
        String mesaj = scanner.nextLine();
        System.out.println("Linia citita este "  + mesaj);

        scanner.close();
    }
}