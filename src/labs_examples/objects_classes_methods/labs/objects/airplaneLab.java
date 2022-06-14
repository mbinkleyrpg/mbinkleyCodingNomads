package labs_examples.objects_classes_methods.labs.objects;

public class airplaneLab {
    public static void main(String[] args) {
        PlaneEngine planeEngine = new PlaneEngine("Piston", "1999");
        Wing wing = new Wing("Rectangular", 76);
        Seat seat = new Seat(300, 3);
        //Fuselage.setFuselageType("truss");
        //Fuselage fuselage = new Fuselage(Fuselage.getFuselageType, true, "1999");
        //Airplane airplaneOne = new Airplane(planeEngine, wing, seat, fuselage, "Boeing", "White", "2000");

       // System.out.println(airplaneOne.toString());
    }
}

//use .toString() for Objects, not variables
class PlaneEngine{
    private String engineType;      //piston, gas turbine, rocket, or electric
    private String yearEngineProduced;

    public PlaneEngine(String engineType, String yearEngineProduced){
        this.engineType = engineType;
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

    public Wing(String wingShape, int length){
        this.wingShape = wingShape;
        this.wingLength = length;
    }
    @Override
    public String toString(){
        return "Wing(Shape = " + wingShape + ", Length = " + wingLength + "m)";    //put 'm' for unit since keeping track in meters
    }
}

class Seat{
    private int numberOfSeatsTotal;
    private int numberOfSeatsPerRow;
    String colorOfSeats;

    public Seat(int numberOfSeatsTotal, int numberOfSeatsPerRow){
        this.numberOfSeatsTotal = numberOfSeatsTotal;
        this.numberOfSeatsPerRow = numberOfSeatsPerRow;
    }

    @Override
    public String toString(){
        return "Seat(Number of seats total = : " + numberOfSeatsTotal + ", Number of seats per row = " + numberOfSeatsPerRow + ")";
    }
}

class Fuselage {

    private String fuselageType;        //truss, monocoque, semi-monocoque, or geodesic
    private Boolean holdsEngine;
    private String yearFuselageProduced;

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

    //public static String setFuselageType(String newFuselageType) {
        //this.fuselageType = newFuselageType;
    //}
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

}


