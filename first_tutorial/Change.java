package first_tutorial;

import java.util.*;
public class Change {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String s="Susheel "; // creating a new object, immutable for security reasons.

        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] array){
        array[0]=99; // if you make a change in the object then the same object will be changed
    }
}
