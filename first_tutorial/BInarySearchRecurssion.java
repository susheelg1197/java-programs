package first_tutorial;

public class BInarySearchRecurssion {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5},0,4,10));
    }
    static int binarySearch(int[] arr,int low, int high,int key){
        if(low>high)
            return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
           return binarySearch(arr,low,mid-1,key);
        }
            return binarySearch(arr,mid+1,high,key);
        
    }
}
