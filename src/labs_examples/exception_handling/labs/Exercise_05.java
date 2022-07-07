package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        String[] stringsArray = {"Hello", "From", "Florida"};
        try{
            stringsArray[5] = "but it's hot.";
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("I caught it yo, now going to throw it....");
            throw arrayIndexOutOfBoundsException;
        }
    }

}