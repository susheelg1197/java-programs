/*
https://leetcode.com/problems/concatenation-of-array/submissions/
 */
package first_tutorial;

import java.util.Arrays;
public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] array= {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(array)));
    }

    // Easy method
    // Time complexity is n*2 and space complexity is n*2
//    int[] getConcatenation(int[] nums) {
//        int[] ans= new int[nums.length*2];
//        int j=0;
//        for(int i=0;i<nums.length*2;i++){
//            ans[i]=nums[j];
//            if(j==nums.length-1){
//                j=0;
//            }else{
//                j++;
//            }
//        }
//        return ans;
//    }

    //Enhanced solution time complexity O(N)
    static int[] getConcatenation(int[] nums) {
        int[] ans= new int[nums.length*2];
        for(int j=0;j<nums.length;j++){
            ans[j]=nums[j];
            ans[j+nums.length]=nums[j];
        }
        return ans;
    }

}
