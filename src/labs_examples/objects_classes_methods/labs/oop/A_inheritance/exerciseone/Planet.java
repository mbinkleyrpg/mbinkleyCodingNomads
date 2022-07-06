package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class Planet extends Satellite{
    private final boolean orbitsSun = true;
    private final boolean isNaturalSatellite = true;
    private final String orbitShape = "Elliptical";
    private final String shape = "Spherical";
    private boolean hasAtmosphere;            //Mercury is only planet without an atmosphere
    private boolean hasLife;                    //don't make final because this could be changed at some point in future
    private int numberOfMoons;
    private boolean hasWater;
    private int numberFromSun;
    private boolean hasRings;

    public Planet(){
    }

    public Planet(boolean hasAtmosphere, boolean hasLife, int numberOfMoons, boolean hasWater, int numberFromSun, boolean hasRings, String planetName){
        this.hasAtmosphere = hasAtmosphere;
        this.hasLife = hasLife;
        this.numberOfMoons = numberOfMoons;
        this.hasWater = hasWater;
        this.numberFromSun = numberFromSun;
        this.hasRings = hasRings;
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
    public String getOrbitShape() {
        return orbitShape;
    }
    @Override
    public String getShape() {
        return shape;
    }

    //getters and setters for non final variables
    @Override
    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }
    @Override
    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public int getNumberFromSun() {
        return numberFromSun;
    }

    public void setNumberFromSun(int numberFromSun) {
        this.numberFromSun = numberFromSun;
    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }


    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Planet{OrbitsSun = " + orbitsSun + ", Naturalsatellite = " + isNaturalSatellite + ", atmosphere " + hasAtmosphere + ", OrbitShape = "
                + orbitShape + ", Shape = " + shape + ", HasHumanLife = " + hasLife + ", NumberOfMoons = " + numberOfMoons + ", HasWater " + hasWater +
                ", NumberFromSun = " + numberFromSun + ", HasRings = " + hasRings + "}";
    }
}
