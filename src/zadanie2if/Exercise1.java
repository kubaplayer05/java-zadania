package zadanie2if;
import  java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe: ");
        int number = scanner.nextInt();
        int v = 0;
        String roman = "";

        while((number -= v) != 0) {
            if(number >= 1000) {
                v = 1000;
                roman += "M";
            } else if(number >= 900) {
                v = 900;
                roman += "CM";
            } else if(number >= 500) {
                v = 500;
                roman += "D";
            } else if(number >= 400) {
                v = 400;
                roman += "CD";
            } else if (number >= 100) {
                v = 100;
                roman += "C";
            } else if (number >= 90) {
                v = 90;
                roman += "XC";
            } else if (number >= 50) {
                v = 50;
                roman += "L";
            } else if (number >= 40) {
                v = 40;
                roman += "XL";
            } else if (number >= 10) {
                v = 10;
                roman += "X";
            } else if (number >= 9) {
                v = 9;
                roman += "IX";
            } else if (number >= 5) {
                v = 5;
                roman += "V";
            } else if (number >= 4) {
                v = 4;
                roman += "IV";
            } else if (number >= 1) {
                v = 1;
                roman += "I";
            }
        }

        System.out.println("Liczba rzymska: " + roman);

      /*  switch(nummber) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
            case 8:
                System.out.println("VIII");
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Bledne dane");
        } */
    }
}
