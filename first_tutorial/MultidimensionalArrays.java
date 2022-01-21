package first_tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
    /*
        1 2 3 4
        5 6 7 8
     */
        int[][] arr=new int[3][];// number of rows are mandatory but not columns
        // Reason: for heap memory to be created it requires row, variable column
        // individual size of array can vary as well
        int [][] array2d= {
                {1,2,3,4,5},
                {1,2}
        };
        int[][] num={
                {1,2,3},
                {3,4,5}};
        int[][] nums=new int[3][3];
        System.out.println(nums.length);

        // Read 2d array
        Scanner sc= new Scanner(System.in);
        for (int row=0;row<nums.length;row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = sc.nextInt();
            }
        }
        for(int[] ele: nums){
            System.out.println(Arrays.toString(ele));
        }
    }

}
