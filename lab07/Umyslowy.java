import java.util.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.LocalDate;

public class Umyslowy extends Pracownik {

    public Umyslowy(String name, String lname, int nrt, String email, LocalDate dat_ur, Adres address, LocalDate data, double salary) {
        imie = name;
        nazwisko = lname;
        nr_tel = nrt;
        mail = email;
        data_urodzenia = dat_ur;
        data_zatrudnienia = data;
        lives_at = address;

        setPensja(salary);
    }

    private LocalDateTime convertDateToLocalDateTime(Date date) {
        // Convert Date to LocalDateTime using the system's default time zone
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    @Override
    // Abstract method to get the full name
    public String getFullName(){
        return imie+nazwisko;
    }

    // Abstract method to get a specific detail (e.g., job title) - Replace with your specific detail
    public String getSpecificDetail(){
        return this.getFormattedProfessionalData();
    }

}
