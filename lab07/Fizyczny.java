import java.util.Date;
import java.time.LocalDate;

public class Fizyczny extends Pracownik{
    public Fizyczny(String name, String lname, int nrt, String email, LocalDate dat_ur, Adres address, LocalDate data, double salary){
        imie = name;
        nazwisko = lname;
        nr_tel = nrt;
        mail = email;
        data_urodzenia = dat_ur;
        data_zatrudnienia = data;
        lives_at = address;
        setPensja(salary);
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