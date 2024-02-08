import java.io.*;

class Result implements Serializable {
    long sortTime;
    long threadID;
    int smallestCount;

    Result(long sortTime, long threadID, int smallestCount) {
        this.sortTime = sortTime;
        this.threadID = threadID;
        this.smallestCount = smallestCount;
    }
}