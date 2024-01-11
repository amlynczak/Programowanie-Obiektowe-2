import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Iter{
    public static void main(String[] args){
        ArrayList<Integer> randList = new ArrayList<>();

        Random rand = new Random();

        for(int i=0; i<40; i++){
            randList.add(rand.nextInt(100));
        }

        System.out.println("list: "+ randList);

        //---------------------------------//

        ListIterator<Integer> iter = randList.listIterator();
        ArrayList<Integer> parzyste = new ArrayList<>();

        while(iter.hasNext()){
            int id = iter.nextIndex();
            int tmp = iter.next();
            if(tmp%2 != 0){
                tmp = tmp+1;
                randList.set(id, tmp);
            }else{
                parzyste.add(id);
            }
        }
        

        System.out.println("list: "+ randList);
        System.out.println("parzyste: "+parzyste);

        //---------------------------------//

        ListIterator<Integer> parzys_iter = parzyste.listIterator();
        while(parzys_iter.hasNext()){
            parzys_iter.next();
        }

        while(iter.hasPrevious() && parzys_iter.hasPrevious()){
            int id = iter.previousIndex();
            int id_parz = parzys_iter.previous();
            int tmp = iter.previous();
            if(id == id_parz){
                tmp = tmp+1;
                randList.set(id, tmp);
            }else{
                parzys_iter.next();
            }
        }

        System.out.println("list: "+ randList);

    }
}