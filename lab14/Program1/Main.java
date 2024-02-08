import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int[] arr = new int[100000];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(1000) + 1;
            }

            Thread thread = new Thread(new Sorter(arr));
            thread.start();
        }
    }
}