package labs_examples.multi_threading.labs.exercise06;


public class IncrementWorkerTwo implements Runnable {
    private Document document;
    String threadName = "Worker Two";

    IncrementWorkerTwo(Document document) {
        this.document = document;
    }

    public void run() {
        System.out.println("Worker two has been created....");
            for(int i = 0; i < 10; i++){
                try {
                    document.editDocument(threadName);
                    Thread.sleep(200);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted" + ie);
                }
            }

        }
    }

