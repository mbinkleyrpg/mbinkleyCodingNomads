package labs_examples.static_nonstatic.labs;

public class ExerciseOneController {
    public static void main(String[] args) {
        System.out.println("#1");
        ExerciseOneClassOne.superStatic();

        System.out.println("#3");
        ExerciseOneClassOne.yetAnotherSuperStatic();

        System.out.println("#8");
        ExerciseOneClassTwo needAnotherInstanceOfClassTwo = new ExerciseOneClassTwo();
        needAnotherInstanceOfClassTwo.nonStaticSatire();
    }
}

