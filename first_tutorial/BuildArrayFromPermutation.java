/*
https://leetcode.com/problems/build-array-from-permutation/
 */
package first_tutorial;
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,0};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    //Optimized solution with space complexity O(1)
    static int[] buildArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums.length*(nums[nums[i]]%nums.length)+nums[i]; // logic to use the same location to store original as well as new value
        }
        for(int i=0;i<nums.length;i++){
            nums[i]/=nums.length; //it will give the new value that is quotient
        }
        return nums;
    }

    //ordinary solution with space complexity O(n)
//   static int[] buildArray(int[] nums) {
//        int len=nums.length;
//        int[] ans=new int[len];
//        for(int i=0;i<nums.length;i++){
//            ans[i]=nums[nums[i]];
//        }
//        return ans;
//    }
}
