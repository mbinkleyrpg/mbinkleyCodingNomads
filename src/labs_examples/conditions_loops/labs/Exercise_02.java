package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7 to find out what day of the week it is: ");
        int userNumber = scanner.nextInt();

        if(userNumber < 8 && userNumber > 0){
            if(userNumber > 6){
                System.out.println("The day is Sunday");
            }
            else{
                if(userNumber > 5){
                    System.out.println("The day is Saturday");
                }
                else{
                    if(userNumber > 4){
                        System.out.println("The day is Friday");
                    }
                    else{
                        if(userNumber > 3){
                            System.out.println("The day is Thursday");
                        }
                        else{
                            if(userNumber > 2){
                                System.out.println("The day is Wednesday");
                            }
                            else{
                                if(userNumber > 1){
                                    System.out.println("The day is Tuesday");
                                }
                                else{
                                    System.out.println("The day is Monday");
                                }
                            }
                        }
                    }
                }
            }
        }
        //else statement for numbers less than 1 or greater than 7
        else{
            System.out.println("Please enter a number between 1 and 7 next time.");
        }
    }
}
