/**
 * class P2 
 */
public class P2{
    /**
     * metoda pierwiastki - przyjmuje 3 parametry funckji kwadratowej i oblicza
     * delte + ewentualne miejsca zerowe funkcji
     */
    static double[] pierwiastki(double a, double b, double c){
        double delta = b*b - 4*a*c;
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

    /**
     * funkcja main - przyjumje z linii komend 3 parametry (inna liczba niewlasciwa - info)
     */
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("niewlasciwa liczba parametrow!");
        }else{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            if(a == 0){
                double x0 = -c/b;
                System.out.println("funkcja liniowa --> x0="+x0);
            }else{
                double[] pierw = pierwiastki(a, b, c);

                System.out.println("funkcja kwadratowa --> pierwiastki:");
                if(pierw.length == 0) System.out.println("brak");
                for(double x: pierw){
                    System.out.println(x);
                }
            }
        }
    }
}