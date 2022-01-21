package first_tutorial;

import java.util.Arrays;
public class CountBestPairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5} ;
        System.out.println(Arrays.toString(arr));
    }
    //Brute force approach
//    static int numIdenticalPairs(int[] nums) {
//        int count=0;
//        //brute force
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    // Using Maps this problem is similar to count the frequency of letters
    // Space complexity O(n)
    // Time Complexity O(n)
    static int numIdenticalPairs(int[] nums) {
        int ans=0;
        //By default, values are set to 0
        int[] arr=new int[101];// as we know the limit we will be using this as a map of int,int
        for(int num:nums){
            // main logic here is that ans=ans+ arr[that_number]++ each time that num is found
            ans+=arr[num]++;
        }
        return ans;
    }
}
