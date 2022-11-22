package zadanie2if;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz pakiet: (A, B, C)");
        String packet = scanner.next();
        System.out.println("Podaj liczbe minut:");
        int minutes = scanner.nextInt();

        double totalPriceForA = 0, totalPriceForB = 0, totalPriceForC = 0;
        double pricePerMonth = 0;
        int freeMinutes = 0;
        double everyNextMinute = 0;
        int restOfMinutes = 0;
        double minutesPrice = 0;

        switch (packet) {
            case "A":
                pricePerMonth = 39.99;
                freeMinutes = 450;
                everyNextMinute = 0.45;
                if(minutes - freeMinutes > 0) {
                    restOfMinutes = minutes - freeMinutes;
                    minutesPrice =  restOfMinutes * everyNextMinute;

                }
                totalPriceForA = pricePerMonth + minutesPrice;
            case "B":
                pricePerMonth = 59.99;
                freeMinutes = 900;
                everyNextMinute = 0.40;
                if(minutes - freeMinutes > 0) {
                    restOfMinutes = minutes - freeMinutes;
                    minutesPrice =  restOfMinutes * everyNextMinute;

                }
                totalPriceForB = pricePerMonth + minutesPrice;
            case "C":
                pricePerMonth = 69.99;
                freeMinutes = 0;
                everyNextMinute = 0;
                if(minutes - freeMinutes > 0) {
                    restOfMinutes = minutes - freeMinutes;
                    minutesPrice =  restOfMinutes * everyNextMinute;

                }
                totalPriceForC = pricePerMonth + minutesPrice;
                break;
            default:
                System.out.println("Blad na wejsciu danych");
        }

        if(packet.equals("A")) {
            double differenceBetweenAndB = totalPriceForA - totalPriceForB;
            double differenceBetweenAndC = totalPriceForA - totalPriceForC;

            System.out.printf("Cena za miesiac wynosi: %.2f %n", totalPriceForA);
            System.out.printf("Wybierajac pakiet B zaoszczedzisz: %.2f %n", differenceBetweenAndB);
            System.out.printf("Wybierajac pakiet C zaoszczedzisz: %.2f %n", differenceBetweenAndC);
        } else if(packet.equals("B")) {
            double differenceBetweenBndC = totalPriceForA - totalPriceForC;

            System.out.printf("Cena za miesiac wynosi: %.2f %n", totalPriceForB);
            System.out.printf("Wybierajac pakiet B zaoszczedzisz: %.2f %n", differenceBetweenBndC);
        } else if (packet.equals("C")) {
            System.out.printf("Cena za miesiac wynosi: %.2f %n", totalPriceForC);
        }


    }
}
