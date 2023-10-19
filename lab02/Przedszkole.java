/**
 * Klasa Przedszkole
 * zawiera tablice z oddzialami w tym przedszkolu oraz informacje potrzebne do okreslenia ilosci
 * 
 * @author A Mlynczak
 */
public class Przedszkole{
    /**tablica z oddzialami */
    private static OddzialPrzedszkolny[] grupy;
    /**maksymalna liczba oddzialow dla przedszkola */
    private int maxLiczbaOddzialow = 5;
    /**aktualna liczba oddzialow w przedszkolu */
    private static int liczbaOddzialow;

    /**
     * kostruktor - inicjalizuje tablice oddizalow oraz ustala liczbe aktualnie dzialajacych oddzialow
     */
    Przedszkole(){
        grupy = new OddzialPrzedszkolny[maxLiczbaOddzialow];
        liczbaOddzialow = 0;
    }

    /**
     * dodaje nowa grupe do przedszkola
     * zwieksza tablice o nowa grupe - sprawdza czy jeszcze mozna dodac grupe
     * 
     * @param grupa grupa ktora chemy doda
     * @return void
     */
    public void addGroup(OddzialPrzedszkolny grupa){
        if(liczbaOddzialow < maxLiczbaOddzialow){
            liczbaOddzialow++;
            grupy = new OddzialPrzedszkolny[liczbaOddzialow];
            grupy[liczbaOddzialow-1] = grupa;
            
        }else{
            System.out.println("za duza liczba oddzialow");
        }
    } 

    /**zwraca liczbe dzieci w grupach */
    public static int allKids(){
        return grupy[0].amount();
    }

    /**
     * zwraca liczbe oddzialow w przedszkolu
     */
    public static int allGroups(){
        return liczbaOddzialow;
    }
};