package first_tutorial;

public class CeilCharacter {
    public static void main(String args[]){
        char[] arr = {'c','f','g'};
        char key='b';
        System.out.println(binarySearch(arr,key));
    }
    public static char binarySearch(char[] arr,char key){
        if(key>=arr[arr.length-1]){
            return arr[0];
        }
        int low=0, high=arr.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(key>=arr[mid]) {
                low=mid+1;
            }else if(key<arr[mid]){
                high = mid - 1;
            }
            mid=low+(high-low)/2;
        }
    return arr[low];
    }
}
