package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class DwarfPlanet extends Planet{
    private final String composition = "rock";
    private boolean hasRings;               //Haumea has rings, the others do not
    private boolean wasOnceAPlanet;

    public DwarfPlanet(){

    }

    public DwarfPlanet(boolean hasRings, boolean wasOnceAPlanet){
        this.hasRings = hasRings;
        this.wasOnceAPlanet = wasOnceAPlanet;
    }

    //getters for final instance variables; no setters because these are final and can't be changed

    @Override
    public String getComposition() {
        return composition;
    }

    //getters and setters for non final variables

    @Override
    public boolean isHasRings() {
        return hasRings;
    }

    @Override
    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public boolean isWasOnceAPlanet() {
        return wasOnceAPlanet;
    }

    public void setWasOnceAPlanet(boolean wasOnceAPlanet) {
        this.wasOnceAPlanet = wasOnceAPlanet;
    }

    public String toString(){
        System.out.println(super.toString());
        return "DwarfPlanet{composition = " + composition + ", hasRings = " + hasRings + ", and wasOnceAPlanet = " + wasOnceAPlanet + "}";
    }
}
