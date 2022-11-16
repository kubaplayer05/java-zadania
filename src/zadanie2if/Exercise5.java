package zadanie2if;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj mase: ");
        double m = scanner.nextDouble();
        double g = 0.98;

        double F = m * g;

        if(F > 1000) {
            System.out.println("Obiket jest zbyt ciezki");
        } else if(F < 10) {
            System.out.println("Obiekt jest zbyt lekki");
        }

    }
}
