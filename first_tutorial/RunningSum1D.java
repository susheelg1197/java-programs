/*
https://leetcode.com/problems/running-sum-of-1d-array/submissions/
 */
package first_tutorial;
import java.util.Arrays;
public class RunningSum1D {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    //time complexity O(n-1)
    // Space Complexity constant
    static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;

    }
}
