import java.lang.Math;

/**
 * klasa Kolo - zawiera jego promien
 * 
 * @author A Mlynczak
 */
public class Kolo extends Figura{
    private double r;

    /**
     * kostruktor dla kola
     * 
     * @param promien - promien kola
     */
    public Kolo(double promien){
        super("Kolo");
        r = promien;
    }

    /**
     * zwraca pole kola - pi*r^2
     * 
     * @return pole
     */
    public Double getPole(){
        double pole = Math.PI * r * r;
        return pole;
    }

    /**
     * zwraca obwod kola - 2 * pi * r
     * 
     * @return obwod
     */
    public Double getObwod(){
        return 2 * Math.PI * r;
    }

    /**
     * specyficzne informacje dla kola - promien
     */
    public void infoSpecific(){
        System.out.println("promien: "+r);
    }
};