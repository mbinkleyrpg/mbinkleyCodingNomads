package labs_examples.packages.labs.my_example_package_two;

import labs_examples.packages.labs.my_example_package_one.PackageOneClass;

public class PackageTwoSubclass extends PackageOneClass {

    protected static void packageTwoProtectedSubclass(){
        System.out.println("I'm in package two's protected subclass of package one");
    }

    private void packageTwoPrivateSubclass(){
        System.out.println("I'm in package two's private subclass of package one");

    }

    public static void packageTwoPublicSubclass(){
        System.out.println("I'm in package two subclass' public");
        PackageOneClass.packageOnePublic();
        //PackageOneClass.packageOnePrivate();        //cannot do because private methods/classes are only visible by classes in the same package
        PackageOneClass.packageOneProtected();
        System.out.println("Leaving package two subclass' public");

    }

}
