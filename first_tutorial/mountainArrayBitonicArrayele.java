package first_tutorial;

/*
What is mountain array?
its an array of elements where numbers are increasing from one end and decreasing from there end
peak element is the number where both the lists join

Eg: 0,1,0 here -> 1 is the peak element

Approach:
1) linear Search Brute force approach -> till you get an element that is smaller
2) Binary Search optimized solution
[0,1,0]
Conditions:
if mid element > mid+1 then end = mid
if mid element < mid+1 then start= mid+1 take example to simplify 1,2,3,5,4,3
3 is mid element which is less than 5 so increment the low pointer by mid+1
new low is 5 and high is 3
Take mid which becomes 4 which is greater than 3 so we will keep 4 as end now

When to loop till?
as both low and high will meet at the end loop till low and high not equal
 */
public class mountainArrayBitonicArrayele {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low=0, high=arr.length-1;
        while(low!=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }

        }
        return low;
    }
}
