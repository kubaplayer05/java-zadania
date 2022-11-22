package zadanie2if;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podawaj wartosci: tak lub nie");

        System.out.println("Czy ktos jest na diecie wegetarianskiej:");
        String weget = scanner.next();
        System.out.println("Czy ktos jest na diecie weganskiej:");
        String wegan = scanner.next();
        System.out.println("Czy ktos jest na diecie bezglutenowej:");
        String gluten = scanner.next();

        System.out.println("Mozecie sie udac do tych restauracji:");

        if(weget.equals("nie") && wegan.equals("nie") && gluten.equals("nie")) {
            System.out.println("Luksusowe Burgery u Jarka"); // weget: nie wegan: nie gluten: nie
            System.out.println("Pizzeria przy Dworcowej"); // weget: tak wegan: nie gluten: tak
            System.out.println("Kawiarnia na Rogu"); // weget: tak wegan: tak gluten: tak
            System.out.println("Włoskie Specjały"); // weget: tak wegan: nie gluten: nie
            System.out.println("Kuchnia u Szefa"); // weget: tak wegan: tak gluten: tak
        } else if(weget.equals("tak") && wegan.equals("nie") && gluten.equals("nie")) {
            System.out.println("Pizzeria przy Dworcowej"); // weget: tak wegan: nie gluten: nie
            System.out.println("Kawiarnia na Rogu"); // weget: tak wegan: tak gluten: tak
            System.out.println("Włoskie Specjały"); // weget: tak wegan: nie gluten: nie
            System.out.println("Kuchnia u Szefa"); // weget: tak wegan: tak gluten: tak
        } else if (weget.equals("nie") && wegan.equals("tak") && gluten.equals("nie")) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else if (weget.equals("nie") && wegan.equals("nie") && gluten.equals("tak")) {
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else if (weget.equals("tak") && wegan.equals("tak") && gluten.equals("nie")) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else if (weget.equals("tak") && wegan.equals("nie") && gluten.equals("tak")) {
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else if (weget.equals("nie") && wegan.equals("tak") && gluten.equals("tak")) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else if (weget.equals("tak") && wegan.equals("tak") && gluten.equals("tak")) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else {
            System.out.println("Blad danych");
        }
    }
}
