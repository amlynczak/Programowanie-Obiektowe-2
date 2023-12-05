import java.util.Date;
import java.time.LocalDate;

public abstract class Pracownik extends Osoba implements ProfessionalDataFormatter {
    public LocalDate data_zatrudnienia;
    private double pensja;

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double salary) {
        pensja = salary;
    }

    @Override
    public String getFormattedProfessionalData() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("Zatrudniony od: ");
        tmp.append(data_zatrudnienia);

        String ret = tmp.toString();
        return ret;
    }

    // Additional method to print address and professional data
    void info() {
        System.out.println(imie+" "+nazwisko);
        System.out.println(lives_at.getFormattedAddress());
        System.out.println(this.getFormattedProfessionalData());
        System.out.print("Wynagrodzenie: ");
        System.out.println(getPensja());
    }
}
