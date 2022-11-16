package zadanie2if;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCount = 3;

        System.out.println("podaj wynik 1 testu:");
        double firstTest = scanner.nextDouble();
        System.out.println("podaj wynik 2 testu:");
        double secondTest = scanner.nextDouble();
        System.out.println("podaj wynik 3 testu:");
        double thirdTest = scanner.nextDouble();

        double averageScore = (firstTest + secondTest + thirdTest) / testCount;
        int grade = 0;
        
        if(averageScore >= 90) {
            grade = 5;
        } else if (averageScore >= 80) {
            grade = 4;
        } else if (averageScore >= 70) {
            grade = 3;
        } else if (averageScore >= 60) {
            grade = 2;
        } else {
            grade = 1;
        }

        System.out.printf("Srednia wynikow z testow: %.2f %n", averageScore);
        System.out.println("Ocena: " + grade);
    }
}
