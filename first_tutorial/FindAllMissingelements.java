package first_tutorial;
import java.util.*;
/*
Using cyclic sort find all the missing elements
test case [4,3,2,7,8,2,3,1]
ans= [5,6]
 */

public class FindAllMissingelements {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedList =new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]-1==i || nums[i]>nums.length || nums[i]==nums[nums[i]-1]){
                i++;
            }else{
                swap(nums,nums[i]-1,i);
            }
        }
        i=0;
        while(i<nums.length){
            if(nums[i]-1!=i)
                disappearedList.add(i+1);
        }
        return disappearedList;
    }
    public static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
