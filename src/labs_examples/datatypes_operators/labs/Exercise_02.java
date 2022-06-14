package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        //widening
        int myInt = 10;
        double myDouble = myInt;
        System.out.println("The Double is: " + myDouble);

        //narrowing
        double newDouble = 10.5;
        int newInt = (int) newDouble;
        System.out.println("The Int is: " + newInt);
        //the fractional part ("0.5") is lost in garbage collection
    }
}
