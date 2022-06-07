package first_tutorial;
/*
What is infinite array: array whose size is unkonwn
which means that we cant use length function

Binary search bottom up approach
find start and end positions to perform binary search

finding range start and end algo:
loop till target is greater than end element
start with box soze 2
low=0
high=1
this will check first two elements
formula of box size -> low+high+1

 */

public class binarySearchOnInfiniteArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12};
        int target=13,low=0,high=1;
        while(target>nums[high] && target<=nums[nums.length-1]){
           int newlow=high+1;
           high=high+2*(high-low+1);
           if(high>nums.length)
               high=nums.length-1;
           low=newlow;
        }
        System.out.println("Pos:: "+ binarySearch(low,high,target,nums));
    }
    public static int binarySearch(int low, int high, int target,int[] nums){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
              return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
