package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        boolean c = true;
        boolean d = false;

        //example of AND
        if(a & b){
            System.out.println("a and b are true");
        }

        //example of short circuit AND
        if((a | b) && (b | c )){
            System.out.println("Both (A or B) and (B or C) are true");
            //example of NOT
            if(!(a | b)){
                System.out.println("(A or B) was false, so (B | C) not evaluated");
            }
        }

        //example of short circuit OR
        if((a | b) || (b | c )){
            System.out.println("Either (A or B) or (B or C) are true");
            if(a | b){
                System.out.println("(A or B) was true, so (B | C) not evaluated");
            }
        }

        //example of short circuit XOR
        if((a | b) ^ (b | c )){
            System.out.println("Either (A or B) or (B or C) are true but both are not true");
            if(a | b){
                if(b | c){
                    System.out.println("Both expressions were true, so XOR returns false");
                }
            }
        }
    }

}

