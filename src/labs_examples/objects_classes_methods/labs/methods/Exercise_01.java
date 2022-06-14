package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int multiplyResult = multiply(2, 4);
        System.out.println("The result of calling multiply with 2 and 4 is: " + multiplyResult);

        int divideResult = divide(8, 4);
        System.out.println("The result of calling divide with 8 and 4 is: " + divideResult);

       joke(1);

       int numberOfYears = 3;
       long yearsInSeconds = howManySeconds(numberOfYears);
       System.out.println("There are " + yearsInSeconds + " seconds in " + numberOfYears + " years.");

       int arrayOne = lengthOfVarargsArray("Hello", "There");
       int arrayTwo = lengthOfVarargsArray("Why", "So", "Serious?");
       int arrayThree = lengthOfVarargsArray("I'm", "king", "of", "the", "world!");
       System.out.println("The length of array one is " + arrayOne);
       System.out.println("The length of array two is " + arrayTwo);
       System.out.println("The length of array three is " + arrayThree);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
        public static int multiply(int a, int b){
            int result = a * b;
            return result;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        int result = a / b;
        return result;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(int jokeNumber){
        switch(jokeNumber){
            case 1:
                System.out.println("Joke #1 is: I just did my first lunge after ACL surgery, you could say it was a big step forward.");
                break;
            case 2:
                System.out.println("Joke #2 is: How did the shark do on his test?  He nailed it!");
                break;
            default:
                System.out.println("Next time either enter 1 or 2.  We don't have many good dad jokes yet.");
        }
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long howManySeconds(int numberOfYears){
        long yearsToSeconds = numberOfYears * 31_536_000;
                            //1 year = 365 days in a year
                            //365 days * 24 hours = 8760 hours in a year
                            //8760 hours * 60 minutes = 525_600 minutes in a year
                            //525_600 minutes * 60 seconds = 31_536_000 seconds in a year
        return yearsToSeconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int lengthOfVarargsArray(String... myArgs){
        int counter = 0;
        for(String element : myArgs){
            counter++;
        }
        return counter;
    }





}
