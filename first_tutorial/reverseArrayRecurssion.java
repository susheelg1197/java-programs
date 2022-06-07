package first_tutorial;
import java.util.Arrays;
public class reverseArrayRecurssion {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5};
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr,int i,int j){
        if(i>j)
            return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(arr,i+1,j-1);
    }
}
