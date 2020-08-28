package org.sparta.tk;
import org.junit.jupiter.api.Test;

import org.sparta.tk.Sorters.*;
import org.sparta.tk.Sorters.BinaryTree.BinarySorter;

public class SortersTest {
    private void assertArrayEquals(int[] expected, int[] actual) {
    }
    @Test
    public void testMergeSort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSorter mergeSort = new MergeSorter();
        mergeSort.sortArray(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testBubbleSort(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        BubbleSorter bubleSort = new BubbleSorter();
        bubleSort.sortArray(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testInsertionSort(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        InsertionSorter insertionSort = new InsertionSorter();
        insertionSort.sortArray(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testQuickSort(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        QuickSorter quickSort = new QuickSorter();
        quickSort.sortArray(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testSelectionSort(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        SelectionSorter selectionSort = new SelectionSorter();
        selectionSort.sortArray(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testBinarySort(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        BinarySorter binarySort = new BinarySorter(actual[0]);
        binarySort.sortArray(actual);
        assertArrayEquals(expected, actual);
    }

}
