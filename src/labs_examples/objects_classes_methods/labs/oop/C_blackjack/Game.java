package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/**
 * Object for representing a hand
 */
public class Game {
    //instance variables
    private String name;
    private String basicRules;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasicRules() {
        return basicRules;
    }

    public void setBasicRules(String basicRules) {
        this.basicRules = basicRules;
    }
}
