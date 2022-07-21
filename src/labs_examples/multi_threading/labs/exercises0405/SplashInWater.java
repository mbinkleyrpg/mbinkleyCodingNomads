package labs_examples.multi_threading.labs.exercises0405;

import java.util.concurrent.locks.Lock;


/**
 * Exercise 4 Receiving thread
 * Implements Runnable in order to create and run the thread
 */

public class SplashInWater implements Runnable{
    public static int swimmerCount = 0;
    SynchronizedSwimmers synchronizedSwimmer;
    private String jType;
    private int priority;
    Lock startSignal;

    SplashInWater(String jumpType, SynchronizedSwimmers synchronizedSwimmer, int priority, Lock startSignal){
        jType = jumpType;
        this.synchronizedSwimmer = synchronizedSwimmer;
        this.priority = priority;
        this.startSignal = startSignal;
    }
    @Override
    public void run(){
        Thread.currentThread().setPriority(priority);

        startSignal.tryLock();

        synchronized (synchronizedSwimmer){
            synchronizedSwimmer.jump(jType);
            System.out.println("The swimmer has splashed in the water!");
            try{
                for(int i = 0; i < 10; i++){
                    System.out.println("blub");
                    Thread.sleep(200);
                }
                System.out.println("Swimmer " + swimmerCount + " has swam to the wall safely!");
            }catch(InterruptedException ie){
                System.out.println("A heckler jumped into the pool and tackled the swimmer mid-air!  MATCH HALTED!");
            }
            swimmerCount++;

        }

    }
}
