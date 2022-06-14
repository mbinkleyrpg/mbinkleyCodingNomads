package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        String[][] stringArrayOfStrings = new String[5][5];
        int counter = 1;

        //populate the array
        for(int i = 0; i < stringArrayOfStrings.length; i++){
            for(int j = 0; j < stringArrayOfStrings.length; j++){
                stringArrayOfStrings[i][j] = "String #" + counter;
                counter++;
            }
        }

        //iterate backward through array, skip counting by 2
        for(int k = stringArrayOfStrings.length - 1; k >= 0; k--){
            for(int l = stringArrayOfStrings.length - 1; l >= 0; l-=2){
                System.out.print(stringArrayOfStrings[k][l] + "   ");
            }
            System.out.println();
        }
    }
}
