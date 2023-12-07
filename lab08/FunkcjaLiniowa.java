/**
 * klasa FunkcjaLiniowa - parametry a i b
 *
 * @author A Mlynczak
 */
public class FunkcjaLiniowa extends Funkcja{
    private double a;
    private double b;

    /**
     * kostruktor
     */
    public FunkcjaLiniowa(double _a, double _b){
        a = _a;
        b = _b;
        nazwa = "Funkcja_Liniowa";
    }

    @Override
    public double oblicz(double x){
        return a*x + b;
    }

    @Override
    public double[] miejscaZerowe(){
        double[] result;

        if(a!=0){
            result = new double[1];
            result[0] = (-b)/a;
        }else{
            result = new double[0];
        }
        return result;
    }
}