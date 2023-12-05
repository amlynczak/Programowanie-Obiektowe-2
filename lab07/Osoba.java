import java.util.Date;
import java.time.LocalDate;

public abstract class Osoba {
    public String imie; // first name
    public String nazwisko; // last name
    public int nr_tel; // phone number
    public String mail; // email
    public LocalDate data_urodzenia; // date of birth

    public Adres lives_at; // address

    // Abstract method to get the full name
    public abstract String getFullName();

    // Abstract method to get a specific detail (e.g., job title) - Replace with your specific detail
    public abstract String getSpecificDetail();
}
