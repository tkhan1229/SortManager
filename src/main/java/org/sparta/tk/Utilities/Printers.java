package org.sparta.tk.Utilities;

public class Printers {
    public static void printMenu(){
        System.out.println("Enter the number of the sorter you wish to use:");
        System.out.println("1. Binary Sorter");
        System.out.println("2. Bubble Sorter");
        System.out.println("3. Insertion Sorter");
        System.out.println("4. Merge Sorter");
        System.out.println("5. Quick Sorter");
        System.out.println("6. Selection Sorter");
        System.out.println("7. Exit");
        System.out.println("Selection: ");
    }
    public static void requestSortSize() {
        System.out.println("Please enter the size of the array you wish to generate: ");
    }

    public static void printReturnedArray(int[] arrayToPrint) {
        for (int i=0; i<arrayToPrint.length; i++) {
            System.out.print("-" + arrayToPrint[i]+"-");
        }
    }

    public static String printSortMessage(String sorterChoice){
        return "Sorting using the " + sorterChoice;
    }

    public static void preSortArray(int[] preSortedArray){
        System.out.println("Before Sorting: ");
        printReturnedArray(preSortedArray);
    }

    }