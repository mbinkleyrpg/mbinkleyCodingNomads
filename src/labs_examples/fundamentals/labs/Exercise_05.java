package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int stringLength = str.length();
        System.out.println("Length of the first string is: " + stringLength);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean strIsEqualToStr2 = str.equalsIgnoreCase(str2);
        System.out.println("String 1 is equal to String 2 (ignoring case): " + strIsEqualToStr2);

        // please concatenate str & str2 and set the result to a new String variable below
        String brandNewString = str + str2;
        System.out.println("Bringing the two strings together makes: " + brandNewString);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String changeALetter = str.replace('!', '?');
        System.out.println("Replacing the ! with a ? makes: " + changeALetter);

        String subStrings = str.substring(2, 4);
        System.out.println("The letters from 3rd and 4th spots in the first string are: " + subStrings);

        System.out.println(str + " contains a 'p'? " + str.contains("p"));

        int letterAtIndex = str2.indexOf("h");
        System.out.println("The first 'h' in the first string shows up at index #" + letterAtIndex);

        String allUpperCase = str.toUpperCase();
        System.out.println("String 1 as all upper case letters is: " + allUpperCase);
    }


}