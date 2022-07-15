package labs_examples.multi_threading.labs.exercise06;

public class Document {
    private String newDocument;

    private static int counter = 0;
    private boolean documentIsLocked = true;

    public synchronized void doneWithDocument(String newDocument){
        while(!documentIsLocked){
            try{
                wait();
            }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
                System.out.println("This is awkward...");
            }
        }
        documentIsLocked = false;
        this.newDocument = newDocument;
        notifyAll();
    }

    public synchronized  String editDocument(String threadName){
        while(documentIsLocked){
            System.out.println("In " + threadName);
            counter++;
            System.out.println("Counter = " + counter);
            try{
                wait();
            }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
                System.out.println("Well this is awkward..");
            }
        }
        documentIsLocked = true;
        notifyAll();
        return newDocument;
    }

    public static int getCounter() {
        return counter;
    }
}


