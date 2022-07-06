package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Basketball extends AmericanTeamSport {
    private final String objectType = "ball";
    private String[] equipmentNeeded;
    private String sessionType;
    private double sessionTime;
    private int scoreTeamOne;
    private int scoreTeamTwo;
    private boolean clockStarted = false;
    private boolean gameOver = false;


    public Basketball(){            //default constructor

    }

    public Basketball(String sessionType, double sessionTime, int scoreTeamOne, int scoreTeamTwo, boolean clockStarted, boolean gameOver){
        this.sessionType = sessionType;
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
    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
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
    public String getObjectType() {
        return objectType;
    }

    @Override
    public void setEquipmentNeeded(String[] equipmentNeeded) {
        this.equipmentNeeded = equipmentNeeded;
    }

    @Override
    public String[] getEquipmentNeeded() {
        return equipmentNeeded;
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
    public boolean startClock(){
        setClockStarted(true);
        System.out.println("The clock in Basketball has started");
        return clockStarted;
    }

    @Override
    public void stopClock(){
        setClockStarted(false);
        System.out.println("The clock in Basketball has stopped");
    }

    @Override
    public void score(){
        setScoreTeamOne(0);
        setScoreTeamTwo(0);
    }

    @Override
    public void equipment(){
        for(String string : equipmentNeeded){
            System.out.println(string);
        }
    }

    @Override
    public void timeType(){
        System.out.println("The time type in basketball is " + getSessionType());

    }
}
