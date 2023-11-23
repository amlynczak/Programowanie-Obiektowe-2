import java.lang.Math;

/**
 * klasa prostokat - rownoleglobok z katem prostym
 * 
 * @author A Mlynczak
 */
public class Prostokat extends Rownoleglobok{
    /**
     * konstruktor dla Prostokata - wykorzystujemy konstruktor dla rownolegloboku
     * z katem 90 stopni
     */
    public Prostokat(double a, double b){
        super(a, b, 90.0);
        rodzaj = "Prostokat";
    }

    /**
     * zwraca pole dla prostokata
     * 
     * @return pole
     */
    public Double getPole(){
        double pole = bok1*bok2;
        return pole;
    }

    /**
     * zwraca obwod dla prostokata
     * 
     * @return obwod
     */
    public Double getObwod(){
        return 2 * (bok1+bok2);
    }

    /**
     * specyficzne informacje dla prostokata - boki
     */
    public void infoSpecific(){
        System.out.println("boki: "+bok1+", "+bok2);
    }
};