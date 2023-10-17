public class Main{
    public static void main(String[] args){
        String test = "Dzien dobry";
        int x = 12;
        System.out.println(test);
        //System.out.println(args[1]);
        
        Klasa k1 = new Klasa(x);
    
        k1.wypisz();
        
        int[] tab = new int[2];
        tab[0] = 1;
        tab[1] = 2;
        
        for(int i = 0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
        
        for(int y: tab){
            System.out.println(y);
        }  
    } 
}
