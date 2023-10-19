/**
 * Klasa Dziecko
 * klasa zawierajaca imie i nazwisko dziecka
 * 
 * @author A Mlynczak
 */
public class Dziecko{
    /**imie dziecka */
    public String imie;
    /**nazwisko dziecka */
    public String nazwisko;

    /**
     * ustala imie oraz nazwisko dziecka na dane przez nas informacje
     * @param name imie
     * @param lname nazwisko
     * @return void - nic nie zwraca
     */
    public void setName(String name, String lname){
        imie = name;
        nazwisko = lname;
    }
};