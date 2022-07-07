package labs_examples.static_nonstatic.labs;

public class ExerciseOneClassTwo {
    public static void staticIsAsStaticDoes(){
        System.out.println("Inside Two.staticIsAsStaticDoes");
        System.out.println("#4");
        ExerciseOneClassOne anotherExerciseOneClassOne = new ExerciseOneClassOne();
        anotherExerciseOneClassOne.anotherSuperNonStatic();
    }

    public void nonStaticAcademy(){
        System.out.println("Inside Two.nonStaticAcademy");
        System.out.println("#7");
        staticMania();
    }

    public static void staticMania(){
        System.out.println("Inside Two.staticMania");
    }

    public void nonStaticSatire(){
        System.out.println("Inside Two.nonStaticSatire");
        ExerciseOneClassOne.lastStatic();
    }

}

