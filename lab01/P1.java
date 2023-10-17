/**
 * klasa P1
 */

public class P1{
    /**
     * funkcja main, ktora przyjmuje 3 parametry - dwie liczby i znak dzialania
     * nastepnie wykonuje to dzialanie
     */
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double result;

        switch(args[2]){
            case "+":
                result=x+y;
                System.out.println("wynik: "+result);
                break;
            case "-":
                result=x-y;
                System.out.println("wynik: "+result);
                break;
            case "*":
                result=x*y;
                System.out.println("wynik: "+result);
                break;
            case "/":
                result=x/y;
                System.out.println("wynik: "+result);
                break;
            default:
                System.out.println("zly operator");
                break;
        }
    }
}