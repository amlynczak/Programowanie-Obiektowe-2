import java.lang.Math;

/**
 * klasa Kwadrat - prostokat o takich samych bokach
 * 
 * @author A Mlynczak
 */
public class Kwadrat extends Prostokat{
    /**
     * kostruktor dla Kwadrata - kostruktor dla prostokata z tymi samymi bokami
     */
    public Kwadrat(double a){
        super(a, a);
        rodzaj = "Kwadrat";
    }

    /**
     * specyficzne informacje dla kwadratu - dlugoc boku
     */
    public void infoSpecific(){
        System.out.println("bok: "+bok1);
    }
};