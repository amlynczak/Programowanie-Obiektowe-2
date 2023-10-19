/**
 * Klasa Administracja
 * zawiera przedszkola nalezace do tej administracji w tablicy
 * 
 * @author A Mlynczak
 */
public class Administracja{
    /** tablica z przedszkolami */
    private static Przedszkole[] placowki;
    /**maksymalna liczba przedszkoli dla administracji */
    private int maxLiczbaPrzedszkoli = 5;
    /**aktualna liczba przedszkoli dla administarcji */
    private int liczbaPrzedszkoli;

    /**
     * konstruktor - inicjalizuje tablice i ustala liczbePrzedszkoli na 0
     */
    Administracja(){
        placowki = new Przedszkole[maxLiczbaPrzedszkoli];
        liczbaPrzedszkoli = 0;
    }

    /**
     * dodaje przedszkole do tablicy
     * 
     * @param preeschool - przedszkole ktore chcemy dodac
     * @return void
     */
    void addPrzedszkole(Przedszkole preschool){
        if(liczbaPrzedszkoli < maxLiczbaPrzedszkoli){
            liczbaPrzedszkoli++;
            placowki = new Przedszkole[liczbaPrzedszkoli];
            placowki[liczbaPrzedszkoli-1] = preschool;
        }else{
            System.out.println("za duza liczba przedszkoli dla tej administracji");
        }
    }

    /**
     * zwraca nam liczbe oddzialow, ktora jest w tej administracji
     * @return n - ta liczba oddzialow
     */
    public static int podajLiczbeOddzialow(){
        int n = 0;
        for(Przedszkole x: placowki){
            n = n+x.allGroups();
        }
        return n;
    };

    /**
     * zwraca liczbe dzieci uczeszczajacych do wszystkich przedszkoli
     * @return d - dzieci
     */
    public static int podajLiczbeDzieci(){
        int d = 0;
        for(Przedszkole y: placowki){
            d = d+y.allKids();
        }
        return d;
    };

    /**
     * funkcja main
     */
    public static void main(String args[]){
        Administracja adm1 = new Administracja();

        // Przedszkole 1
        Przedszkole przed1 = new Przedszkole();
        OddzialPrzedszkolny odd11 = new OddzialPrzedszkolny();
        OddzialPrzedszkolny odd12 = new OddzialPrzedszkolny();
        OddzialPrzedszkolny odd13 = new OddzialPrzedszkolny();

        for (int i = 1; i <= 5; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child1-" + i, "Nazwisko1-" + i);
            odd11.addKid(kid);
        }

        for (int i = 6; i <= 10; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child2-" + i, "Nazwisko2-" + i);
            odd12.addKid(kid);
        }

        for (int i = 11; i <= 15; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child3-" + i, "Nazwisko3-" + i);
            odd13.addKid(kid);
        }

        przed1.addGroup(odd11);
        przed1.addGroup(odd12);
        przed1.addGroup(odd13);

        // Przedszkole 2
        Przedszkole przed2 = new Przedszkole();
        OddzialPrzedszkolny odd21 = new OddzialPrzedszkolny();
        OddzialPrzedszkolny odd22 = new OddzialPrzedszkolny();
        OddzialPrzedszkolny odd23 = new OddzialPrzedszkolny();

        for (int i = 16; i <= 20; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child4-" + i, "Nazwisko4-" + i);
            odd21.addKid(kid);
        }

        for (int i = 21; i <= 25; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child5-" + i, "Nazwisko5-" + i);
            odd22.addKid(kid);
        }

        for (int i = 26; i <= 30; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child6-" + i, "Nazwisko6-" + i);
            odd23.addKid(kid);
        }

        przed2.addGroup(odd21);
        przed2.addGroup(odd22);
        przed2.addGroup(odd23);

        // Przedszkole 3
        Przedszkole przed3 = new Przedszkole();
        OddzialPrzedszkolny odd31 = new OddzialPrzedszkolny();
        OddzialPrzedszkolny odd32 = new OddzialPrzedszkolny();
        OddzialPrzedszkolny odd33 = new OddzialPrzedszkolny();

        for (int i = 31; i <= 35; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child7-" + i, "Nazwisko7-" + i);
            odd31.addKid(kid);
        }

        for (int i = 36; i <= 40; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child8-" + i, "Nazwisko8-" + i);
            odd32.addKid(kid);
        }

        for (int i = 41; i <= 45; i++) {
            Dziecko kid = new Dziecko();
            kid.setName("Child9-" + i, "Nazwisko9-" + i);
            odd33.addKid(kid);
        }

        przed3.addGroup(odd31);
        przed3.addGroup(odd32);
        przed3.addGroup(odd33);

        adm1.addPrzedszkole(przed1);
        adm1.addPrzedszkole(przed2);
        adm1.addPrzedszkole(przed3);

        int infoGrupy = adm1.podajLiczbeOddzialow();
        int infoDzieci = adm1.podajLiczbeDzieci();

        System.out.println("Liczba oddziałów w administracji: " + infoGrupy);
        System.out.println("Zsumowana liczba dzieci w przedszkolach: " + infoDzieci);
    }
};