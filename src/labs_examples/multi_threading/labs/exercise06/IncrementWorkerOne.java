package labs_examples.multi_threading.labs.exercise06;

public class IncrementWorkerOne implements Runnable {
    private Document document;

    String threadName = "Worker One";

    IncrementWorkerOne(Document document) {
        this.document = document;
    }

    public void run() {
        System.out.println("Worker one has been created....");
            for(int i = 0; i < 10; i++){
                try {
                    document.editDocument(threadName);
                    Thread.sleep(200);
                    System.out.println("");
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted" + ie);
                }
            }


    }
}








