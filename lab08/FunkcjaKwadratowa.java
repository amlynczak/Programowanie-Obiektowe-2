/**
 * klasa Funckja Kwadratowa - posiada parametry funkcji
 * 
 * @author A Mlynczak
 */
public class FunkcjaKwadratowa extends Funkcja{
    private double a;
    private double b;
    private double c;

    /**
     * kostruktor
     */
    public FunkcjaKwadratowa(double _a, double _b, double _c){
        a = _a;
        b = _b;
        c = _c;
        nazwa = "Funkcja_Kwadratowa";
    }

    /**
     * zwraca delte dla danych parametrow
     * 
     * @return delta
     */
    public double getDelta(){
        return b*b - 4*a*c;
    }

    @Override
    public double oblicz(double x){
        return a*x*x + b*x + c;
    }

    @Override
    public double[] miejscaZerowe(){
        double delta = this.getDelta();
        double[] result;

        if(delta == 0){
            result = new double[1];
            result[0] = -b/(2*a);
        }else if(delta > 0){
            result = new double[2];
            result[0] = (-b - java.lang.Math.sqrt(delta))/(2*a);
            result[1] = (-b + java.lang.Math.sqrt(delta))/(2*a);
        }else{
            result = new double[0];
        }
        return result;
    }
}