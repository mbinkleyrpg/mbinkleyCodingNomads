package labs_examples.static_nonstatic.labs;

public class ExerciseOneClassOne {
    public static void superStatic(){
        System.out.println("Inside One.superStatic");
        anotherSuperStatic();
    }

    public void superNonStatic(){
        System.out.println("Inside One.superNonStatic");

    }

    public static void anotherSuperStatic(){
        System.out.println("Inside One.anotherSuperStatic");
        System.out.println("#2");
        ExerciseOneClassOne exerciseOneClassOne = new ExerciseOneClassOne();
        exerciseOneClassOne.superNonStatic();
    }

    public void anotherSuperNonStatic(){
        System.out.println("Inside One.anotherSuperNonStatic");
        System.out.println("#5");
        nonStaticMania();

    }

    public static void yetAnotherSuperStatic(){
        System.out.println("Inside One.yetAnotherSuperStatic");
        ExerciseOneClassTwo.staticIsAsStaticDoes();
    }

    public void nonStaticMania(){
        System.out.println("Inside One.nonStaticMania");
        System.out.println("#6");
        ExerciseOneClassTwo exerciseOneClassTwo = new ExerciseOneClassTwo();
        exerciseOneClassTwo.nonStaticAcademy();
    }

    public static void lastStatic(){
        System.out.println("Inside One.lastStatic");
    }
}

