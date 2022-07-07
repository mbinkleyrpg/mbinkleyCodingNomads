package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06{
    public static void main(String[] args) {
        int[] someRandomBalls = new int[2];
        String houseName = null;

        try{
            practiceQuidditch(someRandomBalls);
            houseName = "Hufflepuff";
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Hey everyone!  I caught the snitch!  The chaser *totally* didn't catch it! Go me!");
            houseName = "Gryffindor";
        }finally{
            if(houseName == null){
                houseName = "Slytherin";
            }
            System.out.println("The game is over, 150 points to " + houseName + "!");
        }
    }

    public static int practiceQuidditch(int[] someRandomBalls) throws ArrayIndexOutOfBoundsException{
        try{
            someRandomBalls[5] = 10;
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("The chaser caught the snitch, passing to the seeker because he knows what to do...");
            throw arrayIndexOutOfBoundsException;
        }
        return -1;
    }
}

