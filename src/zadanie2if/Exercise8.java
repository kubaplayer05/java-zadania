package zadanie2if;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double discount = 1;
        int price = 99;
        System.out.println("podaj ilosc kupiomych pakietow:");
        int packets = scanner.nextInt();

        int totalPriceWithoutDiscount = packets * price;

        if(packets >= 100) {
            discount -= 0.5;
        } else if(packets >= 50) {
            discount -= 0.4;
        } else if (packets >= 20) {
            discount -= 0.3;
        } else if (packets >= 10) {
            discount -= 0.2;
        }

        double totalPrice = totalPriceWithoutDiscount * discount;
        double discountCount = (1 - discount) * 100;

        System.out.println("poziom rabatu: " + discountCount + "%" );
        System.out.println("cena po rabacie: " + totalPrice);
    }
}
