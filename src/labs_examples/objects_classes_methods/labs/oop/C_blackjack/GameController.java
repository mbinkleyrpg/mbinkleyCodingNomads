package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 * Controller for the created Blackjack Game
 *
 */
public class GameController extends Game implements GameBasics {
    public static int getHumanWon() {
        return humanWon;
    }

    public static void setHumanWon() {
        GameController.humanWon++;
    }

    public static int getComputerWon() {
        return computerWon;
    }

    public static void setComputerWon() {
        GameController.computerWon++;
    }

    public static int humanWon = 0;
    public static int computerWon = 0;

    /**
     * Method called StartGame to start the game
     * Create players, check if the game is continuing, give comp cards
     * determine winner and print result
     */
    public void play() {

        // set variables in parent "Game" class
        setName("BlackJack");
        setBasicRules("The player closest to 21 without going over wins");

        //create players and deck
        Player humanPlayer = new Player();
        Player computerPlayer = new Player("Computer", 10);
        Deck deck;

        // do-while loop to keep looping while player wants to play more games (and has money left)
        do {
            deck = new Deck();
            System.out.println("This is Hand Number " + Deck.getDeckReshuffled());

            //find out how much humanPlayer wants to bet and deal cards to each player
            bets(humanPlayer);
            dealInitialCards(humanPlayer, computerPlayer, deck);

            // give human player cards until he wants to stop or busts
            while(true){
                if(checkForHit(humanPlayer)){
                    deal(humanPlayer, deck);
                } else {
                    break;
                }
            }

            // give computer player cards until it gets to 17 or busts
            while(true){
                if(checkForHit(computerPlayer)){
                    deal(computerPlayer, deck);
                } else {
                    break;
                }
            }
            //now that hands are finalized, see who won
            String scoringOutput = scoreHands(humanPlayer, computerPlayer);
            System.out.println(scoringOutput);
        } while (continuePlaying(humanPlayer, computerPlayer));

        System.out.println("Thanks for playing, you walk away $" + humanPlayer.getChipCount() + ".");
        System.out.println("You played " + Deck.getDeckReshuffled() + " hands.");
    }

    /**
     * Takes the player's bet
     *
     * @param Player player
     */
    @Override
    public void bets(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much are you betting (you have $" + player.getChipCount() + ")");
        int betAmount = scanner.nextInt();

        //if loop for if it's a valid bet (they have enough money)
        if (betAmount <= player.getChipCount()){
            if (betAmount == player.getChipCount()){
                System.out.println("You are going all in.  Goodluck!");
            }
            player.setBet(betAmount);
        } else  //else statement for bets that are more than amount player has
            {do{
                System.out.println("You must bet equal to or less than $" + player.getChipCount());
                betAmount = scanner.nextInt();
            } while (betAmount > player.getChipCount());
            player.setBet(betAmount);
        }
    }

    /**
     * Deal each humanPlayer their first card
     *
     * @param Player humanPlayer
     * @param Player computerPlayer
     * @param Deck deck
     */
    private void dealInitialCards(Player humanPlayer, Player computerPlayer, Deck deck) {
        //deal cards to each player
        deal(humanPlayer, deck);
        deal(computerPlayer, deck);
        deal(humanPlayer, deck);
        deal(computerPlayer, deck);

        // print out cards except for computer's second card (to represent player seeing both but only 1 of opponent
        System.out.println("The computer's first card is: " + computerPlayer.getHand().get(0).cardToString());
        System.out.println("Your first card is " + humanPlayer.getHand().get(0).cardToString());
        System.out.println("Your second card is " + humanPlayer.getHand().get(1).cardToString());

    }

    /**
     * Find out if human player wants another card
     *
     * @param Player player     (we don't know which player is being passed in)
     * @return - true if the human player wants another card or computer player has less than 17, otherwise false
     */
    private boolean checkForHit(Player player) {
        Scanner scanner = new Scanner(System.in);
        int currentScore = analyzeHand(player);

        // if loop for human player to decide
        if(!player.getPlayerName().equalsIgnoreCase("Computer")){
            if(currentScore > 21){
                return false;
            }
            else{
                System.out.println("Your hand score is " + currentScore + "\nDo you want another card?  'y' for yes and 'n' for no");
                String response = scanner.next();

                // if loop to process the decision
                if (response.equalsIgnoreCase("y")){
                    return true;
                } else {
                    return false;
                }
            }


        } else {                                //else statement for automated computer decision
            if (currentScore <= 17){
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Calculate score of human player's cards
     *
     * @param Player humanPlayer
     * @return score of player's cards (as an int)
     */
    private int analyzeHand(Player humanPlayer) {

        int currentScore = 0;
        //for each statement to iterate through each card in the hand and add them up for scoring
        for (Card card : humanPlayer.getHand()){
            currentScore += card.getScoreValue();
        }
        return currentScore;
    }

    /**
     * Override deal method from GameBasics interface
     * get a random card and add it to the player's hand
     *
     * @param Player player
     * @param Deck deck
     */
    @Override
    public void deal(Player player, Deck deck) {
        //getRandomCard will get a random unused card from the deck
        int randomNum = getRandomCard(deck);
        Card card = deck.getCardAt(randomNum);
        player.getHand().add(card);
    }

    /**
     * Randomized number, check to see if that number has been used, if not gives it to the user's hand
     *
     * @param Deck deck
     * @return - random number between 0-51 that hasn't been used yet
     */
    private int getRandomCard(Deck deck) {
        Random random = new Random();
        int n = random.nextInt(51) + 0;

        //while loop for finding a card that hasn't been used yet using random int above
        while(deck.isCardUsed(n)){
            n = random.nextInt(51) + 0;
        }

        deck.getUsedCards().add(n);
        return n;
    }

    /**
     * Determine total score of hand
     * Print total score of hand
     *
     * @param Player humanPlayer
     * @param Player computerPlayer
     */
    private String scoreHands(Player humanPlayer, Player computerPlayer) {
        int userScore = analyzeHand(humanPlayer);
        int userDiff = 21 - userScore;
        int computerScore = analyzeHand(computerPlayer);
        int computerDiff = 21 - computerScore;
        String computerHand = computerPlayer.getHand().toString();

        String result = "";

        //if and else loops for setting the result and either adding or subtracting to player chip balance
        if (computerScore == userScore ){
            result = "Tie!  You and the computer both had ";
            humanPlayer.setChipCount(humanPlayer.getChipCount() - (humanPlayer.getBet() / 2));
            printUserChipBalance(humanPlayer);
        } else if (computerScore == 21){
            result = "You lose because the computer hit perfectly at ";
            setComputerWon();
            humanPlayer.setChipCount(humanPlayer.getChipCount() - humanPlayer.getBet());
            printUserChipBalance(humanPlayer);
        } else if (userScore > 21) {
            result = "You lose because you busted and the computer had only ";
            setComputerWon();
            humanPlayer.setChipCount(humanPlayer.getChipCount() - humanPlayer.getBet());
            printUserChipBalance(humanPlayer);
        } else if (computerScore > 21) {
            result = "You win because the computer went over 21 with ";
            setHumanWon();
            humanPlayer.setChipCount(humanPlayer.getChipCount() + (humanPlayer.getBet() * 3));
            printUserChipBalance(humanPlayer);
        } else if (userDiff < computerDiff){
            result = "You win because you were closer to 21 and the computer had only ";
            setHumanWon();
            humanPlayer.setChipCount(humanPlayer.getChipCount() + (humanPlayer.getBet() * 3));
            printUserChipBalance(humanPlayer);
        } else if (userDiff > computerDiff && computerDiff >= 0){
            result = "You lose because the computer was closer to 21 with ";
            setComputerWon();
            humanPlayer.setChipCount(humanPlayer.getChipCount() - humanPlayer.getBet());
            printUserChipBalance(humanPlayer);
        }
        String output = result + computerScore + " points and their cards were " + computerHand;
        return output;
    }

    /**
     * Print human player's chip count
     *
     * @param Player humanPlayer
     */
    private void printUserChipBalance(Player humanPlayer) {
        System.out.println("You have $" + humanPlayer.getChipCount());
    }

    /**
     * Find out if the human player wants to continue playing
     *
     *
     * @param - Player humanPlayer
     * @param - Player computerPlayer
     * @return - If the human player is unable to continue (no more money) this is false, otherwise
     * true if human player wants to continue
     */
    private boolean continuePlaying(Player user, Player computer) {
        Scanner scanner = new Scanner(System.in);

        if (user.getChipCount() < 1){
            System.out.println("You're out of money to lose.  Game over.");
            return false;
        }

        System.out.println("Do you want to try another hand?" + "'y' for yes and 'n' for no");
        String anotherHand = scanner.next();

        //if loop to determine if the user wants to play again or not
        if (anotherHand.equalsIgnoreCase("y")){
            computer.getHand().clear();
            user.getHand().clear();
            return true;
        } else {
            return false;
        }
    }
}

