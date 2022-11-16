package zadanie2if;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj dzien: ");
        int day = scanner.nextInt();
        System.out.println("podaj miesiac: ");
        int month = scanner.nextInt();
        System.out.println("podaj dwie ostatnie liczby roku: ");
        int year = scanner.nextInt();

        if(month * day == year) {
            System.out.println("podana data jest magiczna");
        } else {
            System.out.println("podana data nie jest magiczna");
        }

    }
}
