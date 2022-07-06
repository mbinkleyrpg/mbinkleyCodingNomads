package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/**
 * Hand Interface so that all games have a deal and bet method
 *
 */
public interface GameBasics {
    public void deal(Player player, Deck deck);
    public void bets(Player player);

}
