package org.sparta.tk.Sorters;

public class SelectionSorter implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        for (int i = 0; i < arrayLength-1; i++) {
            int minimum = i;
            for (int j = i+1; j < arrayLength; j++) {
                if (arrayToSort[j] < arrayToSort[minimum]) {
                    minimum = j;
                }
            }
            int temp = arrayToSort[minimum];
            arrayToSort[minimum] = arrayToSort[i];
            arrayToSort[i] = temp;
        }
        return arrayToSort;
    }
}
