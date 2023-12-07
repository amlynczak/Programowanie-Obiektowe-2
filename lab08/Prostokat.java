/**
 * prostokat - dwa boki i ich dlugosci
 * 
 * @author A Mlynczak
 */
public class Prostokat extends Figura{
    public double a;
    public double b;

    /**
     * kostruktor
     */
    public Prostokat(double bok1, double bok2){
        a = bok1;
        b = bok2;
        rodzaj = "Prostokat";
    }

    @Override
    public double getPole(){
        return a*b;
    }

    @Override
    public double getObwod(){
        return 2 * (a+b);
    }
}