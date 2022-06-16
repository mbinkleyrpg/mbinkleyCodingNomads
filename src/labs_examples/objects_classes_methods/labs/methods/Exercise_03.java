package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creating the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
          int x = factorial(5);
          System.out.println(x);
          //should print 120
    }

    public static int factorial(int x){
        //finding the factorial:
        //multiply number with factorial value of previous number
        if(x == 0){     //factorial of 0 is 1
            return 1;
        }

        else{
            return(x * factorial(x - 1)); //keep multiplying by previous number until you hit 0, which will multiply last number by 1 returning that result
        }
    }



}

