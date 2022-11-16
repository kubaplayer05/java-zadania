import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int portion = 10;
        int kcalPerPortion = 300;
        int kcalPerCookie = kcalPerPortion / portion;

        System.out.println("podaj ilosc zjedzonych ciasteczek: ");
        int cookies = scanner.nextInt();

        int kcal = cookies * kcalPerCookie;

        System.out.println("Ilosc kalori: " + kcal);

    }
}
