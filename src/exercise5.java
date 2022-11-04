public class exercise5 {
    public static void main(String[] args) {
        int roomsWidth[] = {3,3,2,2};
        int roomsHeight[] = {4,4,3,2};

        int room1 = roomsWidth[0] * roomsHeight[0];
        int room2 = roomsWidth[1] * roomsHeight[1];
        int room3 = roomsWidth[2] * roomsHeight[2];
        int room4 = roomsWidth[3] * roomsHeight[3];

        int allRoomsArea = room1 + room2 + room3 + room4;

        System.out.println("1 pokój: " + room1);
        System.out.println("2 pokój: " + room2);
        System.out.println("3 pokój: " + room3);
        System.out.println("4 pokój: " + room4);
        System.out.println("Wszystkie pokoje: " + allRoomsArea);
    }
}
