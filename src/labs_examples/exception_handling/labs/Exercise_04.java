package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04{
    public static void main(String[] args) {
        try{
            //First try inside of the try
            try{
                System.out.println("Inner Try One");
                int a = 3 / 0;
                System.out.println(a);
            }
            catch(ArithmeticException arithmeticException){
                System.out.println("There was an arithmetic exception in the first inner try");
            }

            //Second try inside of the try
            try{
                System.out.println("Inner Try Two");
                int[] b = new int[2];
                b[0] = 0;
                b[1] = 1;
                b[2] = 2;

                System.out.println(b[0] + ", " + b[1] + ", " + b[2]);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.out.println("There was an array index out of bounds in second inner try");
            }
            System.out.println("Chilling after the two inner trys");
        } catch(ArithmeticException arithmeticExceptionTwo){
            System.out.println("Arithmetic exception in outer try");
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsExceptionTwo){
            System.out.println("ArrayIndexOutOfBoundsException in outer try");
        }
        catch(Exception exception){
            System.out.println("Exception that we didn't plan for in outer try");
        }
        System.out.println("Chilling after the outer try");
    }
        }