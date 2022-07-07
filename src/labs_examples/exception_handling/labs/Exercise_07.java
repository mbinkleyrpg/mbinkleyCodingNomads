package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07{
    public static void main(String[] args) {
        String schoolReport = "Red";
        try{
            goToThePool(schoolReport);
        }catch(BadAtSchoolException badAtSchoolException){
            System.out.println("The answer to if you can go to the pool is no because:");
            System.out.println(badAtSchoolException.toString());
        }
    }

    public static void goToThePool(String schoolReport) throws BadAtSchoolException{
        if(schoolReport == "Red"){
            throw new BadAtSchoolException();
        }
        else{
            return;
        }
    }
}