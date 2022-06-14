package labs_examples.arrays.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        //create new scanner and get the height and length from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the height of your array: ");
        int height = scanner.nextInt();
        System.out.println("Please enter the length of your array, this needs to be different from the height: ");
        int length = scanner.nextInt();

        //initiate the 2d array and populator variable (used to populate the indices)
        int[][] irregularArray = new int[height][length];
        int populator = 0;

        //iterate through each dimension populating each index counting by 5
        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                irregularArray[i][j] = populator * 5;
                populator++;
            }
        }

        //iterate through each dimension as it's own array to print
        //the irregularArray is the collection for the for-each loop
        for(int array[] : irregularArray) {
            for(int innerArray : array) {
                System.out.print("Value is: " + innerArray + "            ");
            }
            System.out.println();
        }
    }
}
