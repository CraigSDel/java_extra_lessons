package web.app.craigstroberg.twentytwenty.october.october07;

import javax.swing.*;

public class RemoveDuplicates {

    static int[] intArr = new int[100];
    static int size;

    public static void main(String[] args) {
        generateNums();
        display("Original array");
        removeDuplicates();
        display("Array without duplicates");
    }

    private static void removeDuplicates() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (intArr[i] == intArr[j]) {
                    shiftLeft(j);
                }
            }
        }
    }

    private static void shiftLeft(int position) {
        for (int i = position; i < size - 1; i++) {
            intArr[i] = intArr[i + 1];
        }
        size--;
    }

    private static void display(String head) {
        System.out.println();
        System.out.println(head);
        for (int i = 0; i < size; i++) {
            System.out.println(intArr[i] + " ");
        }
    }

    private static void generateNums() {
        size = Integer.parseInt(JOptionPane.showInputDialog("How many integers (< 100)?"));
        for (int i = 0; i < size; i++) {
//            intArr[i] = (int) (Math.random() * 20);
            intArr[i] = 1 / 0;
        }
    }
}
