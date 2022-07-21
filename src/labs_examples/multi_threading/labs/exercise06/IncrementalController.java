package labs_examples.multi_threading.labs.exercise06;

public class IncrementalController {
    public static void main(String[] args) {
        Document document = new Document();
        Thread IncrementalWorkerOne = new Thread(new IncrementWorkerOne(document));
        Thread IncrementalWorkerTwo = new Thread(new IncrementWorkerTwo(document));
        Thread IncrementalWorkerThree = new Thread(new IncrementWorkerThree(document));

        IncrementalWorkerOne.start();
        IncrementalWorkerTwo.start();
        IncrementalWorkerThree.start();
    }


}
