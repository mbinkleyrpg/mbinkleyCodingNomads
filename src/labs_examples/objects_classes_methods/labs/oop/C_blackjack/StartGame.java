package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/**
 * Class used for main method to start a game
 */
public class StartGame {

    /**
     * Author: Matt Binkley
     *
     * @param args
     */
    public static void main(String[] args) {
        //create and start a game of Blackjack
        GameController game = new GameController();
        game.play();

    }
}