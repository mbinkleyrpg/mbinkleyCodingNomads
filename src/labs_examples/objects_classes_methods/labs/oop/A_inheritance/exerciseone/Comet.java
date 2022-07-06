package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class Comet extends Satellite{
    private final boolean orbitsSun = true;
    private final boolean isNaturalSatellite = true;
    private final String composition = "rock, ice, dust, and frozen gas";
    private final boolean hasAtmosphere = false;
    private final String shape = "Irregular";
    private boolean hasTail;        //astronomers discovered a comet with no tail in 2016

    public Comet(){

    }

    public Comet(boolean hasTail, String cometName){
        this.hasTail = hasTail;
    }

    //getters for final instance variables; no setters because these are final and can't be changed
    @Override
    public boolean isOrbitsSun() {
        return orbitsSun;
    }

    @Override
    public boolean isNaturalSatellite() {
        return isNaturalSatellite;
    }

    @Override
    public String getComposition() {
        return composition;
    }

    @Override
    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    @Override
    public String getShape() {
        return shape;
    }
    //getters and setters for non final variable
    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Comet{OrbitsSun = " + orbitsSun + ", NaturalSatellite = " + isNaturalSatellite + ", Composition = " + composition +
                ", HasAtmosphere = " + hasAtmosphere + ", Shape = " + shape + ", and HasTail = " + hasTail + "}";
    }
}
