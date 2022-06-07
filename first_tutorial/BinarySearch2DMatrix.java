package first_tutorial;

import java.awt.*;
import java.util.Arrays;

/*
Aim is to reduce search space by skipping either row or column
Condition: Row and columns both are sorted
 */
public class BinarySearch2DMatrix {
    public static void main(String[] args) {
       int[] resp= new int[2];
        resp=search(new int[][]{{1,2,3},{4,5,6},{7,8,9}},6);
        System.out.println(Arrays.toString(resp));
    }
    public static int[] search(int[][] matrix,int target){
        int columnNum=matrix[0].length-1;
        for(int i=0;i<matrix[0].length;i++){
            for(int j=columnNum;j>=0;j++){
                if(matrix[i][j]==target)
                    return new int[]{i,j};
                else if(matrix[i][j]>target){
                    columnNum--;
                }else{
                    break;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
