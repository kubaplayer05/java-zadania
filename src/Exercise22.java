public class Exercise22 {
    public static void main(String[] args) {

        int actions = 1000;
        double actionPrice = 32.87;
        double tax = 0.02;
        double sellPrice = 33.92;

        double buyPrice = actions * actionPrice;
        double buyTaxPrice = buyPrice * tax;
        double sell = sellPrice * actions;
        double sellTaxPrice = sell * tax;

        double profit = (sell - sellTaxPrice) - (buyPrice - buyTaxPrice);

        System.out.printf("kwota zaplacona za akcej (bez prowizji): %.2f %n", buyPrice);
        System.out.printf("wartosc prowizji za kupno akcji: %.2f %n", buyTaxPrice);
        System.out.printf("kwota otrzymana za sprzedaz (bez prowizji): %.2f %n", sell);
        System.out.printf("Zaplacona prowizja za sprzedaz: %.2f %n", sellTaxPrice);
        System.out.printf("Zysk (jesli na minusie to strata): %.2f %n", profit);
    }
}
