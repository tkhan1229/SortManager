# Sort Manager

Sort Manager is a Java program that looks at sorting a string of randomly generated integers into ascending order using various sort methods through the console. These sort methods are compared against each other though a metric measurement of performance speed in milliseconds. 
The sorting algorithms used are as follows:
- Binary Tree Sort
- Bubble Sort
- Quick Sort
- Insertion Sort
- Merge Sort 
- Selection Sort

[Sort Manager](Screenshot%202020-08-28%20at%2016.01.23.png)

## Installation

Clone the repository and open the program folder using a Java IDE such as IntelliJ to compile the classes.

## How It Works
1. Compile and run project.
2. Open the console and view the menu.
3. Select the sorting algorithm and insert size of random array.
4. The program will list the unordered array, sorted array and performance time.

## Usage

```
Printers.preSortArray(arrayToSort); //returns random generated array of chosen size
Printers.printReturnedArray(sort.sortArray(arrayToSort)); //returns sorted array using a sorting algorithm 
SpeedChecker.timer(sort, arrayToSort); //assesses performance speed of sorting algorithm 
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
