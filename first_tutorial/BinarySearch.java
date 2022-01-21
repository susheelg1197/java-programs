package first_tutorial;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        System.out.println(search(arr,10));
    }
    static int search(int[] nums, int target) {
        int low=0,mid,high=nums.length-1;
        mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        while(low<=high){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            mid=(low+high)/2;

        }
        return -1;
    }
}
