package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        int i = 0;      //counter for populating ArrayList

        //do-while loop to populate ArrayList with random numbers up to i being 100
        do{
            myArrayList.add(i * 2);

            //if i is even, add 3 to it instead of the typical i++
            if(i % 2 == 0){
                i += 3;
            }
            else{
                i++;
            }

        }while(i < 100);

        //for loop to print contents of populated Array List
        for(int j = 0; j < myArrayList.size(); j++){
            System.out.println("The element at index number " + j + " is: " + myArrayList.get(j));
        }
        System.out.println("_______________");

        //add element 200 in index 4, not at the end of ArrayList
        myArrayList.add(4, 200);
        System.out.println("Added a new number to index 4");
        for(int j = 0; j < 7; j++){
            System.out.println("The element at index number " + j + " is: " + myArrayList.get(j));
        }
        System.out.println("_______________");

        //remove the newly inserted index 4
        myArrayList.remove(4);
        System.out.println("Removed index 4's ridiculous number");
        for(int j = 0; j < 7; j++){
            System.out.println("The element at index number " + j + " is: " + myArrayList.get(j));
        }
        System.out.println("_______________");

        //removing all elements from the ArrayList
        for(int j = 0; j < myArrayList.size(); j++){
            myArrayList.removeAll(myArrayList);
        }
        System.out.println("Removed all elements from the Array List");

        System.out.println("_______________");


    }
}
