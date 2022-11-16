package zadanie2if;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj nazwisko i czas 1 zawodnika:");
        String firstLastName = scanner.next();
        double firstTime = scanner.nextDouble();
        System.out.println("podaj nazwisko i czas 2 zawodnika:");
        String secondLastName = scanner.next();
        double secondTime = scanner.nextDouble();
        System.out.println("podaj nazwisko i czas 3 zawodnika:");
        String thirdLastName = scanner.next();
        double thirdTime = scanner.nextDouble();

        if(firstTime < secondTime && firstTime < thirdTime) {
            if(secondTime < thirdTime) {
                System.out.println("Zawodnik: " + firstLastName + "\nCzas: " + firstTime );
                System.out.println("Zawodnik: " + secondLastName + "\nCzas: " + secondTime );
                System.out.println("Zawodnik: " + thirdLastName + "\nCzas: " + thirdTime );
            } else {
                System.out.println("Zawodnik: " + firstLastName + "\nCzas: " + firstTime );
                System.out.println("Zawodnik: " + thirdLastName + "\nCzas: " + thirdTime );
                System.out.println("Zawodnik: " + secondLastName + "\nCzas: " + secondTime );
            }
        } else if (secondTime < firstTime && secondTime < thirdTime) {
            if(firstTime < thirdTime) {
                System.out.println("Zawodnik: " + secondLastName + "\nCzas: " + secondTime );
                System.out.println("Zawodnik: " + firstLastName + "\nCzas: " + firstTime );
                System.out.println("Zawodnik: " + thirdLastName + "\nCzas: " + thirdTime );
            } else {
                System.out.println("Zawodnik: " + secondLastName + "\nCzas: " + secondTime );
                System.out.println("Zawodnik: " + thirdLastName + "\nCzas: " + thirdTime );
                System.out.println("Zawodnik: " + firstLastName + "\nCzas: " + firstTime );
            }
        } else if (thirdTime < firstTime && thirdTime < secondTime) {
            if(firstTime < secondTime) {
                System.out.println("Zawodnik: " + thirdLastName + "\nCzas: " + thirdTime );
                System.out.println("Zawodnik: " + firstLastName + "\nCzas: " + firstTime );
                System.out.println("Zawodnik: " + secondLastName + "\nCzas: " + secondTime );
            } else {
                System.out.println("Zawodnik: " + thirdLastName + "\nCzas: " + thirdTime );
                System.out.println("Zawodnik: " + secondLastName + "\nCzas: " + secondTime );
                System.out.println("Zawodnik: " + firstLastName + "\nCzas: " + firstTime );
            }
        } else {
            System.out.println("blad danych");
        }
    }
}
