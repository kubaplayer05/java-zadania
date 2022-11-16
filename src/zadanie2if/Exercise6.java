package zadanie2if;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe sekund:");
        int seconds = scanner.nextInt();
        int startSeconds = seconds;
        int minutes = 0, hours = 0, days = 0;

        if(seconds >= 86400) {
            days = seconds / 86400;
            seconds %= 86400;

            if(seconds >= 3600) {
                hours = seconds / 3600;
                seconds %= 3600;

                if (seconds >= 60) {
                    minutes = seconds / 60;
                    seconds %= 60;
                }
            }

            System.out.println(startSeconds + " sekund to " + days + " dni " + hours + " godzin " + minutes + " minut " );
        }

        if(seconds >= 3600) {
            hours = seconds / 3600;
            seconds %= 3600;

            if (seconds >= 60) {
                minutes = seconds / 60;
                seconds %= 60;
            }

            System.out.println(startSeconds + " sekund to " + hours + " godzin " + minutes + " minut "  + seconds + " sekund "  );
        }

        if (seconds >= 60) {
            minutes = seconds / 60;
            seconds %= 60;

            System.out.println(startSeconds + " sekund to " + minutes + " minut " + seconds + " sekund " );
        }
    }
}
