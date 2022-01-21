package first_tutorial;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to find: ");
        int ele=sc.nextInt();
        int foundIndex=linearSearch(arr,ele);
        if(foundIndex==-1){
            System.out.println("element not found!");
        }else{
            System.out.println("ele found at index: "+foundIndex);
        }

    }
    static int linearSearch(int[] ele,int key){
        for(int i=0;i<ele.length;i++){
            if(ele[i]==key){
                return i;
            }
        }
        return -1;
    }
}
