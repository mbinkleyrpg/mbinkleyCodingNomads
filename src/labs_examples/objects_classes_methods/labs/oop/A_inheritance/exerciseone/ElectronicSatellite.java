package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class ElectronicSatellite extends Satellite{
    private final boolean orbitsSun = false;
    private final boolean isNaturalSatellite = false;
    private final boolean hasAtmosphere = false;
    private String composition;
    private String shape;
    private String companyName;
    private String yearLaunched;
    private String purpose;

    public ElectronicSatellite(){       //default constructor, almost all electronic satellites (man-made) are aluminum and irregular,
                                        //not final in case there is new tech
        composition = "Aluminum";
        shape = "Irregular";
    }

    public ElectronicSatellite(String composition, String shape, String esatelliteName,
                               String companyName, String yearLaunched, String purpose){
        this.composition = composition;
        this.shape = shape;
        this.companyName = companyName;
        this.yearLaunched = yearLaunched;
        this.purpose = purpose;
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

    //getters and setters for non final variables
    @Override
    public String getComposition() {
        return composition;
    }

    @Override
    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getYearLaunched() {
        return yearLaunched;
    }

    public void setYearLaunched(String yearLaunched) {
        this.yearLaunched = yearLaunched;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "ElectronicSatellite{ OrbitsSun = " + orbitsSun + ", NaturalSatellite = " + isNaturalSatellite + ", hasAtmosphere = " +
                hasAtmosphere + ", Composition = " + composition +  ", Shape = " +
                shape + ", Company Name = " + companyName + ", Year Launched = " + yearLaunched + ", and its Purpose is: " + purpose + "}";
    }
}
