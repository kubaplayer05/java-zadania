public class exercise6 {
    public static void main(String[] args) {
        int[] roomsWidth = {3,3,2,2};
        int[] roomsHeight = {4,4,3,2};
        int peoples = 4;

        double room1 = roomsWidth[0] * roomsHeight[0] ;
        double room2 = roomsWidth[1] * roomsHeight[1] ;
        double room3 = roomsWidth[2] * roomsHeight[2] ;
        double room4 = roomsWidth[3] * roomsHeight[3] ;

        double allRoomsArea = (room1 + room2 + room3 + room4) / peoples;

        room1 /= peoples;
        room2 /= peoples;
        room3 /= peoples;
        room4 /= peoples;

        System.out.println("1 pokój: " + room1);
        System.out.println("2 pokój: " + room2);
        System.out.println("3 pokój: " + room3);
        System.out.println("4 pokój: " + room4);
        System.out.println("Wszystkie pokoje: " + allRoomsArea);
    }
}

