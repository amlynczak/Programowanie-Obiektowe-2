import java.io.*;
import java.util.Arrays;

class Sorter implements Runnable {
    private int[] arr;

    Sorter(int[] tab) {
        this.arr = tab;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        Arrays.sort(array);

        long endTime = System.currentTimeMillis();
        long sortTime = endTime - startTime;

        int smallest = array[0];
        int smallestCount = 1;

        for (int i = 1; i < array.length && array[i] == smallest; i++) {
            smallestCount++;
        }

        Result result = new Result(sortTime, Thread.currentThread().getId(), smallestCount);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Zadanie_" + Thread.currentThread().getId() + ".ser"))) {
            oos.writeObject(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}