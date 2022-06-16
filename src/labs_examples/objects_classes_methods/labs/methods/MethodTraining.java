package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {

        //#1
        int addingStuffResultOne = addingStuff(1, 2, 3);
        int addingStuffResultTwo = addingStuff(1,2,3,4);
        int addingStuffResultThree = addingStuff(1,2);
        System.out.println("Adding with 3 addends: " + addingStuffResultOne);
        System.out.println("Adding with 4 addends: " + addingStuffResultTwo);
        System.out.println("Adding with 2 addends: " + addingStuffResultThree);

        //#2
        //pass by value
        int exampleVariable = 4;
        System.out.println("Passing by value variable before using the method: " + exampleVariable);
        int referenceResult = passByValue(exampleVariable);
        System.out.println("Passing by value using return value: " + referenceResult);
        System.out.println("Passing by value variable after using the method: " + exampleVariable);

        //pass by reference
        ByReference byReference = new ByReference(2);
        System.out.println("Pass by reference before calling the method to add a child: " + byReference.toString());
        passByReference(byReference);
        System.out.println("Pass by reference after returning from the method adding a child: " + byReference.toString());


        //#3
        int largestResult = returnLargest(4000,400,40,24);
        System.out.println("Out of the 4 numbers entered, the largest is: " + largestResult);

        //#4
        String consonantCountingString = "Hello my name is";
        int consonantCount = countConsonants(consonantCountingString);
        System.out.println("The number of consonants in the string '" + consonantCountingString + "' is " + consonantCount);

        //#5
        int numberToCheckForPrime = 12;
        String primeResultString;
        Boolean primeResult = isPrime(numberToCheckForPrime);
        if(primeResult == true){
                primeResultString = "prime";
        }
        else{
            primeResultString = "not prime";
        }
        System.out.println("The number " + numberToCheckForPrime + " is " + primeResultString);

        //#6
        int exampleArray[] = {1, 2, 3, 4, 5};
        int minMaxResult[] = highLowArray(exampleArray);
        System.out.println("The smallest number in the array is " + minMaxResult[0] + " and the largest number is " + minMaxResult[1]);

        //#7
        ArrayList<Integer> myArrayList = divisible(100, 5, 2);
        System.out.println("The length of the ArrayList containing all numbers between 0 and 100 that are divisible by both 5 and 2 is: " + myArrayList.size());
        int x = 0;

        //#8
        int arrayToBeReversed[] = {0, 2, 4, 6, 8, 10, 12};
        int reverseArrayResult[] = reverseTheArray(arrayToBeReversed);
        System.out.print("The array reversed is ");
        for(int j = 0; j < reverseArrayResult.length; j++){
            System.out.print(reverseArrayResult[j]);
            if((j+1) < reverseArrayResult.length - 1){        //only print a comma if there will be another element to print
                System.out.print(", ");
            }
        }
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
        System.out.println("Passing by value while inside the method: " + exampleVariable);
        return exampleVariable;
    }

    public static void passByReference(ByReference byReference) {
        byReference.numberOfChildren = byReference.numberOfChildren + 1;
        System.out.println("Pass by reference in the method after adding a child: " + byReference.toString());
    }

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
        Boolean result = true;
        int temp;
        int count;
        if(a <= 1){     //if it's 1 or less, not a prime number at all
            result = false;
            return result;
        }
        else{
            for(int i = 3; i <= a / 2; i++){        //start at 3 because we would only change to true if it's larger than 2 (2 is a prime number)
                                                    //and go to midpoint
                if((a % i) == 0){                   //if we're able to find a number between 2 and the midway point of number we are checking
                    result = false;                 //that is divisible, then it's not a prime number
                    break;
                }
            }
            return result;
        }
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //which is passed in as an argument
    public static int[] highLowArray(int[] myArray){
        int result[] = new int[2];
        int max = 0;
        int min = myArray[0];               //initialize min as the value of the first index

        for(int i = 0; i < myArray.length; i++){           //iterate through the array
            if(myArray[i] > max){
                max = myArray[i];
            }
            else{
                    if(myArray[i] < min){
                        min = myArray[i];
                    }
                }
            }
        result[0] = min;
        result[1] = max;
        return result;
    }

    //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //        length of the returned list
    public static ArrayList<Integer> divisible(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i < maxNum; i++){
            if(i % divisor1 == 0){          //if no remainder, it's divisible by divisor1
                if(i % divisor2 == 0){      //if no remainder, it's ALSO divisible by divisor2
                    result.add(i);
                }
            }
        }
        return result;
    }

    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //        variable is used to temporarily store individual values in the array
    public static int[] reverseTheArray(int[] originalArray){
        int temp;
        for(int i = 0; i < originalArray.length / 2; i++){
            temp = originalArray[i];
            originalArray[i] = originalArray[originalArray.length - i- 1];
            originalArray[originalArray.length - i - 1] = temp;
        }
        return originalArray;
    }
}

class ByReference{
    int numberOfChildren;
    public ByReference(int numberOfChildren){
        this.numberOfChildren = 1;
    }

    @Override
    public String toString() {
        return "ByReference{number of children = " + numberOfChildren + "}";
    }
}