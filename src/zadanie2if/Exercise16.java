package zadanie2if;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe zakupionych ksiazek:");
        int booksCount = scanner.nextInt();

        int points = 0;

        if(booksCount <= 0) {
            points = 0;
        } else if (booksCount == 1) {
            points = 5;
        } else if (booksCount == 2) {
            points = 15;
        } else if (booksCount == 3) {
            points = 30;
        } else {
            points = 60;
        }

        System.out.println("Liczba punktow: " + points);
    }
}
