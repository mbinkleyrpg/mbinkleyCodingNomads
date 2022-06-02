package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean itsAlmostFriday = true;
        System.out.println("bool is: " + itsAlmostFriday);
        char singleChar = 'f';
        System.out.println("char is: " + singleChar);
        byte verySmallNumber = 3;
        System.out.println("byte is: " + verySmallNumber);
        short longerThanByteShorterThanInt = -32_767;
        System.out.println("short is: " + longerThanByteShorterThanInt);
        int myInt = 2_146_483_647;
        System.out.println("myInt is: " + myInt);
        long superBigNumber = 9_223_372_036_854_775_806l;       //need an l at the end if bigger than an int
        System.out.println("long is: " + superBigNumber);
        float smallestDecimalButStillBig = 34_233_654_234.234f; //need an f at the end to not be cast to double
        System.out.println("float is: " + smallestDecimalButStillBig);
        double largestDecimal = 34_233_654_234_335.32;
        System.out.println("double is: " + largestDecimal);


    }

}
