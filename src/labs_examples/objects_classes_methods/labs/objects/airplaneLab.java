package labs_examples.objects_classes_methods.labs.objects;

public class airplaneLab {
    public static void main(String[] args) {
        PlaneEngine planeEngineOne = new PlaneEngine();
        planeEngineOne.setEngineType("piston");
        planeEngineOne.setYearEngineProduced("1999");

        Wing wingOne = new Wing("Rectangular", 76);
        wingOne.setWingShape("delta");
        wingOne.setWingLength(56);

        Seat seatOne = new Seat();
        seatOne.setNumberOfSeatsTotal(200);
        seatOne.setNumberOfSeatsPerRow(3);
        seatOne.setColorOfSeats("Blue");

        Fuselage fuselageOne = new Fuselage();
        fuselageOne.setFuselageType("truss");
        fuselageOne.setHoldsEngine(true);
        fuselageOne.setYearFuselageProduced("1998");

        Airplane airplaneOne = new Airplane(planeEngineOne, wingOne, seatOne, fuselageOne, "Boeing", "White", "2000");
        airplaneOne.setYearPlaneProduced("2000");
        System.out.println(airplaneOne.toString());

    }
}

//use .toString() for Objects, not variables
class PlaneEngine{
    private String engineType;      //piston, gas turbine, rocket, or electric
    private String yearEngineProduced;

    public PlaneEngine(){       //default constructor

    }
    public PlaneEngine(String engineType, String yearEngineProduced){
        this.engineType = engineType;
        this.yearEngineProduced = yearEngineProduced;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getYearEngineProduced() {
        return yearEngineProduced;
    }

    public void setYearEngineProduced(String yearEngineProduced) {
        this.yearEngineProduced = yearEngineProduced;
    }

    @Override
    public String toString(){
        return "Engine(Type = " + engineType + ", Year Produced = " + yearEngineProduced + ")";
    }
}

class Wing {
    private String wingShape;       //rectangular, tapered straight, elliptical, swept, or delta
    private int wingLength;             //in meters, (normally around 76m)

    public Wing(){          //default constructor

    }
    public Wing(String wingShape, int length){
        this.wingShape = wingShape;
        this.wingLength = length;
    }
    @Override
    public String toString(){
        return "Wing(Shape = " + wingShape + ", Length = " + wingLength + "m)";    //put 'm' for unit since keeping track in meters
    }

    public String getWingShape() {
        return wingShape;
    }

    public void setWingShape(String wingShape) {
        this.wingShape = wingShape;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }
}

class Seat{
    private int numberOfSeatsTotal;
    private int numberOfSeatsPerRow;
    private String colorOfSeats;

    public Seat(){

    }

    public Seat(int numberOfSeatsTotal, int numberOfSeatsPerRow, String colorOfSeats){
        this.numberOfSeatsTotal = numberOfSeatsTotal;
        this.numberOfSeatsPerRow = numberOfSeatsPerRow;
        this.colorOfSeats = colorOfSeats;
    }

    @Override
    public String toString(){
        return "Seat(Number of seats total = : " + numberOfSeatsTotal + ", Number of seats per row = " + numberOfSeatsPerRow + ")";
    }

    public int getNumberOfSeatsTotal() {
        return numberOfSeatsTotal;
    }

    public void setNumberOfSeatsTotal(int numberOfSeatsTotal) {
        this.numberOfSeatsTotal = numberOfSeatsTotal;
    }

    public int getNumberOfSeatsPerRow() {
        return numberOfSeatsPerRow;
    }

    public void setNumberOfSeatsPerRow(int numberOfSeatsPerRow) {
        this.numberOfSeatsPerRow = numberOfSeatsPerRow;
    }

    public String getColorOfSeats() {
        return colorOfSeats;
    }

    public void setColorOfSeats(String colorOfSeats) {
        this.colorOfSeats = colorOfSeats;
    }
}

class Fuselage {

    private String fuselageType;        //truss, monocoque, semi-monocoque, or geodesic
    private Boolean holdsEngine;
    private String yearFuselageProduced;

    public Fuselage(){      //default constructor
    }
    public Fuselage(String fuselageType, Boolean holdsEngine, String yearFuselageProduced){
        this.fuselageType = fuselageType;
        this.holdsEngine = holdsEngine;
        this.yearFuselageProduced = yearFuselageProduced;
    }

    @Override
    public String toString(){
        return "Fuselage(Type = " + fuselageType + ", Holds plane engine = " + holdsEngine + ", Year Produced = " + yearFuselageProduced + ")";
    }

    public String getFuselageType() {
        return fuselageType;
    }

    public void setFuselageType(String fuselageType) {
        this.fuselageType = fuselageType;
    }

    public Boolean getHoldsEngine() {
        return holdsEngine;
    }

    public void setHoldsEngine(Boolean holdsEngine) {
        this.holdsEngine = holdsEngine;
    }

    public String getYearFuselageProduced() {
        return yearFuselageProduced;
    }

    public void setYearFuselageProduced(String yearFuselageProduced) {
        this.yearFuselageProduced = yearFuselageProduced;
    }
}

class Airplane{
    private double fuelCapacity;
    private double currentFuelLevel;

    private PlaneEngine planeEngine;
    private Wing wing;
    private Seat seat;
    private Fuselage fuselage;
    private String model;
    private String color;
    private String yearPlaneProduced;

    public Airplane(){

    }

    public Airplane(PlaneEngine planeEngine, Wing wing, Seat seat, Fuselage fuselage, String model, String color, String yearProduced){
        this.planeEngine = planeEngine;
        this.wing = wing;
        this.seat = seat;
        this.fuselage = fuselage;
        this.model = model;
        this.color = color;
        this.yearPlaneProduced = yearProduced;
    }

    @Override
    public String toString(){
        return "Airplane:\n" + planeEngine.toString() + "\n" + wing.toString() + "\n" + seat.toString() +
                "\n" + fuselage.toString() + "\nModel = " + model + ",\nColor = " + color + ",\nYear produced = " +
                yearPlaneProduced;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public PlaneEngine getPlaneEngine() {
        return planeEngine;
    }

    public void setPlaneEngine(PlaneEngine planeEngine) {
        this.planeEngine = planeEngine;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Fuselage getFuselage() {
        return fuselage;
    }

    public void setFuselage(Fuselage fuselage) {
        this.fuselage = fuselage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYearPlaneProduced() {
        return yearPlaneProduced;
    }

    public void setYearPlaneProduced(String yearPlaneProduced) {
        this.yearPlaneProduced = yearPlaneProduced;
    }
}


