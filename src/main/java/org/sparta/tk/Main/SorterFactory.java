package org.sparta.tk.Main;

import org.sparta.tk.Main.Starter;
import org.sparta.tk.Sorters.*;
import org.sparta.tk.Sorters.BinaryTree.BinarySorter;
import org.sparta.tk.Utilities.Printers;

public class SorterFactory {
    double TotalTime = 0;
    long TimeStart = 0;
    long TimeEnd = 0;

    public static Sorter createSorter(int sortChoice){
        switch (sortChoice){
            case 1:
                Printers.printSortMessage("Binary Sort: ");
                //Sorter binarySorter = new BinarySorter(Starter.arrayToSort[0]);
                return new BinarySorter(Starter.arrayToSort[0]);
            case 2:
                Printers.printSortMessage("Bubble Sort: ");
                return new BubbleSorter();
            case 3:
                Printers.printSortMessage("Insertion Sort: ");
                return new InsertionSorter();
            case 4:
                Printers.printSortMessage("Merge Sort: ");
                return new MergeSorter();
            case 5:
                Printers.printSortMessage("Quick Sort: ");
                return new QuickSorter();
            case 6:
                Printers.printSortMessage("Selection Sort: ");
                return new SelectionSorter();
            case 7:
                System. exit(0);
        }
        return null;
    }
}
