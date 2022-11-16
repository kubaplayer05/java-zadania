import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj cene posilku: ");
        double price = scanner.nextDouble();

        double tax = 0.0675 * price;
        double tip = (tax + price) * 0.2;

        double sum = price + tax + tip;

        System.out.println("cena posilku: " + price);
        System.out.printf("wartosc podatku: %.2f %n", tax);
        System.out.printf("wysokosc napiwku: %.2f %n", tip);
        System.out.printf("laczna kwota: %.2f %n", sum);
    }
}
