import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] roomsWidth = new int[4];
        int[] roomsLenght = new int[4];

        System.out.println("Podaj wymiary 1 pokoju: ");
        roomsWidth[0] = scan.nextInt();
        roomsLenght[0] = scan.nextInt();

        System.out.println("Podaj wymiary 2 pokoju: ");
        roomsWidth[1] = scan.nextInt();
        roomsLenght[1] = scan.nextInt();

        System.out.println("Podaj wymiary 3 pokoju: ");
        roomsWidth[2] = scan.nextInt();
        roomsLenght[2] = scan.nextInt();

        System.out.println("Podaj wymiary 4 pokoju: ");
        roomsWidth[3] = scan.nextInt();
        roomsLenght[3] = scan.nextInt();


        int peoples = 4;

        double room1 = roomsWidth[0] * roomsLenght[0] ;
        double room2 = roomsWidth[1] * roomsLenght[1] ;
        double room3 = roomsWidth[2] * roomsLenght[2] ;
        double room4 = roomsWidth[3] * roomsLenght[3] ;

        double allRoomsArea = (room1 + room2 + room3 + room4) / peoples;

        room1 /= peoples;
        room2 /= peoples;
        room3 /= peoples;
        room4 /= peoples;

        System.out.println("Powierzchnia przypadająca dla 1 z 4 osób.");
        System.out.println("1 pokój: " + room1);
        System.out.println("2 pokój: " + room2);
        System.out.println("3 pokój: " + room3);
        System.out.println("4 pokój: " + room4);
        System.out.println("Wszystkie pokoje: " + allRoomsArea);
    }
}