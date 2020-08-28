package org.sparta.tk;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sparta.tk.Sorters.BinaryTree.BinarySorter;
import org.sparta.tk.Sorters.Sorter;

import java.util.Arrays;
import java.util.Random;
import org.sparta.tk.Sorters.*;
import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    private static int[] unsortedArray;
    private static int[] arrayToSort;

    @BeforeClass
    public static void randomArrayInitialiser(){
        Random random = new Random();
        arrayToSort = new int[100];
        for (int i = 0; i < 100; i++){
            arrayToSort[i] = random.nextInt(1000)+1;
        }
        unsortedArray = arrayToSort.clone();
    }

    private void printResults(double totalTime, int[] sortedArray) {
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));
        System.out.println("\nPerformance Speed: " + totalTime / 1000000 + " milliseconds");
    }

    @Test
    public void testBubbleSort(){
        Sorter sorter = new BubbleSorter();
        double start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        double end = System.nanoTime();
        double totalTime = (end - start);
        printResults(totalTime, sortedArray);
    }
    @Test
    public void testInsertionSort(){
        Sorter sorter = new InsertionSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        printResults(totalTime, sortedArray);
    }
    @Test
    public void testMergeSort(){
        Sorter sorter = new MergeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        printResults(totalTime, sortedArray);
    }
    @Test
    public void testQuickSort(){
        Sorter sorter = new QuickSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        printResults(totalTime, sortedArray);
    }
    @Test
    public void testSelectionSort(){
        Sorter sorter = new SelectionSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        printResults(totalTime, sortedArray);
    }
    @Test
    public void testBinarySort(){
        Sorter sorter = new BinarySorter(unsortedArray[0]);
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        printResults(totalTime, sortedArray);
    }
}
