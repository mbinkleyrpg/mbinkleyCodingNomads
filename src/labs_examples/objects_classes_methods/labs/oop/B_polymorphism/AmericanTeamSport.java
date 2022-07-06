package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class AmericanTeamSport implements Sport{
    private int scoreTeamOne;
    private int scoreTeamTwo;
    private boolean clockStarted = false;
    private boolean gameOver = false;
    private String sessionType;
    private double sessionTime;
    private String objectType;          //ball, puck, etc.
    private String[] equipmentNeeded;   //an array of equipment to be used in given sport

    public AmericanTeamSport(){     //default constructor

    }

    public AmericanTeamSport(int scoreTeamOne, int scoreTeamTwo, boolean clockStarted, boolean gameOver, String sessionType, double sessionTime,
    String objectType){
        this.scoreTeamOne = scoreTeamOne;
        this.scoreTeamTwo = scoreTeamTwo;
        this.clockStarted = clockStarted;
        this.gameOver = gameOver;
        this.sessionType = sessionType;
        this.sessionTime = sessionTime;
        this.objectType = objectType;
    }

    public int getScoreTeamOne() {
        return scoreTeamOne;
    }

    public void setScoreTeamOne(int scoreTeamOne) {
        this.scoreTeamOne = scoreTeamOne;
    }

    public int getScoreTeamTwo() {
        return scoreTeamTwo;
    }

    public void setScoreTeamTwo(int scoreTeamTwo) {
        this.scoreTeamTwo = scoreTeamTwo;
    }

    public boolean isClockStarted() {
        return clockStarted;
    }

    public void setClockStarted(boolean clockStarted) {
        this.clockStarted = clockStarted;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public double getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(double sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String[] getEquipmentNeeded() {
        return equipmentNeeded;
    }

    public void setEquipmentNeeded(String[] equipmentNeeded) {
        this.equipmentNeeded = equipmentNeeded;
    }

    @Override
    public boolean startClock(){
        setClockStarted(true);
        System.out.println("The clock in an American Team Sport has started");
        return clockStarted;
    }

    @Override
    public void stopClock(){
        setClockStarted(false);
        System.out.println("The clock in an American Team Sport has stopped");
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
        setSessionType("Quarter");  //most sports use quarters, will override in college basketball to half
        //will set session times in individual sports because they vary so much
    }


}
