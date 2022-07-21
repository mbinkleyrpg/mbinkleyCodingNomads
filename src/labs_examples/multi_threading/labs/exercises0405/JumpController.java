package labs_examples.multi_threading.labs.exercises0405;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Exercise 4 controller
 * Creates two swimmers and runs them after locking the start signal lock
 *
 */

public class JumpController {
    public static void main(String[] args) {
        SynchronizedSwimmers synchronizedSwimmer = new SynchronizedSwimmers();
        Lock startSignal = new ReentrantLock();

        SplashInWater siw1 = new SplashInWater("Dive", synchronizedSwimmer, 1, startSignal);
        SplashInWater siw2 = new SplashInWater("Spin", synchronizedSwimmer, 10, startSignal);
        startSignal.lock();
        siw1.run();
        siw2.run();
        startSignal.unlock();
    }
}
