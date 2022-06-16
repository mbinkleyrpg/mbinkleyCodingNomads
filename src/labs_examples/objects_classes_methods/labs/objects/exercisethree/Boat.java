package labs_examples.objects_classes_methods.labs.objects.exercisethree;

public class Boat {
    public static void main(String[] args) {
        Driver driver = new Driver("Captain Jack Sparrow");
        Driver driverTwo = new Driver("Captain Indominus Rex");
        Job job = new Job("find treasure");
        Job jobTwo = new Job("eating plant eaters; also known as herbivores");
        System.out.println(driver.toString() + " is using this boat to " + job.toString());
        System.out.println(driverTwo.toString() + " is using this boat to " + jobTwo.toString());
    }
}
