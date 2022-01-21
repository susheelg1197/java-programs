package first_tutorial;
/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
 */

import java.util.Arrays;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 5};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    //Brute force method O(n^2)
//    static int[] smallerNumbersThanCurrent(int[] nums) {
//        //brute force method
//        int[] result = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length ;j++){
//                if(j==i){
//                    continue;
//                }
//                if(nums[i]>nums[j]){
//                    result[i]++;
//                }
//            }
//        }
//        return result;
//    }
//
    // Enhanced solution with O(n) Complexity
    /*
    Logic is
    1) keep a map of <int,int> add counter to 1
    2) Loop over all the numbers by adding previous element eg 1,2-> 1+2 next element 3
    this will help us understand small numbers below that
    3) Loop over original array and get the count from prev element
     */
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // limit is 100 only use as map<int,int>
        int[] ans=new int[nums.length]; // final answer will be stored here

        for(int i=0;i<nums.length;i++){
            count[nums[i]+1]++; //storing the element in one index ahead
            //eg: [8]->0th index store that ele in 9th index
        }
        for(int c=1;c<101;c++){
            count[c]+=count[c-1]; // previous elements sum
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=count[nums[i]]; // get the count in previous element
        }

        return ans;

    }
}