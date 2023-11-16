import java.io.*;

/**
 * Klasa Biblioteka - reprezentuje biblioteke, zawiera dany zestaw ksiazek i mozna je wypozyczyc
 * 
 * @author A Mlynczak
 */
public class Biblioteka{
    private String name = "Biblioteka";
    private static Ksiazka[] books;

    /**
     * metoda zaladowania ksiazek z pliku - w tym przypadku books.txt
     * ksiazki sa przypisywane do tablicy z ksiazkami
     */
    public static void zaladujKsiazkizPliku(){
        int size = 0;
        books = new Ksiazka[size];
        try {
            BufferedReader f = new BufferedReader(new FileReader("books.txt") );
            String s; 
            int i = 1;
            while( (s = f.readLine()) != null ){
                //System.out.println( (i++)+": " + s );
                size = size+1;
                Ksiazka[] books_tmp = books;
                books = new Ksiazka[size];
                for(int j=0; j<books_tmp.length; j++){
                    books[j] = books_tmp[j];
                }
                books[size-1] = new Ksiazka(s);
                //System.out.println( (i++)+": " + s );
            }
                
        }
        catch( Throwable e ) {
            System.out.println( "Blad odczytu pliku!" );
        }
    }

    /**
     * Metoda wypozyczenia ksiazki - dana ksiazka dla danego czytelnika
     * 
     * @param Czytelnik - dany czytelnik, kotry wypozycza
     * @param autor_tytul - jaka ksiazke wypozyczamy
     */
    public static void wypozyczKsiazke(String autor_tytul, Czytelnik czyt)throws NullPointerException{
        for(int i=0; i<books.length; i++){
            if(autor_tytul.equals(books[i].info())){
                int num = czyt.wypozyczone.length;
                Ksiazka[] newWypo = new Ksiazka[num+1];
                for(int j=0; j<num; j++){
                    newWypo[j] = czyt.wypozyczone[j];
                }
                newWypo[num] = books[i];
                czyt.wypozyczone = new Ksiazka[num+1];
                czyt.wypozyczone = newWypo;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        zaladujKsiazkizPliku();
        System.out.println("Dostepne ksiazki: ");
        for(int i=0; i<books.length; i++){
            System.out.println(books[i].info());
        }
        System.out.println();

        Czytelnik czyt1 = new Czytelnik("Jan", "Kowalski", "ul. Kawiory 17, Krakow");
        Czytelnik czyt2 = new Czytelnik("Piotr", "Nowak", "ul. Wiejska 1, Warszawa");
        Czytelnik czyt3 = new Czytelnik("Adam", "Abacki", "ul. Piotrkowska 22 Lodz");

        wypozyczKsiazke("Boleslaw Prus, Lalka", czyt1);
        wypozyczKsiazke("Adam Mickiewicz, Dziady", czyt1);
        wypozyczKsiazke("Henryk Sienkiewicz, Quo Vadis", czyt2);
        wypozyczKsiazke("Zofia Nałkowska, Medaliony", czyt3);
        wypozyczKsiazke("Boleslaw Prus, Lalka", czyt3);

        PrintWriter zapis = new PrintWriter("raport.txt");
        zapis.println(czyt1.wypiszInfo());
        zapis.println("\n\n");
        zapis.println(czyt2.wypiszInfo());
        zapis.println("\n\n");
        zapis.println(czyt3.wypiszInfo());
        zapis.close();
    }
};

/**
 * rekord Ksiazka reprezentujacy pojedyncza ksiazke
 * 
 * @author A Mlynczak
 */

record Ksiazka(String autor_tytul){
    public Ksiazka(String autor_tytul){
        this.autor_tytul = autor_tytul;
    }
    public String info(){
        return autor_tytul;
    }
};