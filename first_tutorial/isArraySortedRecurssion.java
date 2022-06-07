package first_tutorial;

public class isArraySortedRecurssion {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,2,6,3,4,5},0));
    }
    static boolean isSorted(int[] arr,int i){
        if(i>arr.length-2){
            return true;
        }
        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }
}
