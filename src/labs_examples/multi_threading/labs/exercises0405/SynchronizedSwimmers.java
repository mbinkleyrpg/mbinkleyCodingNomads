package labs_examples.multi_threading.labs.exercises0405;

/**
 * Synchronized "sending" thread for exercise 4
 *
 */
public class SynchronizedSwimmers {
    public void jump(String jumpType){
        System.out.println("Beginning the " + jumpType + " jump!");
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("Thread was interrupted");
        }

    }
}
