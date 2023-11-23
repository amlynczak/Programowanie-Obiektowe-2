/**
 * Klasa Figura - glowna klasa programu, szkielet dla reszty klas - w niej jest main
 * 
 * @author A Mlynczak
 */
public class Figura{
    /**
     * rodzaj figury
     */
    public String rodzaj;

    /**
     * kostruktor dla figury - ustala jakim rodzajem jest
     * 
     * @param name - rodzaj
     */
    public Figura(String name){
        rodzaj = name;
    }

    /**
     * zwracanie pola danej figury
     * 
     * @return pole
     */
    public Double getPole(){
        return 0.0;
    }
    
    /**
     * zwracanie obwodu danej figury
     * 
     * @return obwod
     */
    public Double getObwod(){
        return 0.0;
    }

    /**
     * zwracanie rodzaju danej figury
     * 
     * @return rodzaj
     */
    public String getRodzaj(){
        return rodzaj;
    }

    /**
     * metoda do dostarczenia specyficznych informacji dla konkretnej figury
     */
    public void infoSpecific(){

    }

    /**
     * wypisanie informacji o danej figurze
     */
    public void info(){
        System.out.println(rodzaj);
        this.infoSpecific();
        System.out.println("Pole = "+this.getPole());
        System.out.println("Obwod = "+this.getObwod()+"\n");
    }

    public static void main(String[] args){

        Figura[] elements = new Figura[5];

        elements[0] = new Trojkat(10, 20, 15);
        elements[1] = new Kolo(5);
        elements[2] = new Rownoleglobok(10, 5, 45);
        elements[3] = new Prostokat(20, 30);
        elements[4] = new Kwadrat(2);

        for(Figura element: elements){
            element.info();
        }
    }
};