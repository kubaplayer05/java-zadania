import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String firstName = scanner.nextLine();

        System.out.println("Podaj drugie imię: ");
        String middleName = scanner.nextLine();

        System.out.println("Podaj Nazwisko: ");
        String lastName = scanner.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("imie: " + firstName + "\ninicjał imienia: " + firstInitial);
        System.out.println("drugie imie: " + middleName + "\ninicjał drugiego imienia: " + middleInitial);
        System.out.println("nazwisko: " + lastName + "\ninicjał nazwiska: " + lastInitial);
    }
}
