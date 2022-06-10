package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int sum = 0;        //will sum all of user's numbers together
        double average = 0;     //will calculate average of user's numbers
        int answer;             //will store user's answer to whether they want to run the program again

        do{
            // create scanner and array
            Scanner scanner = new Scanner(System.in);
            int[] userArray = new int[10];

            // prompt user 10 times for a number and place each number into the array
            for(int i = 0; i < 10; i++){
                System.out.print("Enter a number between 0 and 99,999: ");
                userArray[i] = scanner.nextInt();
            }

            //calculate the sum by iterating through the array
            for(int j = 0; j < userArray.length; j++){
                sum += userArray[j];
            }

            //calculate the average by dividing the sum by the length of the array
            average = sum / userArray.length;

            //print sum and average, as well as ask user to decide whether to run the program again
            System.out.println("The sum of the numbers you entered is: " + sum);
            System.out.println("The average of the numbers you entered is: " + average);
            System.out.println("Do you wish to run this again? '1' for yes and '0' for no.");
            scanner.nextLine();
            answer = scanner.nextInt();
        }while(answer == 1);

    }
}