/*
https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
package first_tutorial;
import java.util.Arrays;
import java.util.ArrayList;
public class TargetArrayOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,0}, index = {0,1,0};
    String str ="hahhahah";
    char c='a';
        System.out.println((int)c);
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    /*
    In this you can use ArrayList for shorter code
    ArrayList.add(index, element) -> adds the element in that index position and shifts other
    ArrayList.get()-> gets the element from the index pos
     */
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> al=new ArrayList<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            al.add(index[i],nums[i]);
        }
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
//    static int[] createTargetArray(int[] nums, int[] index) {
//        //O(n^2) solution
//        int[] ans=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            ans=add(index[i],ans,nums[i]);
//        }
//        return ans;
//    }
    /*
    Logic of split and add element to a new place using new array
    Iterate until position and add all elements till pos
    After that add pos
    Add elements index-1
     */
    static int[] add(int pos, int[] splited,int element){
        int[] temp=new int[splited.length];
        for(int i=0;i<splited.length;i++){
            if(i<pos){
                temp[i]=splited[i];
            }else if(i>pos){
                temp[i]=splited[i-1];
            }

        }
        temp[pos]=element;
        return temp;
    }
}
