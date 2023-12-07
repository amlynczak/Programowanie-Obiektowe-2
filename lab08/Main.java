import java.io.*;

/**
 * klasa Main - tu dzieje sie wszystko
 * 
 * @author A Mlynczak
 */
public class Main{
    public static void main(String[] args)throws FileNotFoundException{
        Figura[] figures = new Figura[3];

        figures[0] = new Trojkat(5, 6, 10);
        figures[1] = new Prostokat(5, 10);
        figures[2] = new Kwadrat(6);

        Funkcja[] funkcje = new Funkcja[2];

        funkcje[0] = new FunkcjaLiniowa(4, 6);
        funkcje[1] = new FunkcjaKwadratowa(2, 6, 1);

        for(Figura figure : figures){
            figure.zapisDoPliku();
        }

        for(Funkcja fun : funkcje){
            fun.zapisDoPliku();
        }
    }
}