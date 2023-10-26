import java.time.LocalDate;

/**
 * Klasa Czlowiek - zawiera imie, nazwisko oraz date urodzenia
 * 
 * @author A Mlynczak
 */
public class Czlowiek implements Cloneable{
    public String imie;
    public String nazwisko;
    public LocalDate dataUrodzenia;

    /**
     * Konstruktor dla klasy przyjmujacy imie i nazwisko i ustalajacy wartosci pol w klasie
     */
    public Czlowiek(String fname, String lname){
        imie = fname;
        nazwisko = lname;
        dataUrodzenia = LocalDate.now();
    }
    
    /**
     * clone() dla klasy czlowiek
     */
    public Czlowiek clone() throws CloneNotSupportedException{
        return (Czlowiek)super.clone();
    }

    /**
     * funkcja eqals sprawdzajaca czy inny element typu Czlowiek jest rowny this
     */
    public boolean equals(Czlowiek cmp){
        if(this.imie != null && this.nazwisko != null && this.dataUrodzenia != null){
            if(this.imie == cmp.imie && this.nazwisko == cmp.nazwisko && this.dataUrodzenia == cmp.dataUrodzenia){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Czlowiek c1 = new Czlowiek("Jan", "Kowalski");
        
        if(c1==c1.clone()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(c1.equals(c1.clone())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
};