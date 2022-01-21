package first_tutorial;

import java.util.*;

public class MaxItemAL {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(findMax(list));
    }
    static int findMax(ArrayList<Integer> arr){
        int max=0;
        for(int ele: arr){
            if(max<ele){
                max=ele;
            }
        }
        return max;
    }
}
