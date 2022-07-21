package labs_examples.multi_threading.labs.exercises0405;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Sender thread implementing runnable to send the letter
 */
public class LetterSender implements Runnable{
    private Letter letter;
    static String[] responses;

    LetterSender(Letter letter){
        this.letter = letter;
    }

    public void run(){
        String responses[] = {
                "Do you like me?  Y or N?",
                "Y",
                "Do you want to go to the skating rink Friday?  Y or N?",
                "Y",
                "Bye"
        };

        for(String response : responses){
            letter.sendLetter(response);

            try{
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + ie);
            }
        }
    }
}
