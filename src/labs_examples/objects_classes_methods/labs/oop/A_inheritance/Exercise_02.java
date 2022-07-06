package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10, because the variable is not private and set within a method (methods are polymorphic not variables)
 * if a method would have been called then it would get the method from class B and not class A, but since it was
 * only a variable the variable from class A was printed since it 'a' was of type A
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}