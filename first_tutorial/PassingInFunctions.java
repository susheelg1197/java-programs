package first_tutorial;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        changeVal(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void changeVal(int[] numbers){
    numbers[0]=99;
    }
}
