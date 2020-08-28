package org.sparta.tk.Sorters;

public class QuickSorter implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int[] sortedArray = sort(arrayToSort, 0, arrayToSort.length - 1);
        return sortedArray;
    }
    public int partition(int arrayPart[], int low, int high) {
        int pivot = arrayPart[high];
        int small = (low-1);
        for (int j=low; j<high; j++) {
            if (arrayPart[j] < pivot) {
                small++;
                int temp = arrayPart[small];
                arrayPart[small] = arrayPart[j];
                arrayPart[j] = temp;
            }
        }
        int temp = arrayPart[small+1];
        arrayPart[small+1] = arrayPart[high];
        arrayPart[high] = temp;
        return small+1;
    }

    public int[] sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        return arr;
    }
}
