import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Integer[] tabInt = {2, 4, 6, 8, 19, 10, 16};

        PairSelector<Integer> pairSelInt = new PairSelector<Integer>();
        Pair<Integer> pairInt = pairSelInt.analyze(tabInt); 
        System.out.println(pairInt.toString());

        //--------------------------------//

        LocalDate[] tabDate = {LocalDate.parse("2024-01-04"), LocalDate.parse("2020-01-01"), LocalDate.parse("2007-12-07")};

        PairSelector<LocalDate> pairSelDate = new PairSelector<LocalDate>();
        Pair<LocalDate> pairDate = pairSelDate.analyze(tabDate);
        System.out.println(pairDate.toString());

        //--------------------------------//

        Boolean[] tabBool = {true, false, true, false, false};

        PairSelector<Boolean> pairSelBool = new PairSelector<Boolean>();
        Pair<Boolean> pairBool = pairSelBool.analyze(tabBool);
        System.out.println(pairBool.toString());

    }
}