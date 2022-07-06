package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class Moon extends Satellite{
    private final boolean orbitsSun = false;
    private final boolean isNaturalSatellite = true;
    private boolean hasAtmosphere;
    private String homePlanet;
    private boolean hasCraters;

    public Moon(){

    }

    public Moon(boolean hasAtmosphere, String homePlanet, boolean hasCraters){
        this.hasAtmosphere = hasAtmosphere;
        this.homePlanet = homePlanet;
        this.hasCraters = hasCraters;
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

    //getters and setters for non final variables
    @Override
    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    @Override
    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public boolean isHasCraters() {
        return hasCraters;
    }

    public void setHasCraters(boolean hasCraters) {
        this.hasCraters = hasCraters;
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Moon{OrbitsSun = " + orbitsSun + ", isNaturalSatellite = " + isNaturalSatellite + ", HasAtmosphere = " + hasAtmosphere +
                ", HomePlanet = " + ", and HasCraters = " + hasCraters + "}";
    }
}
