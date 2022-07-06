package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/**
 *
 * Object for representing a Card that will be used in a deck that will then be
 * passed out in a hand
 */
public class Card {
    //instance variables
    private char suit;
    private String value;
    private int scoreValue;

    //constructor
    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * a to string for cards
     *
     * @return String with the card suit & value
     */

    public String cardToString() {
        return suit + value;
    }

    /**
     * Cards 2-9 are value of their number
     * 10, Jack, Queen, and King have a value of 10
     * Ace has a value of 11
     *
     * @return - value of the card as an int
     */
    public int getScoreValue() {
        try {
            return Integer.valueOf(value);
        } catch (Exception e){
            //this exception is for cards that don't have an int value
            if (value.equalsIgnoreCase("ACE")){
                return 11;
            } else {
                return 10;
            }
        }
    }

    @Override
    public String toString() {
        return "Card{" + "suit = " + suit + ", value = " + value + ", scoreValue = " + scoreValue + "}";
    }
}
