package labs_examples.multi_threading.labs;


public class Exercise_02_Controller {
    public static void main(String[] args) {
        System.out.println("In main thread");
        Exercise_02_Thread threadOne = new Exercise_02_Thread("Thread 1");
        Exercise_02_Thread threadTwo = new Exercise_02_Thread("Thread 2");
        Exercise_02_Thread threadThree = new Exercise_02_Thread("Thread 3");

        threadOne.setPriority(10);
        threadTwo.setPriority(1);
        threadThree.setPriority(5);

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        try{
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        }catch(InterruptedException ie){
            System.out.println("Interrupted in the main thread");
        }

        System.out.println("All threads have been created");
    }
}
