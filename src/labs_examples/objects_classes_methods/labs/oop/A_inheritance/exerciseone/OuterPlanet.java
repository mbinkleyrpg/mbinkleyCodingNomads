package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class OuterPlanet extends Planet {
    private final boolean hasRings = true;
    private final String composition = "gas";
    private boolean isATwin;           //Uranus and Neptune are known as twins

    public OuterPlanet(){

    }

    public OuterPlanet(boolean isATwin){
        this.isATwin = isATwin;
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
    //getters and setters for non final variable
    public boolean isATwin() {
        return isATwin;
    }

    public void setATwin(boolean ATwin) {
        isATwin = ATwin;
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return "OuterPlanet{hasRings = " + hasRings + ", Composition = " + composition + ", IsATwin = " +isATwin + "}";
    }
}
