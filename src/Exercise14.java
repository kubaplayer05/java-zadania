import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCount = 3;

        System.out.println("podaj wynik z 1 testu: ");
        double firstScore = scanner.nextDouble();
        System.out.println("podaj wynik z 2 testu: ");
        double secondScore = scanner.nextDouble();
        System.out.println("podaj wynik z 3 testu: ");
        double thirdScore = scanner.nextDouble();

        double averageScore = (firstScore + secondScore + thirdScore) / testCount;

        System.out.println("wynik z 1 testu: " + firstScore);
        System.out.println("wynik z 2 testu: " + secondScore);
        System.out.println("wynik z 3 testu: " + thirdScore);
        System.out.printf("Srednia: %.2f %n",averageScore);
    }
}
