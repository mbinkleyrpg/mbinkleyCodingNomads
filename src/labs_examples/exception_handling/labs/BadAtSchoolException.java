package labs_examples.exception_handling.labs;

public class BadAtSchoolException extends Exception{
    @Override
    public String toString(){
        return "someone has been bad at school.";
    }
}
