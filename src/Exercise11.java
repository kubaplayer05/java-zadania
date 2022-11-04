import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stateTaxPercentage = 0.04;
        double localTaxPercentage = 0.02;

        System.out.println("Podaj cene produktu: ");
        double price = scanner.nextDouble();

        double stateTax = price * stateTaxPercentage;
        double localTax = price * localTaxPercentage;

        double total = stateTax + localTax + price;

        System.out.println("Wartość produktu: " + price);
        System.out.println("Podatek stanowy: " + stateTax);
        System.out.println("Podatek lokalny: " + localTax);
        System.out.println("Łączna wartość: " + total);
    }
}
