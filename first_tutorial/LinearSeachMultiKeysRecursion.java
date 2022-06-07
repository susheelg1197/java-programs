package first_tutorial;
import java.util.*;
public class LinearSeachMultiKeysRecursion {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,4,5},4,0));
    }
    static ArrayList linearSearch(int[] arr, int key, int index){

        ArrayList al=new ArrayList<Integer>();
        if(index==arr.length)
            return al;
        if(arr[index]==key){
            al.add(index);
        }


        al.addAll(linearSearch(arr,key,index+1));
        return al;
    }
}
