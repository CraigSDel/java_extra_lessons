package web.app.craigstroberg.twentytwenty.october.october14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timon
 */
public class BubbleSort {

    static int[] arr = new int[100];
    static int size = 0;

    public static void main(String[] args) {
        generateArr();
        display("Original Array");
        bubbleSort();
        display("Sorted Array");
        System.out.println("There are " + size + " integers.");
    }//main

    static void generateArr() {
        size = 20;
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
    }//generateArr

    static void bubbleSort() {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }//if
            }//forj
        }//fori
    }//bubbleSort

    static void display(String heading) {
        System.out.println(heading);
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }//fork
        System.out.println();
    }//display
}
