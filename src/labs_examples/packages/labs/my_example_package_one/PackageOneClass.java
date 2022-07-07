package labs_examples.packages.labs.my_example_package_one;

import labs_examples.packages.labs.my_example_package_two.PackageTwoClass;
import labs_examples.packages.labs.my_example_package_two.PackageTwoSubclass;

public class PackageOneClass {
     //Create at least two methods in each class, with at least one with the protected access modifier
 //Demonstrate how the the protected access modifier restricts access from package to package
     public static void main(String[] args) {
            PackageTwoClass.packageTwoPublic();
            //packageTwoClass.packageTwoProtected();      //cannot do because the current class we are in isn't a subclass of packageTwoClass
            //packageTwoClass.packageTwoPrivate();          //cannot do because private methods/classes are only visible by classes in the same package

            PackageTwoSubclass.packageTwoPublicSubclass();
            //packageTwoSubclass.packageTwoProtectedSubclass();     //cannot do because the current class we are in isn't a subclass of packageTwoSubclass
            //packageTwoSubclass.packageTwoPrivateSubclass();       //cannot do because private methods/classes are only visible by classes in the same package
     }

     protected static void packageOneProtected(){
         System.out.println("I'm in package one's protected");
     }

     private static void packageOnePrivate(){
         System.out.println("I'm in package one's private");
     }

     public static void packageOnePublic(){
         System.out.println("I'm in package one's public");
     }
}
