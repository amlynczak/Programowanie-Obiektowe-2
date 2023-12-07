import java.io.*;

/**
 * klasa figura dla figur - abstrakcyjna
 * 
 * @author A Mlynczak
 */
public abstract class Figura implements Save{
    public String rodzaj;

    /**
     * zwraca pole figury
     */
    public abstract double getPole();

    /**
     * zwraca obwod figury 
    */
    public abstract double getObwod();

    /**
     * zapisanie do pliku dla figury
     */
    public void zapisDoPliku()throws FileNotFoundException{
        String filename = new String(rodzaj+".txt");

        PrintWriter zapis = new PrintWriter(filename);

        zapis.println(rodzaj);
        zapis.println("Pole "+this.getPole());
        zapis.println("Obwod "+this.getObwod());
        zapis.close();
    }
}