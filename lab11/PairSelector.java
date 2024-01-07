import java.time.LocalDate;

public class PairSelector<T extends Comparable<? super T>>{
    public PairSelector(){

    }

    public Pair<T> analyze(T[] tab){
        T min = tab[0];
        T max = tab[0];
        for(T el:tab){
            if(el.compareTo(min)<0){
                min = el;
            }
            if(el.compareTo(max)>0){
                max = el;
            }
        }

        Pair<T> tmp = new Pair<>(min, max);
        return tmp;
    }
}