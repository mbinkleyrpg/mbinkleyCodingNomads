package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02{
    public static void main(String[] args) {
        int i = 0;
        int[] practicingEH = new int[5];
        practicingEH[0] = 1;
        practicingEH[1] = 1;
        practicingEH[2] = 1;
        practicingEH[3] = 1;
        practicingEH[4] = 1;

        divideStuff(practicingEH, i);
        i += 1;
        divideStuff(practicingEH, i);
    }

    public static int divideStuff(int[] practicingEH, int i){
        try{
            if(i == 0){
                practicingEH[5] = 1;
                return practicingEH[0] / practicingEH[1];
            }
            else{
                return practicingEH[0] / practicingEH[4];
            }

        }catch(ArithmeticException arithmeticException){
            System.out.println("You cannot divide by 0.");
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("You tried to place too many elements.");
        }
        return -1;
    }
}

