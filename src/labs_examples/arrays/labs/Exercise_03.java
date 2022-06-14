package labs_examples.arrays.labs;

import java.sql.Array;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] my2dArray = new int[5][5];
        int counter = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                my2dArray[i][j] = counter + 3;
                counter += 3;
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(my2dArray[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
