package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Football  extends AmericanTeamSport {
    private final String sessionType = "Quarter";
    private double sessionTime;     //pro and college are both 15, but high school is only 12
    private int scoreTeamOne;
    private int scoreTeamTwo;
    private boolean clockStarted = false;
    private boolean gameOver = false;
    private String[] equipmentNeeded;   //an array of equipment to be used in given sport

    public Football(){     //default constructor

    }

    public Football(int sessionTime, int scoreTeamOne, int scoreTeamTwo, boolean clockStarted, boolean gameOver){
        this.sessionTime = sessionTime;
        this.scoreTeamOne = scoreTeamOne;
        this.scoreTeamTwo = scoreTeamTwo;
        this.clockStarted = clockStarted;
        this.gameOver = gameOver;
    }

    @Override
    public String getSessionType() {
        return sessionType;
    }

    @Override
    public double getSessionTime() {
        return sessionTime;
    }

    @Override
    public void setSessionTime(double sessionTime) {
        this.sessionTime = sessionTime;
    }

    @Override
    public int getScoreTeamOne() {
        return scoreTeamOne;
    }

    @Override
    public void setScoreTeamOne(int scoreTeamOne) {
        this.scoreTeamOne = scoreTeamOne;
    }

    @Override
    public int getScoreTeamTwo() {
        return scoreTeamTwo;
    }

    @Override
    public void setScoreTeamTwo(int scoreTeamTwo) {
        this.scoreTeamTwo = scoreTeamTwo;
    }

    @Override
    public boolean isClockStarted() {
        return clockStarted;
    }

    @Override
    public void setClockStarted(boolean clockStarted) {
        this.clockStarted = clockStarted;
    }

    @Override
    public boolean isGameOver() {
        return gameOver;
    }

    @Override
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    @Override
    public String[] getEquipmentNeeded() {
        return equipmentNeeded;
    }

    @Override
    public void setEquipmentNeeded(String[] equipmentNeeded) {
        this.equipmentNeeded = equipmentNeeded;
    }

    @Override
    public boolean startClock(){
        setClockStarted(true);
        System.out.println("The clock in Football has started");
        return clockStarted;
    }

    @Override
    public void stopClock(){
        clockStarted = false;
        System.out.println("The clock in Football has stopped");
    }

    @Override
    public void score(){
        System.out.println("Team one's score in Football is " + scoreTeamOne);
        System.out.println();
    }

    @Override
    public void equipment(){
        for(String string : equipmentNeeded){
            System.out.println(string);
        }
    }

    @Override
    public void timeType(){
        System.out.println("The time type in Football is " + getSessionType());
        setSessionTime(15);     //set to 15 for default's sake since not putting in the rest of classes
        System.out.println("The amount of time in a " + getSessionType() + " is " + getSessionTime() + " minutes.");
    }



}
