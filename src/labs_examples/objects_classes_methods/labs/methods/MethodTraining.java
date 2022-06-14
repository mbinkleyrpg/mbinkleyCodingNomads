package labs_examples.objects_classes_methods.labs.methods;

/*
    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
            which is passed in as an argument

    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        length of the returned list


    8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
 */

public class MethodTraining {
    public static void main(String[] args) {
        int addingStuffResultOne = addingStuff(1, 2, 3);
        int addingStuffResultTwo = addingStuff(1,2,3,4);
        int addingStuffResultThree = addingStuff(1,2);
        System.out.println("Adding with 3 addends: " + addingStuffResultOne);
        System.out.println("Adding with 4 addends: " + addingStuffResultTwo);
        System.out.println("Adding with 5 addends: " + addingStuffResultThree);

        int exampleVariable = 4;
        System.out.println("Passing by reference variable before using the method: " + exampleVariable);
        int referenceResult = passByValue(exampleVariable);
        System.out.println("Passing by reference using return value: " + referenceResult);
        System.out.println("Passing by reference variable after using the method: " + exampleVariable);

        int largestResult = returnLargest(4000,400,40,24);
        System.out.println("Out of the 4 numbers entered, the largest is: " + largestResult);

        String consonantCountingString = "Hello my name is";
        int consonantCount = countConsonants(consonantCountingString);
        System.out.println("The number of consonants in the string '" + consonantCountingString + "' is " + consonantCount);
    }

    // 1) Demonstrate method overloading in this class
    public static int addingStuff(int a, int b){
        int result = a + b;
        return result;
    }

    public static int addingStuff(int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    public static int addingStuff(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }

    //2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static int passByValue(int exampleVariable){
        exampleVariable += 5;
        System.out.println("Passing by reference while inside the method: " + exampleVariable);
        return exampleVariable;
    }

    /*public static int passByReference(int exampleVariable){
        exampleVariable = 200;
        return exampleVariable;
    }*/

    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int returnLargest(int a, int b, int c, int d){
        int max = 0;
        int temp = 0;

        if(a > b) {
            max = a;
            if(a > c){
                if(a > d){
                }
            }
        }
        else{
            max = b;
            if(b > c){
                if(b > d){
                }
            }

            else if(c > d){
                max = c;
            }
            else{
                max = d;
            }
        }
      return max;
    }

    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String stringToCountConsonants){
        int consonantCount = 0;
        char[] chars = stringToCountConsonants.toCharArray();       //send string to an array of chars
        for(char ch: chars){            //iterate through each char
            if(!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch =='u' || ch =='U'
                    || ch == ' ' || ch == '?' || ch == '!' || ch == '.')){
                    consonantCount++;
            }
        }
        return consonantCount;
    }

    //5) Write a method that will determine whether or not a number is prime
    public static Boolean isPrime(int a){
        
    }
}

class ByReference{

    int exampleVariable = 500;

}