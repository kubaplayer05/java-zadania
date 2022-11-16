public class Exercise18 {
    public static void main(String[] args) {

        int actions = 600;
        double price = 21.77;
        double tax = 0.02;

        double priceWithoutTax = actions * price;
        double taxPrice = actions * price * tax;
        double finalPrice = priceWithoutTax + taxPrice;

        System.out.printf("Zaplacona kwota (bez prowizji) %.2f %n", priceWithoutTax);
        System.out.printf("Wysokosc prowizji %.2f %n", taxPrice);
        System.out.printf("Laczna kwota: %.2f %n", finalPrice);
    }
}
