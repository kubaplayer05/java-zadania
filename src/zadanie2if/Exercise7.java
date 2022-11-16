package zadanie2if;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj 1 imie:");
        String firstName = scanner.nextLine();
        System.out.println("podaj 2 imie:");
        String secondName = scanner.nextLine();
        System.out.println("podaj 3 imie:");
        String thirdName = scanner.nextLine();

        if((firstName.compareToIgnoreCase(secondName) < 0) && (firstName.compareToIgnoreCase(thirdName) < 0)) {
            if(secondName.compareToIgnoreCase(thirdName) < 0) {
                System.out.println(firstName + "\n" + secondName + "\n" + thirdName);
            } else {
                System.out.println(firstName + "\n" + thirdName + "\n" + secondName);
            }
        } else if((secondName.compareToIgnoreCase(firstName) < 0) && (secondName.compareToIgnoreCase(thirdName) < 0)) {
            if(firstName.compareToIgnoreCase(thirdName) < 0) {
                System.out.println(secondName + "\n" + firstName + "\n" + thirdName);
            } else {
                System.out.println(secondName + "\n" + thirdName + "\n" + firstName);
            }
        } else if((thirdName.compareToIgnoreCase(firstName) < 0) && (thirdName.compareToIgnoreCase(secondName) < 0)) {
            if(firstName.compareToIgnoreCase(secondName) < 0) {
                System.out.println(thirdName + "\n" + firstName + "\n" + secondName);
            } else {
                System.out.println(thirdName + "\n" + secondName + "\n" + firstName);
            }
        } else {
            System.out.println("bledne dane");
        }


    }
}
