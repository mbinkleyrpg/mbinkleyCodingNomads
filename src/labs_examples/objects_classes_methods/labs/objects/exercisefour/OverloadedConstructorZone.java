package labs_examples.objects_classes_methods.labs.objects.exercisefour;

public class OverloadedConstructorZone {
    String reason;
    int numberOfTimes;
    boolean doesItWork;

    public OverloadedConstructorZone(){         //default constructor

    }

    public OverloadedConstructorZone(String reason){
        this.reason = reason;
    }

    public OverloadedConstructorZone(String reason, int numberOfTimes){
        this.reason = reason;
        this.numberOfTimes = numberOfTimes;
    }

    public OverloadedConstructorZone(String reason, int numberOfTimes, boolean doesItWork){
        this.reason = reason;
        this.numberOfTimes = numberOfTimes;
        this.doesItWork = doesItWork;
    }

    @Override
    public String toString(){
        return "I said to do it  " + reason + " " + numberOfTimes + " times" + " is " + doesItWork;
    }

}
