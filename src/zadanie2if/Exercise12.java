package zadanie2if;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz sposrod podanych: powietrze, woda, stal.");
        String environment = scanner.next();

        System.out.println("Podaj jaka odleglosc ma przebyc fala:");
        float distance = scanner.nextFloat();
        int velocity = 0;

        switch (environment) {
            case "powietrze":
                velocity = 343;
                break;
            case "woda":
                velocity = 1490;
                break;
            case "stal":
                velocity = 5100;
                break;
            default:
                System.out.println("Bledne dane wejsciowe.");
        }

        float time = distance / velocity;

        System.out.printf("Czas wynosi: %.2f %n", time);

    }
}
