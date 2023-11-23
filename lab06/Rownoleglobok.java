import java.lang.Math;

/**
 * klasa rownoleglobok - dwa boki oraz kat pomiedzy nimi
 * 
 * @author A Mlynczak
 */
public class Rownoleglobok extends Figura{
    public double bok1;
    public double bok2;
    private double kat;

    /**
     * konstruktor dla rownolegloboka
     * 
     * @param a - 1 bok
     * @param b - 2 bok
     * @param alfa - kat pomiedzy tymi bokami
     */
    public Rownoleglobok(double a, double b, double alfa){
        super("Rownoleglobok");
        bok1 = a;
        bok2 = b;
        if(alfa < 180){
            kat = alfa;
        }else{
            System.out.println("nieodpowiednia wartosc kąta");
        }
    }

    /**
     * zwraca pole dla rownolegloboku (wzor z sinusem)
     * 
     * @return pole
     */
    public Double getPole(){
        double pole = bok1*bok2*Math.sin(kat);
        return pole;
    }

    /**
     * zwraca obwod dla rownolegloboku
     * 
     * @return obwod
     */
    public Double getObwod(){
        return 2 * (bok1+bok2);
    }

    /**
     * specyficzne informacje dla rownolegloboku - boki oraz kat
     */
    public void infoSpecific(){
        System.out.println("boki: "+bok1+", "+bok2+", kat pomiedzy: "+kat);
    }
};