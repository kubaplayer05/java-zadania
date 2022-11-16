import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zdeponowana kwote pienidedzy: ");
        double money = scanner.nextDouble();
        System.out.println("podaj roczna stope oprocentowania: ");
        double r = scanner.nextDouble() / 100;
        System.out.println("podaj ile razy do roku odsetki sa kapitalizowane: ");
        int n = scanner.nextInt();
        System.out.println("podaj ilosc lat przez ktory srodki beda na koncie: ");
        int t = scanner.nextInt();

        double score = money * Math.pow((1 + r/n), n*t);

        System.out.printf("Wyliczona kwota: %.3f %n", score);
    }
}
