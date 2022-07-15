package labs_examples.multi_threading.labs.exercises0405;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Receiver thread implementing Runnable so the letter can be received
 */
public class LetterReceiver implements Runnable{
    private Letter letter;

    LetterReceiver(Letter letter){
        this.letter = letter;
    }

    public void run(){
        for(String receivedLetter = letter.receiveLetter(); !"Bye".equals(receivedLetter); receivedLetter = letter.receiveLetter()){
            System.out.println(receivedLetter);
        }

        try{
            Thread.sleep(ThreadLocalRandom.current().nextInt(500,2500));
        }catch(InterruptedException ie){
            Thread.currentThread().interrupt();
            System.out.println("Detention perhaps" + ie);
        }
    }
}
