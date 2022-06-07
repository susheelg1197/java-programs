package first_tutorial;
import java.util.Arrays;
/*
Condidtion is that the number must range 1 to n eg 1 to 5 where its unsorted
we know that the positon of any num[i] = num[i]-1
 */

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            while(arr[i]-1!=i){
                swap(arr, i, arr[i]-1);
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
            int temp =arr[first];
            arr[first]=arr[second];
            arr[second]=temp;

    }
}
