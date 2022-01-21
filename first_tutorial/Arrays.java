/*
Why arrays: to store collection of homogenous data types
Syntax: data type [] variable_name= new data_type[size];

 */

package first_tutorial;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Q store 5 numbers
        int[] rn= new int[5];// internally [0,0,0,0,0] for string its null
        String[] str =new String[10];// string is null; null is a literal it can't be referenced to literal
        //can be assigned to non primitives.

        //direct initialize
        int[] rn1={1,2,3,4};
        /*
        int[] ros // declaration of an array
        ros =new int[size] // initialization; actual memory creation object is created in heap memory
        if you dont mention size it will give error
         */
        readWriteArrayOfPrimitives();
    }
    static void readWriteArrayOfPrimitives(){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i: arr){ // for each
    System.out.println(i);
    }
    }
}
