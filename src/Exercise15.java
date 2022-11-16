import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double margin = 0.4;

        System.out.println("podaj cene plytki: ");
        double price = scanner.nextDouble();

        double profit = price * margin;

        System.out.printf("Zysk wynosi: %.2f %n", profit);
    }
}
