import java.io.*;
import java.util.Random;

/**
 * klasa funkcja abstrakcyjna
 * 
 * @author A Mlynczak
 */
public abstract class Funkcja implements Save{
    public String nazwa;

    /**
     * obliczenie wartosci funkjci w danym punkcie
     */
    public abstract double oblicz(double x);

    /**
     * obliczenie i zwrocenie miejsc zerowych funkcji
     */
    public abstract double[] miejscaZerowe();

    /**
     * zapisanie do pliku informacji o funkcji z interface
     */
    public void zapisDoPliku() throws FileNotFoundException{
        String filename = new String(nazwa+".txt");

        PrintWriter zapis = new PrintWriter(filename);

        double[] result = this.miejscaZerowe();

        zapis.println(nazwa);
        zapis.print("MiejscaZerowe ");
        for(double pier : result){
            zapis.print(pier+", ");
        }
        zapis.println(" ");
        Random rand = new Random(); 
        double random = rand.nextDouble();
        zapis.println("Wartosc funkcji w losowym punkcie("+random+"): "+this.oblicz(random));
        zapis.close();
    }
}