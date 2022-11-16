package zadanie2if;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int staticDistance = 500;
        int multiplier = 1;

        System.out.println("podaj odleglosc:");
        int distance = scanner.nextInt();
        System.out.println("podaj wage przesylki:");
        double weight = scanner.nextDouble();

        double price = 0;

        if(weight <= 1) {
            price = 1.1;
        } else if (weight <= 3) {
            price = 2.2;
        } else if (weight <= 5) {
            price = 3.7;
        } else if (weight > 5) {
            price = 3.8;
        }

        if(distance % staticDistance > 0) {
            multiplier += distance / staticDistance;
        }

        double totalPrice = price * multiplier;

        System.out.printf("calkowity koszt: %.2f zl",totalPrice);
    }
}
