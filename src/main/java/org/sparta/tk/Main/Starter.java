package org.sparta.tk.Main;

import org.sparta.tk.Exceptions.InvalidMenuSelection;
import org.sparta.tk.Sorters.Sorter;
import org.sparta.tk.Utilities.MenuUtil;
import org.sparta.tk.Utilities.Printers;
import org.sparta.tk.Utilities.SpeedChecker;

import java.util.Scanner;

public class Starter {
    public static int[] arrayToSort;
    public static void main(String[] args) throws InvalidMenuSelection {
        Printers.printMenu();
        Scanner scan = new Scanner(System.in);
        int sortChoice = scan.nextInt();
        MenuUtil.checkOption(sortChoice);

        Printers.requestSortSize();
        int arraySize = scan.nextInt();
        MenuUtil.checkOption(arraySize);

        arrayToSort = MenuUtil.returnRandomGeneratedArray(arraySize);

        Printers.preSortArray(arrayToSort);
        Sorter sort = SorterFactory.createSorter(sortChoice);

        System.out.println("\nAfter Sorting:");
        Printers.printReturnedArray(sort.sortArray(arrayToSort));

        SpeedChecker.timer(sort, arrayToSort);
    }
}
