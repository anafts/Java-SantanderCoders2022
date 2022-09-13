
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args) {

        String name = "Luna";
        String say = "";

        LocalDate today = LocalDate.now(); // date in numbers
        LocalDateTime now = LocalDateTime.now(); // date in hours
        Locale brazil = new Locale("pt", "BR"); // translate to portuguese
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brazil); // date in portuguese

        System.out.println(today);
        System.out.println(today.getDayOfWeek()); // date in day of the week


        if (now.getHour() >= 0 && now.getHour() < 12) {
            say = "Bom dia!";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            say = "Boa tarde!";
        } else if (now.getHour() >= 18 && now.getHour() < 24) {
            say = "Boa noite!";
        } else {
            say = "Olá!";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s %n", name, dayOfWeek, say.toUpperCase());
    }
}