package labs_examples.multi_threading.labs.exercises0405;

/**
 * Controller class for creating and starting the sender and receiver threads
 */
public class LetterController {
    public static void main(String[] args) {
        Letter letter = new Letter();
        Thread letterSender = new Thread(new LetterSender(letter));
        Thread letterReceiver = new Thread(new LetterReceiver(letter));

        letterSender.start();
        letterReceiver.start();
    }
}
