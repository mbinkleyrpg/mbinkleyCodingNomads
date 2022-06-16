package labs_examples.objects_classes_methods.labs.objects.exercisethree;

public class Driver {
    String name;

    public Driver(){
    }

    public Driver(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
