package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

/**
 * Object for representing a deck: made of 52 Card objects (2-10, Jack, Queen, King, Ace for each of suits)
 *
 */
public class Deck {

    // instance variables
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList();
    private static int deckReshuffled;

    // constructor
    public Deck(){
        reshuffleDeck();
        deckReshuffled++;
    }

    //getters and setters
    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public Card getCardAt(int randomNum) {
        return deck[randomNum];
    }

    public static int getDeckReshuffled() {
        return deckReshuffled;
    }

    /**
     * Reshuffle the deck for a new hand
     *
     */
    private void reshuffleDeck() {
        int k = 0;
        //nested for loop for initializing the deck
        //outer is for suit, inner is for value
        //k is used to keep overall index of card number
        for (int i = 0; i < 4; i++){
            for (int j = 1; j < 14; j++){
                if (j == 1){
                    deck[k] = new Card(suit[i], "Ace");
                } else if (j == 11){
                    deck[k] = new Card(suit[i], "Jack");
                } else if (j == 12) {
                    deck[k] = new Card(suit[i], "Queen");
                } else if (j == 13) {
                    deck[k] = new Card(suit[i], "King");
                } else {
                    deck[k] = new Card(suit[i], Integer.toString(j).toUpperCase());
                }
                k++;
            }
        }
    }

    /**
     * Determine if the random card has been used yet in this hand
     *
     *
     * @param value
     * @return
     */
    public boolean isCardUsed(int value) {
        if (usedCards.contains(value)){
            return true;
        } else {
            return false;
        }
    }
}
