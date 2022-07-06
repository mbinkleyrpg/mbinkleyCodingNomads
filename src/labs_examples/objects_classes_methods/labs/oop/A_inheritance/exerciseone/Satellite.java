package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class Satellite {
    private boolean orbitsSun;
    private boolean isNaturalSatellite;
    private String composition;
    private boolean hasAtmosphere;
    private int diameter;
    private String mass;

    private String shape;
    private String name;

    public Satellite(){

    }
    public Satellite(boolean orbitsSun, boolean isNaturalSatellite, String composition, boolean hasAtmosphere, int diameter, String mass,
                     String shape, String name){
        this.orbitsSun = orbitsSun;
        this.isNaturalSatellite = isNaturalSatellite;
        this.composition = composition;
        this.hasAtmosphere = hasAtmosphere;
        this.diameter = diameter;
        this.mass = mass;
        this.shape = shape;
        this.name = name;
    }
    //getters and setters for non final variables
    public boolean isOrbitsSun() {
        return orbitsSun;
    }

    public void setOrbitsSun(boolean orbitsSun) {
        this.orbitsSun = orbitsSun;
    }

    public boolean isNaturalSatellite() {
        return isNaturalSatellite;
    }

    public void setNaturalSatellite(boolean naturalSatellite) {
        isNaturalSatellite = naturalSatellite;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Satellite{OrbitsSun = " + orbitsSun + ", Natural satellite = " + isNaturalSatellite + ", Composition =  " + composition +
                ", Atmosphere =  " + hasAtmosphere +  ", Diameter = " + diameter + "miles, Mass = " + mass + "kg, Shape = "
                + shape + ", and Name = " + name + "}";
    }

}

