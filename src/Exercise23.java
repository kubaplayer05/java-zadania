import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj dlugosc rzedu: ");
        double r = scanner.nextDouble();
        System.out.println("podaj ilosc miejsca zajmowanego przez okratowanie: ");
        double e = scanner.nextDouble();
        System.out.println("podaj odleglosc miedzy sadzonkami: ");
        double s = scanner.nextDouble();

        double v = Math.round((r - 2*e) / s);

        System.out.println("Ilosc sadzonek w rzedzie: " + v);
    }
}
