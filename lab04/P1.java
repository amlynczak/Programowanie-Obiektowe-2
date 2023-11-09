import java.util.Scanner;
import java.util.*;

/**
 * Klasa P1 - klasa, w ktorej dziala funkcja przyjmowania ciagu znakow, 
 * szeregowania cyfr w nim sie znajdujacych
 * 
 * @author A Mlynczak 
 */
public class P1{

    private static Scanner scan = new Scanner(System.in);
    private static String ciag;
    private static Boolean cont = true;

    private static StringBuilder tab_str = new StringBuilder();
    private static int[] tab = new int[0];

    /**
     * dodawanie cyfry znalezionej w ciagu znakow na koniec 
     * roboczego StringBuilder
     * 
     * @param ciag - przyjmowany z linii komend ciag znakow
     * @return tab_str - zaktualizowany StringBuilder tab_str
     */
    public static StringBuilder dodajCyfry(String ciag){
        for(int i=0; i<ciag.length(); i++){
            char c = ciag.charAt(i);
            if(Character.isDigit(c)){
                tab_str.append(c);
            }
        }
        actualState();
        return tab_str;
    }

    /**
     * wydrukowanie aktualnego stanu tablicy (StringBuilder)
     */
    private static void actualState(){
        System.out.println("Aktualny stan tablicy z cyframi:");
        System.out.println(tab_str);
    }

    /**
     * tabIntKoniec() - funkcja wywolywana po otrzymaniu komendy 
     * stopu (dla tablicy tab) - przypisuje do tablicy int odpowiednie 
     * wartosci, nastepnie sortuje ja
     * 
     * @return tab - zaktualizowana tablica, posortowana
     */
    public static int[] tabIntKoniec(){
        int[] tab = new int[tab_str.length()];
        for(int j=0; j<tab_str.length(); j++){
            tab[j] = Character.getNumericValue(tab_str.charAt(j));
        }
        Arrays.parallelSort(tab);
        return tab;
    }

    /**
     * koniec() - funkcja wywolywana po otrzymaniu komendy stopu
     * wypisuje stan tab na koniec
     * 
     * @return tab - zaktualizowana tablica
     */
    public static int[] koniec(){
        tab = tabIntKoniec();
        System.out.println(Arrays.toString(tab));
        return tab;
    }

    /**
     * czytajLinie(String ciag_str) - analiza otrzymanego ciagu znakow 
     * i nastepnie odpowiednie akcje z tym zwiazane
     * 
     * @param ciag_str - otrzymany z linii komend ciag znakow
     * 
     * @return false - wyjsce z petli while w main
     * @return true - komenda dalszego dzialania
     */
    public static boolean czytajLinie(String ciag_str){
        if(ciag_str.equals("quit")){
            tab = koniec();
            histogram();
            return false;
        }else{
            tab_str = dodajCyfry(ciag_str);
            return true;
        }
    }

    /**
     * histogram() - wyswietlenie histogramu dla tablicy int[] tab
     */
    public static void histogram(){
        System.out.println("Histogram:");
        for(int i=0; i<tab.length-1; i++){
            int tmp = tab[i];
            if(tmp == tab[i+1]){
                System.out.print(tmp+", ");
            }else{
                System.out.println(tmp);
                tmp = tab[i+1];
            }
        }
        System.out.println(tab[tab.length - 1]);
    }

    /**
     * tu to wszystko sie dzieje
     */
    public static void main(String args[]){
        while(cont){
            ciag = scan.nextLine();
            cont = czytajLinie(ciag);
        }
        System.out.println("quitting");
    }
}