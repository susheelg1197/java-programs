package first_tutorial;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        reverseArrayWithSwap(array);
        System.out.println(Arrays.toString(array));
    }
    static void reverseArrayWithSwap(int[] arr){ // two pointer questions
        int first=0, last=arr.length-1;
        while(first!=last){
            swap(arr,first,last);
            first++;
            last--;
        }
    }
    static void swap(int[] array, int index1,int index2){
        array[index1]=array[index1]+array[index2];
        array[index2]=array[index1]-array[index2];
        array[index1]=array[index1]-array[index2];
    }

    static void reverseArray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
