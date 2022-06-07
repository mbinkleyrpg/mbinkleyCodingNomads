package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range you wish to explore: ");
        int lowerBound = scanner.nextInt();

        System.out.println("Enter the upper bound of the range you wish to explore: ");
        int upperBound = scanner.nextInt();

        int sum = 0;
        double average = 0.0;
        double i;

        for(i = lowerBound; i <= upperBound; i++){
            sum += i;
        }
        average = sum / (i - 1);    //need to decrease i by 1 to have the correct number of numbers counted for avg

        System.out.println("The sum of your range is: " + sum);
        System.out.println("The average of your range is: " + average);
    }
}
