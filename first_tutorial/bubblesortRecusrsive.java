package first_tutorial;
import java.util.Arrays;
public class bubblesortRecusrsive {
    public static void main(String[] args) {
        int[] arr=new int[]{5,6,12,3,4,10,3,4,56,78};
        bubblesort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr, int i, int j){
        if(i==arr.length || j==arr.length)
            return;
        if(arr[i]>arr[j]){
            swap(arr,i,j);
        }
        if(j==arr.length-1)
            bubblesort(arr,i+1,i+2);
        else
            bubblesort(arr,i,j+1);
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
