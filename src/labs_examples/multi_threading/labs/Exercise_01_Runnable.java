package labs_examples.multi_threading.labs;

public class Exercise_01_Runnable implements Runnable{


    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " has now started");
        try{
            int j = 0;
            for(int i = 0; i < 15; i++){
                System.out.println("Thread is sleeping...zzzz      " + j);
                Thread.sleep(300);
                j++;
            }
        }catch(InterruptedException ie){
            System.out.println(Thread.currentThread().getName() + " has been interrupted and this exception has been caught");
        }

        System.out.println(Thread.currentThread().getName() + " has now finished");
    }
}
