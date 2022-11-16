import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ulubione miasto: ");
        String favCity = scanner.nextLine();

        System.out.println("Ilosc znakow: " + favCity.length());
        System.out.println("Z duzych liter: " + favCity.toUpperCase());
        System.out.println("Z malych liter: " + favCity.toLowerCase());
        System.out.println("Pierwsza liter: " + favCity.charAt(0));
    }
}
