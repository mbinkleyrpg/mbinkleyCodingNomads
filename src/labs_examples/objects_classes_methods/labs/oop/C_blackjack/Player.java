package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Object representing a player
 * There will be 2 players, a human and a computer player
 *
 */
        public class Player {
            //instance variables
            private String playerName;
            private int bet;
            private int chipCount;
            private ArrayList<Card> hand = new ArrayList();

            //constructor
            public Player() {               //default constructor, to create a new human player
                createHumanPlayer();
            }

            public Player(String playerName, int chipCount) {       //constructor to create computer player
                this.playerName = playerName;
                this.chipCount = chipCount;
            }

            // getters and setters
            public String getPlayerName() {
                return playerName;
            }
            public void setPlayerName(String playerName) {
                this.playerName = playerName;
            }
            public int getChipCount() {
                return chipCount;
            }
            public void setChipCount(int chipCount) {
                this.chipCount = chipCount;
            }
            public int getBet() {
                return bet;
            }
            public void setBet(int bet) {
                this.bet = bet;
            }
            public ArrayList<Card> getHand() {
                return hand;
            }
            public void setHand(ArrayList<Card> hand) {
                this.hand = hand;
            }

            /**
             * Create a new player and get their name
             *
             */
            private void createHumanPlayer() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("What's your name?");
                this.playerName = scanner.next();

                System.out.println("How much money did you bring to the game?");
                this.chipCount = scanner.nextInt();
            }
        }


