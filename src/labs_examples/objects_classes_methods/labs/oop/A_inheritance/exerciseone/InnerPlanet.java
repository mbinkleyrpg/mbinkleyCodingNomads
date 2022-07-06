package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class InnerPlanet  extends Planet {
    private final boolean hasRings = false;
    private final String composition = "rock";
    private boolean elonHasAttemptedToConquer;

    public InnerPlanet(){
    }

    public InnerPlanet(boolean elonHasAttemptedToConquer){
        this.elonHasAttemptedToConquer = elonHasAttemptedToConquer;     //only Mars and Earth.........so far
    }

    //getters for final instance variables; no setters because these are final and can't be changed
    @Override
    public boolean isHasRings() {
        return hasRings;
    }

    @Override
    public String getComposition() {
        return composition;
    }

    //getters and setters for non final variables
    public boolean isElonHasAttemptedToConquer() {
        return elonHasAttemptedToConquer;
    }

    public void setElonHasAttemptedToConquer(boolean elonHasAttemptedToConquer) {
        this.elonHasAttemptedToConquer = elonHasAttemptedToConquer;
    }

    public String toString(){
        System.out.println(super.toString());
        return "InnerPlanet{HasRings = " + hasRings + ", Composition = " + composition + ", and ElonHasAttemptedToConquer = " + elonHasAttemptedToConquer
                + "}";
    }
}
