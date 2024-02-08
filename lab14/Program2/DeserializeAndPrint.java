import java.io.*;

public class DeserializeAndPrint {
    public static void main(String[] args) {
        for (int i = 14; i < 24; i++) {
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("../Program1/Zadanie_" + i + ".ser"))) {
                Result result = (Result) ois.readObject();

                // Print information about each thread
                System.out.println("Thread ID: " + result.threadID);
                System.out.println("Sort Time: " + result.sortTime + " ms");
                System.out.println("Smallest Count: " + result.smallestCount);
                System.out.println("--------------");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
