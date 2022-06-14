package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search for the first vowel: ");
        String myWord = scanner.nextLine();

        int counter = 0;
        int foundIt = 0;
        char firstVowel = '-';

        while (counter < myWord.length()) {
            if (myWord.charAt(counter) == 'a' || myWord.charAt(counter) == 'A') {
                foundIt = counter;
                firstVowel = 'a';
                counter = (myWord.length() + 1);
            } else if ((myWord.charAt(counter) == 'e' || myWord.charAt(counter) == 'E')) {
                foundIt = counter;
                firstVowel = 'e';
                counter = (myWord.length() + 1);
            } else if (myWord.charAt(counter) == 'i' || myWord.charAt(counter) == 'I') {
                foundIt = counter;
                firstVowel = 'i';
                counter = (myWord.length() + 1);
            } else if ((myWord.charAt(counter) == 'o' || myWord.charAt(counter) == 'O')) {
                foundIt = counter;
                firstVowel = 'o';
                counter = (myWord.length() + 1);
            } else if ((myWord.charAt(counter) == 'u' || myWord.charAt(counter) == 'U')) {
                foundIt = counter;
                firstVowel = 'u';
                counter = (myWord.length() + 1);
            } else {
                counter++;
                foundIt = -1;
            }
        }
        if(foundIt == -1){
            System.out.println("There are no vowels in this word.");
        }
        else {
            System.out.println("The word we are searching is '" + myWord + "'");
            System.out.println("The first vowel in the word is '" + firstVowel + "'");
            System.out.println("The first vowel is found at index #" + foundIt);
        }
    }
}
