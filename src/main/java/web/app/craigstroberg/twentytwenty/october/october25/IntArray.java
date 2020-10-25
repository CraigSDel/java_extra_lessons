package web.app.craigstroberg.twentytwenty.october.october25;

import java.util.Random;

public class IntArray {
    int[] integers;

    public IntArray(String stringOfIntegers, char delimiter) {
        String[] s = stringOfIntegers.split(String.valueOf(delimiter));
        // We need to initialise the integers array
        // in other words we need to create it
        // in order to create or initialise the array
        // we need to give it a size
        integers = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            // We are creating an integer from
            // the string value
            integers[i] = new Integer(s[i]);
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < integers.length; i++) {
            int randomIndexToSwap = rand.nextInt(integers.length);
            int temp = integers[randomIndexToSwap];
            integers[randomIndexToSwap] = integers[i];
            integers[i] = temp;
        }
    }

    @Override
    public String toString() {
        // 1 2 3 4
        String temp = "";
        // 1,2,3
        for (int i = 0; i < (integers.length - 1); i++) {
            temp = temp + integers[i] + ",";
        }
        // 1,2,3,4
        return temp + integers[integers.length - 1];
    }
}
