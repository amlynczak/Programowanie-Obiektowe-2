import java.util.Date;
import java.time.LocalDate;

/**
 * Klasa Czlowiek3 - posiada imie, nazwisko oraz date urodzenia - typu Date
 * 
 * @author A Mlynczak
 */
public class Czlowiek3 implements Cloneable{
    public String imie;
    public String nazwisko;
    public final Date dataUrodzenia;

    /**
     * konstruktor Czlowiek3 - przyjuje imie i nazwisko, nastepnie ustala wartosci dla pol - dziala przy pomocy this
     */
    public Czlowiek3(String fname, String lname){
        this(fname, lname, new Date(2002, 5, 26));
    }

    /**
     * konstruktor Czlowiek3 - przyjmuje dodatkowo date urodzenia - dziala tak samo jak wczesniejszy konstruktor - dziala przy pomocy this
     */
    public Czlowiek3(String fname, String lname, Date birth){
        this.imie = fname;
        this.nazwisko = lname;
        this.dataUrodzenia = (Date)birth.clone();
    }

    /**
     * wyswietla wszystkie informacje zapisane w obiekcie
     */
    public void print(){
        System.out.println(imie+" "+nazwisko+" "+dataUrodzenia);
    }

    /**
     * clone() dla klasy czlowiek3
     */
    public Czlowiek3 clone() throws CloneNotSupportedException{
        Czlowiek3 klon = (Czlowiek3)super.clone();
        Czlowiek3 klon_ret = new Czlowiek3(klon.imie, klon.nazwisko, klon.dataUrodzenia);
        return klon_ret;
    }

    /**
     * funkcja eqals sprawdzajaca czy inny element typu Czlowiek3 jest rowny this
     */
    public boolean equals(Czlowiek3 cmp){
        if(this.imie != null && this.nazwisko != null && this.dataUrodzenia != null){
            if(this.imie.equals(cmp.imie) && this.nazwisko.equals(cmp.nazwisko) && this.dataUrodzenia.equals(cmp.dataUrodzenia)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Czlowiek3 c1 = new Czlowiek3("Jan", "Kowalski");
        c1.print();

        Czlowiek3 c2 = new Czlowiek3("Jan", "Kowalski");

        c1.dataUrodzenia.setTime(2020202002);

        c1.print(); //zmienia sie wartosc dla final dataUrodzenia

        Czlowiek3 c3 = c2.clone();
        System.out.println(c3.equals(c3.clone())); //eqals sprawdza wartosc a nie referencje
    }
};