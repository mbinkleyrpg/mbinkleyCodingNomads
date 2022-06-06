package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        double c = 300.05;
        double d = 400.45f;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("____________");

        int adding = a + b;
        int subtracting = adding - b;
        double multiplying = b * c;
        double dividing = d / a;
        int moduloing = (int) (d % a);
        System.out.println("A + B = " + adding);
        System.out.println("A + B - B = " + subtracting);
        System.out.println("B * C = " + multiplying);
        System.out.println("D / A = " + dividing);
        System.out.println("Remainder from D / A = " + moduloing);
    }

}
