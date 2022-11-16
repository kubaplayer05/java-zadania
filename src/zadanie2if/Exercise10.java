package zadanie2if;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe kalori:");
        double calories = scanner.nextDouble();
        System.out.println("podaj liczbe gramow tluszczu:");
        double fat = scanner.nextDouble();

        double fatCalories = fat * 9;

        double percentage = fatCalories / calories;

        if(fatCalories > calories) {
            System.out.println("bledne dane");
        } else if (percentage < 0.3) {
            System.out.println("Uwaga, produkt niskotluszczowy");
        }
    }
}
