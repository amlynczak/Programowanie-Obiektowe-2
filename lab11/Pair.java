import java.time.LocalDate;

public class Pair<T extends Comparable<? super T>>{
    private T first;
    private T second;

    public Pair(T f, T s){
        first = f;
        second = s;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    public String toString(){
        return "("+first+", "+second+")";
    }
}