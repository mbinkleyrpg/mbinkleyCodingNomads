package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        //use (array.length - 1) to print dynamic changes to the array for instructions to user about how many indexes they could search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index to determine what value is there (a number between 0-" + (array.length - 1) + "): ");
        int indexToReturnValueOf = scanner.nextInt();

        System.out.println("The element at index " + indexToReturnValueOf + " is: " + array[indexToReturnValueOf]);
    }
}