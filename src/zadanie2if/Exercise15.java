package zadanie2if;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe czekow:");
        int checkCount = scanner.nextInt();

        double totalPrice = 0;
        int staticPrice = 10;
        double pricePerCheck = 0;

        if(checkCount < 20) {
            pricePerCheck = 0.10;
        } else if (checkCount < 40) {
            pricePerCheck = 0.08;
        } else if (checkCount < 60) {
            pricePerCheck = 0.06;
        } else {
            pricePerCheck = 0.04;
        }

        totalPrice = staticPrice + checkCount * pricePerCheck;

        System.out.printf("Do zaplaty masz: %.2f %n", totalPrice);
    }
}
