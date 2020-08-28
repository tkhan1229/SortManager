package org.sparta.tk.Utilities;
import org.sparta.tk.Sorters.Sorter;

public class SpeedChecker {
    private SpeedChecker(){

    }
    public static void timer(Sorter sort, int [] arrayToSort){
        double start = System.nanoTime();
        sort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println(("\nTime Taken: " + totalTime / 1000000 + " milliseconds"));
    }
}
