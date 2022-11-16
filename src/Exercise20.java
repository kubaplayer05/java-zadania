import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sugar = 1.5;
        double butter = 1;
        double flour = 2.75;
        int cookies = 48;

        System.out.println("Podaj ilosc ciasteczek: ");
        int cookiesCount = scanner.nextInt();
        double sugarCount = (sugar * cookiesCount) / cookies;
        double butterCount = (butter * cookiesCount) / cookies;
        double flourCount = (flour * cookiesCount) / cookies;

        System.out.println("Dla " + cookiesCount + " liczby ciasteczek:");
        System.out.println(sugarCount + " szklanki/ek cukru");
        System.out.println(butterCount + " szklanki/ek masla");
        System.out.println(flourCount + " szklanki/ek maki");
    }
}
