package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
public class Exercise_01{
    public static void main(String[] args) {
        int[] partyTime = new int[5];
        iteratePast(partyTime);
    }

    public static int iteratePast(int[] partyTime){
        try{
            partyTime[6] = 5;
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Yo you can't do that, may need to use an array list...");
        }

        return partyTime.length;
    }
}

