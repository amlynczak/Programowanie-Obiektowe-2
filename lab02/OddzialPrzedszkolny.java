/**
 * Klasa OddzialPrzedszkolny
 * zawiera informacje o grupie/oddziale w przedszkolu
 * 
 * @author A Mlynczak
 */
public class OddzialPrzedszkolny{
    /**tablica zawierajaca informacje o dzieciach */
    private Dziecko[] dzieci;
    /**maksymalna liczba dzieci mozliwa do przyjecia w grupie */
    private int maxLiczbaDzieci = 20;
    /**aktualna liczba dzieci w oddizalach */
    private static int Liczbadzieci;

    /**
     * konstruktor - inicjalizuje tablice z informacjami o dzieciach oraz ustala ich liczbe w grupie na 0
     */
    OddzialPrzedszkolny(){
        dzieci = new Dziecko[maxLiczbaDzieci];
        Liczbadzieci = 0;
    }

    /**
     * dodawanie dziecka do oddzialu
     * podczas dodawania funkcja zwieksza rozmiar tablicy o kolejne dziecko
     * 
     * @param kid - obiekt klasy Dziecko ktore chcemy dodac
     * @return void
     */
    public void addKid(Dziecko kid){
        if(Liczbadzieci<maxLiczbaDzieci){
            Liczbadzieci++;
            dzieci = new Dziecko[Liczbadzieci];
            dzieci[Liczbadzieci-1] = kid;
        }else{
            System.out.println("za duzo dzieci w grupie");
        }
    }

    /**
     * dostep do liczby dzieci z zewnatrz
     * @return Liczbadzieci - ile dzieci w grupie
     */
    public static int amount(){
        return Liczbadzieci;
    }
};