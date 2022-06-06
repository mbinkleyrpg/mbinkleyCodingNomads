package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double pi = 3.14;
        double radius = 3.14;
        int height = 5;

        //volume of a right cylinder = pi * r^2 * h
        double volume = pi * (radius * radius) * height;
        //surface area of a cylinder = (2 * pi * r * h) + (2 * pi * r^2)
        double surfaceArea = (2 * pi * radius * height) + (2 * pi * (radius * radius));

        System.out.println("The volume is: " + volume);
        System.out.println("The surface area is: " + surfaceArea);
    }
}