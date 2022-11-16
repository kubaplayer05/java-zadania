package zadanie2if;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wage: ");
        double weight = scanner.nextDouble();
        System.out.println("podaj wzrost w cm: ");
        double height = scanner.nextDouble() / 100;

        double bmi = weight / Math.pow(height,2);
        System.out.println("BMI wynosi: " + bmi);

        if(bmi < 18.5) {
            System.out.println("masz niedowage");
        } else if(bmi <= 25) {
            System.out.println("masz poprawna wage");
        } else {
            System.out.println("masz nadwage");
        }

    }
}
