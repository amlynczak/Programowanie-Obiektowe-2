import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Tadeusz {
    public static LinkedList<String> readPanTadeusz() {
        LinkedList<String> tmp = new LinkedList<>();

        try {
            Scanner sc = new Scanner(new File("Pan Tadeusz.txt"));
            String s;
            while (sc.hasNext()) {
                s = sc.next();
                tmp.add(s);
            }
            sc.close();
        } catch (Throwable e) {
            System.out.println("BLAD");
        }

        return tmp;
    }

    public static int counter(LinkedList<String> book) {
        Set<String> uniqueWords = new HashSet<>(book);
        return uniqueWords.size();
    }

    public static void main(String[] args) {
        LinkedList<String> PT = readPanTadeusz();

        int liczba = counter(PT);

        System.out.println("liczba slow: " + liczba);
    }
}
