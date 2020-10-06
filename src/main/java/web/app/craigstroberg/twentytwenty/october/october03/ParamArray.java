package web.app.craigstroberg.twentytwenty.october.october03;

import javax.swing.*;

public class ParamArray {
    public static void main(String[] args) {
        // What is parsing - Parsing is the conversion from one type to another for instance
        // You have a string value of 1 but you'd like to do maths with that number you
        // then parse that string value into a number (integer)
        //
        // Enter the number of elements what they are asking the user for how is many numbers
        // they would like to insert into the system
        int howBig = Integer.parseInt(JOptionPane.showInputDialog("Enter the elements"));
        // int arr[] = new int[100];
        int[] arr = new int[howBig];
        getValues(arr, howBig);
        display(arr, howBig);
    }

    private static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
            System.out.println("The plus one without " + arr[i] + 1);
            System.out.println("The plus one with brackets " + (arr[i] + 1));
        }
    }

    private static void getValues(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
}
