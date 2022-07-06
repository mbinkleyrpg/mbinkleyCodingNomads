package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class Asteroid extends Satellite{
    private final boolean orbitsSun = true;
    private final boolean isNaturalSatellite = true;
    private final boolean hasAtmosphere = false;
    private final boolean hasCraters = true;
    private String shape;       //either oblong or spherical
    private String composition;     //rock or metal
    private boolean inAsteroidBelt;

    public Asteroid(){

    }

    public Asteroid(String shape, String composition, boolean inAsteroidBelt){
        this.shape = shape;
        this.composition = composition;
        this.inAsteroidBelt = inAsteroidBelt;
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
    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    public boolean isHasCraters() {
        return hasCraters;
    }

    //getters and setters for non final variables
    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getComposition() {
        return composition;
    }

    @Override
    public void setComposition(String composition) {
        this.composition = composition;
    }

    public boolean isInAsteroidBelt() {
        return inAsteroidBelt;
    }

    public void setInAsteroidBelt(boolean inAsteroidBelt) {
        this.inAsteroidBelt = inAsteroidBelt;
    }
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Asteroid{OrbitsSun = " + orbitsSun + ", NaturalSatellite = " + isNaturalSatellite + ", hasAtmosphere = " + ", hasCraters = " +
                hasCraters + ", Shape = " + shape + ", Composition = " + composition + ", InAsteroidBelt = " + inAsteroidBelt + "}";
    }
}
