package labs_examples.objects_classes_methods.labs.objects.exercisefour;

public class OverloadedController {
    public static void main(String[] args) {
        OverloadedConstructorZone overloadedConstructorZone = new OverloadedConstructorZone();
        OverloadedConstructorZone overloadedConstructorZoneTwo = new OverloadedConstructorZone("because I said so");
        OverloadedConstructorZone overloadedConstructorZoneThree = new OverloadedConstructorZone("because I said so", 5);
        OverloadedConstructorZone overloadedConstructorZoneFour = new OverloadedConstructorZone("because I said so", 10, true);


        //exercise 5 is built below:
        System.out.println("Default constructor, missing all parameters: " + overloadedConstructorZone.toString());
        System.out.println("First parametized constructor, missing last two parameters: " + overloadedConstructorZoneTwo.toString());
        System.out.println("Second parametized constructor, missing last parameter: " + overloadedConstructorZoneThree.toString());
        System.out.println("Third parametized constructor, with all parameters: " + overloadedConstructorZoneFour.toString());
    }
}
