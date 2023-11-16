/**
 * klasa czytelnik zawierajaca wszystkie informacje dotyczace czytelnika
 * 
 * @author A Mlynczak
 */
public class Czytelnik{
    private String imie;
    private String nazwisko;
    private String email;
    private String adres;
    public Ksiazka[] wypozyczone;

    /**
     * wypisanie informacji o czytelniku - wraz z pozyczonymi ksiazkami
     * 
     */
    public String wypiszInfo(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("Czytelnik:\n");
        tmp.append(imie);
        tmp.append(" ");
        tmp.append(nazwisko);
        tmp.append("\nAdres: \n");
        tmp.append(adres);
        tmp.append("\nKsiazki wypozyczone: \n");
        if(wypozyczone != null){
            for(int i=0; i<wypozyczone.length; i++){
                tmp.append(wypozyczone[i].info());
                tmp.append("\n");
            }
        }
        String ret = tmp.toString();
        return ret;
    }

    /**
     * konstruktor
     */
    public Czytelnik(String imie, String nazwisko, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        StringBuilder tmp = new StringBuilder();
        tmp.append(imie);
        tmp.append(nazwisko);
        tmp.append("@biblioteka.pl");
        this.email = tmp.toString();
        this.adres = adres;
        wypozyczone = new Ksiazka[0];
    }
};