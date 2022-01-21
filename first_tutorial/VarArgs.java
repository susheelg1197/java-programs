package first_tutorial;

import java.util.Arrays;

/*
Variable number of arguments
 */
public class VarArgs {
    public static void main (String args[]){
    variableargs(1,2,3,2,3);
    }
    static void multiple(int a, int b, String ...s){ // the multiple variable must be at the end

    }
    static void variableargs(int ...v){ // internally store in array
        System.out.println(Arrays.toString(v));
    }
}
