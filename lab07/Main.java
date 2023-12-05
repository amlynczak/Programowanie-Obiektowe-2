import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Adres ad1 = new Adres("Reymonta", "Krakow", "31-765", 23, 3);
        //Umyslowy os1 = new Umyslowy("Jan", "Kowalski", 997, "kowal@ski.pl", LocalDate.of(1970, 2, 4), ad1);

        Adres ad2 = new Adres("Małysza", "Wisła", "12-213", 1, 0);
        //Fizyczny os2 = new Fizyczny("Adam", "Małysz", 998, "malysz@fis.pl", LocalDate.of(1980, 6, 1), ad2);

        Adres ad3 = new Adres("Krowoderska", "Krakow", "31-000", 21, 37);
        //Umyslowy os3 = new Umyslowy("Robert", "Kubica", 999, "kubica@auto.pl", LocalDate.of(1990, 5, 12), ad3);

        Pracownik emp1 = new Umyslowy("Jan", "Kowalski", 997, "kowal@ski.pl", LocalDate.of(1970, 2, 4), ad1, LocalDate.of(2000, 5, 6), 1000);
        Pracownik emp2 = new Umyslowy("Robert", "Kubica", 999, "kubica@auto.pl", LocalDate.of(1990, 5, 12), ad3, LocalDate.of(2000, 3, 3), 1500);
        Pracownik emp3 = new Fizyczny("Adam", "Małysz", 998, "malysz@fis.pl", LocalDate.of(1980, 6, 1), ad2, LocalDate.of(2020, 1, 1), 2000);

        Pracownik[] elements = {emp1, emp2, emp3};

        for (Pracownik element : elements) {
            element.info();
            System.out.println("---------------");
        }
    }
}
