package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        String str = "one";

        switch (str){
            case "one":
                int i = 1;
                System.out.println(i);
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            default:
                System.out.println("-1");
                break;
        }
    }
}
