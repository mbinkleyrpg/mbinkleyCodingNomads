package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *      while(boolean condition){
 *      }
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        while(counter < 101){
            sum += counter;
            counter++;
        }

        System.out.println("The sum from 1-100 is " + sum);
    }
}
