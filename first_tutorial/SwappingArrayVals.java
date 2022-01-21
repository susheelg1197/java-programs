package first_tutorial;
import java.util.Scanner;
import java.util.Arrays;
public class SwappingArrayVals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter index to be swapped");
        if(n>0){
            int index1=sc.nextInt();
            int index2=sc.nextInt();
            if(index1<n-1 && index2<n-1) {
                int[] arr = new int[n];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                swap(arr, index1, index2);
                System.out.println("Swapped array: "+Arrays.toString(arr));
            }
        }



    }
    static void swap(int[] array, int index1,int index2){
        array[index1]=array[index2]+array[index1];
        array[index2]=array[index1]-array[index2];
        array[index1]=array[index1]-array[index2];
    }
}
