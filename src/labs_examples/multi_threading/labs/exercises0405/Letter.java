package labs_examples.multi_threading.labs.exercises0405;

/**
 * Exercise 4 synchronized block
 * Exercise 5 use notify and wait
 * A letter is being sent back and forth between a girl and a boy in a classroom
 */
public class Letter {
    private String secretLetter;
    private boolean bePatientGuy = true;       //true means guy needs to wait for a response from the girl

    public synchronized void sendLetter(String secretLetter){
        while(!bePatientGuy){
            try{
                wait();
            }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
                System.out.println("Uh oh, the teacher got the letter....");
            }
        }
        bePatientGuy = false;

        this.secretLetter = secretLetter;
        notifyAll();
    }

    public synchronized  String receiveLetter(){
        while(bePatientGuy){
            try{
                wait();
            }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
                System.out.println("Uh oh, the teacher got the letter....");
            }
        }
        bePatientGuy = true;
        notifyAll();
        return secretLetter;
    }
}
