package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
import java.math.BigDecimal;

public class Exercise_03{
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(3);

        try{
            //comment next two lines to test finally block
            a = a.divide(b);
            System.out.println(a.toString());

            //uncomment next two lines to test finally block
            //a = a.multiply(b);
            //System.out.println(a.toString());
        }catch(ArithmeticException arithmeticException){
            System.out.println("Dividing these two BigDecimals leads to non-terminating decimals....");
        }finally{
            System.out.println("This will run no matter what.");
        }
    }
}