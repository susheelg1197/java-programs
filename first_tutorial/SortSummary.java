package first_tutorial;
import java.sql.Array;
import java.util.*;
public class SortSummary {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<Integer>(){{
            add(3);
            add(3);
            add(1);
            add(2);
            add(1);
        }}; // single line intialization
        System.out.println(groupSort(l));
    }
    static List<List<Integer>> groupSort(List<Integer> arr) {
        // Write your code here
        List<List<Integer>> al =new ArrayList<>();
        int[] countList=new int[10001];
        for(int i=0;i<arr.size();i++){
            countList[arr.get(i)]++;
        }
        int j=0;
        for(int i=0;i<countList.length;i++){
            if(countList[i]!=0) {
                List<Integer> mapping = new ArrayList<>();
                mapping.add(0, i);
                mapping.add(1, countList[i]);
                al.add(mapping);
            }
        }
        Collections.sort(al, (t1,t2)->{
                if(t1.get(1)<t2.get(1)) {
                    return 1;
                }else if(t1.get(1)>t2.get(1)){
                    return -1;
                }
                return t1.get(1)==t2.get(1) && t1.get(0)<t2.get(0)?-1:1;
            }
        );
        return al;
    }
}
