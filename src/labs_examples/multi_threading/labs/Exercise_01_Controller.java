package labs_examples.multi_threading.labs;

public class Exercise_01_Controller {
    public static void main(String[] args) {
        System.out.println("Main thread has started");
        Exercise_01_Runnable firstThread = new Exercise_01_Runnable();
        Thread threadOne = new Thread(firstThread, "First way to initiate the thread");
        threadOne.start();

        Thread threadTwo = new Thread(new Exercise_01_Runnable(), "Second way to initiate the thread");
        threadTwo.start();

    }
}
