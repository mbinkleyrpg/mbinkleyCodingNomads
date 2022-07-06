package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class PlayASport {
    Sport sport;
    String[] equipmentNeeded;

    public PlayASport(Sport sport){
        this.sport = sport;
    }

    public void setSport(Sport sport){
        this.sport = sport;
    }

    public void startGame(){

        sport.startClock();
        sport.score();
        sport.equipment();
        sport.timeType();
        sport.stopClock();

    }
}
