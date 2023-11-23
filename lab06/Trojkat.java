import java.lang.Math;

/**
 * klasa Trojkata
 * 
 * @author A Mlynczak
 */
public class Trojkat extends Figura{
    /**
     * a, b, c - boki trojkata
     */
    private double a;
    private double b;
    private double c;

    /**
     * kontruktor dla trojkata - ustala jego boki
     * 
     * @param d - pierwszy bok
     * @param e - drugi bok
     * @param f - trzeci bok
     */
    public Trojkat(double d, double e, double f){
        super("Trojkat");
        a = d;
        b = e;
        c = f;
    }

    /**
     * zwraca pole dla trojkata - wzor Herona
     * 
     * @return pole
     */
    public Double getPole(){
        double p = (a+b+c)/2.0;
        double tmp = p * (p-a) * (p-b) * (p-c);
        double pole = Math.sqrt(tmp);
        return pole;
    }

    /**
     * zwraca obwod dla trojkata
     * 
     * @return obwod
     */
    public Double getObwod(){
        return a + b + c;
    }

    /**
     * specyficzne informacje dla tej figury - boki trojkata
     */
    public void infoSpecific(){
        System.out.println("boki: "+a+", "+b+", "+c);
    }
}