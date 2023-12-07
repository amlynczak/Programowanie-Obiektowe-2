/**
 * klasa trojkat - trzy boki
 * 
 * @author A Mlynczak
 */
public class Trojkat extends Figura{
    private double a;
    private double b;
    private double c;

    /**
     * konstruktor
     */
    public Trojkat(double bok1, double bok2, double bok3){
        a = bok1;
        b = bok2;
        c = bok3;
        rodzaj = "Trojkat";
    }

    @Override
    public double getPole(){
        double p = (a+b+c)/2.0;
        double tmp = p * (p-a) * (p-b) * (p-c);
        double pole = Math.sqrt(tmp);
        return pole;
    }

    @Override
    public double getObwod(){
        return a+b+c;
    }
}