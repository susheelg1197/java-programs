package first_tutorial;

import java.util.Arrays;

public class FirstLastKeyPos {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{1,2,3,4},2).toString());
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] minmax= {-1, -1};
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                minmax[0]=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                minmax[1]=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return minmax;
    }
}
