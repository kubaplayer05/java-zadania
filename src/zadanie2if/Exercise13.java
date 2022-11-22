package zadanie2if;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz pakiet: (A, B, C)");
        String packet = scanner.next();
        System.out.println("Podaj liczbe minut:");
        int minutes = scanner.nextInt();

        double totalPrice = 0;
        double pricePerMonth = 0;
        int freeMinutes = 0;
        double everyNextMinute = 0;

        switch (packet) {
            case "A":
                pricePerMonth = 39.99;
                freeMinutes = 450;
                everyNextMinute = 0.45;
                break;
            case "B":
                pricePerMonth = 59.99;
                freeMinutes = 900;
                everyNextMinute = 0.40;
                break;
            case "C":
                pricePerMonth = 69.99;
                break;
            default:
                System.out.println("Blad na wejsciu danych");
        }
        int restOfMinutes = 0;
        double minutesPrice = 0;

        if(minutes - freeMinutes > 0) {
            restOfMinutes = minutes - freeMinutes;
            minutesPrice =  restOfMinutes * everyNextMinute;

        }

        totalPrice = pricePerMonth + minutesPrice;

        System.out.printf("Cena za miesiac wynosi: %.2f %n", totalPrice);
    }
}
