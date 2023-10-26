import java.util.Date;
import java.time.LocalDate;

/**
 * Klasa Czlowiek2 - posiada imie, nazwisko oraz date urodzenia - typu Date
 * 
 * @author A Mlynczak
 */
public class Czlowiek2 implements Cloneable{
    public String imie;
    public String nazwisko;
    public final Date dataUrodzenia;

    /**
     * konstruktor Czlowiek2 - przyjuje imie i nazwisko, nastepnie ustala wartosci dla pol
     */
    public Czlowiek2(String fname, String lname){
        imie = fname;
        nazwisko = lname;
        dataUrodzenia = new Date(2002, 5, 25);
    }

    /**
     * konstruktor Czlowiek2 - przyjmuje dodatkowo date urodzenia - dziala tak samo jak wczesniejszy konstruktor
     */
    public Czlowiek2(String fname, String lname, Date birth){
        imie = fname;
        nazwisko = lname;
        dataUrodzenia = (Date)birth.clone();
    }

    /**
     * wyswietla wszystkie informacje zapisane w obiekcie
     */
    public void print(){
        System.out.println(imie+" "+nazwisko+" "+dataUrodzenia);
    }

    /**
     * clone() dla klasy czlowiek2
     */
    public Czlowiek2 clone() throws CloneNotSupportedException{
        Czlowiek2 klon = (Czlowiek2)super.clone();
        Czlowiek2 klon_ret = new Czlowiek2(klon.imie, klon.nazwisko, klon.dataUrodzenia);
        return klon_ret;
    }

    /**
     * funkcja eqals sprawdzajaca czy inny element typu Czlowiek2 jest rowny this
     */
    public boolean equals(Czlowiek2 cmp){
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
        Czlowiek2 c1 = new Czlowiek2("Jan", "Kowalski");
        c1.print();

        Czlowiek2 c2 = new Czlowiek2("Jan", "Kowalski");

        c1.dataUrodzenia.setTime(2020202002);

        c1.print(); //zmienia sie wartosc dla final dataUrodzenia

        Czlowiek2 c3 = c2.clone();
        System.out.println(c3.equals(c3.clone())); //eqals sprawdza wartosc a nie referencje
    }
};