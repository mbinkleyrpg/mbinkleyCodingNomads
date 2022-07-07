package labs_examples.packages.labs.my_example_package_two;

import labs_examples.packages.labs.my_example_package_one.PackageOneClass;

public class PackageTwoClass {
    protected static void packageTwoProtected(){
        System.out.println("I'm in package two's protected private");
    }

    private void packageTwoPrivate(){
        System.out.println();
    }

    public static void packageTwoPublic(){
        System.out.println("I'm in package two's public");
        PackageOneClass.packageOnePublic();
        //PackageOneClass.packageOnePrivate();        //cannot do because private methods/classes are only visible by classes in the same package
        //PackageOneClass.packageOneProtected();      //cannot do because the current class we are in isn't a subclass of PackageOneClass
        System.out.println("Leaving package two's public");
    }

}
