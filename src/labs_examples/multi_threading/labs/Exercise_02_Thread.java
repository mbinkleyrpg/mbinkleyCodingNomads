package labs_examples.multi_threading.labs;

public class Exercise_02_Thread extends Thread {
    Exercise_02_Thread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("In " + getName() + " and doing stuff.");
        try{
            int j = 0;
            for(int i = 0; i < 15; i++){
                System.out.println("             " + getName() + " for task number " + j);
                j++;
                Thread.sleep(300);
            }
        }catch(InterruptedException ie){
            System.out.println(getName() + " was interrupted, how rude!");
        }
    }
}
