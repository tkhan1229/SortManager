package org.sparta.tk.Sorters;

public class InsertionSorter implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int n = arrayToSort.length;
        for (int i = 1; i < n; ++i) {
            int key = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = key;
        }
        return arrayToSort;
    }
}
