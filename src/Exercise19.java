import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise19 {
    public static void main(String[] args) {
        int peoples = 12467;
        double oneDrink = 0.14;
        double citrus = 0.64;

        double firstScore = (peoples * oneDrink);
        double secondScore = (peoples * citrus);

        DecimalFormat df_obj = new DecimalFormat("#");
        df_obj.setRoundingMode(RoundingMode.FLOOR);

        System.out.println("Wsrod ankietowanych (" + peoples + ")\n14% kupuje 1 napoj tygodniowo czyli: " + df_obj.format(firstScore) +
                "\na 64% preferuje smak cytrusowy: " + df_obj.format(secondScore));
    }
}
