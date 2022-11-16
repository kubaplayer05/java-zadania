import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc przejechanych km: ");
        double road = scanner.nextDouble();
        System.out.println("ilosc zuzytych litrow paliwa: ");
        double oil = scanner.nextDouble();

        double kmPerL = road / oil;

        System.out.printf("liczba kilometrow przejechanych na litrze: %.2f %n", kmPerL);
    }
}
