package first_tutorial;
import java.util.List;
import java.util.ArrayList;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l= new ArrayList<>();
        int maxEle=findMax(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxEle){
                l.add(true);
            }else{
                l.add(false);
            }

        }
        return l;
    }
    static int findMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
