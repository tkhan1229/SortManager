package org.sparta.tk.Utilities;

import org.sparta.tk.Exceptions.InvalidMenuSelection;

import java.util.Random;

public class MenuUtil {
    public static void checkOption(int optionSelection) throws InvalidMenuSelection {
        if (optionSelection < 1) {
            throw new InvalidMenuSelection();
        }
    }

    public static int[] returnRandomGeneratedArray(int sizeOfArray){
        Random random = new Random();
        int[] generatedArray = new int[sizeOfArray];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = Math.abs(random.nextInt() % 100);
        }
        return generatedArray;
    }
}
