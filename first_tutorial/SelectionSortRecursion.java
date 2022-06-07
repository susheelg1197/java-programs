package first_tutorial;

import java.util.Arrays;
public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,56,1,7,8,3,12,13,10};
        selectionSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int max, int i, int j){
        if(i==0)
            return;
        if(j>i){
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            selectionSort(arr,0,i-1,0);
        }else{
            if(arr[max]<arr[j]){
                max=j;
            }
            selectionSort(arr,max,i,j+1);
        }
    }
}
