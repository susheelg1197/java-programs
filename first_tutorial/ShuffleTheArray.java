package first_tutorial;
import java.util.Arrays;
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }
    static int[] shuffle(int[] nums, int n) {
        int min_index=1,max_index=n,max=1024;
        for(int i=1;i<nums.length-1;i++){
            if(i%2==0){
                nums[i]=nums[i]+max*(nums[min_index]%max);
                min_index++;
            }else{
                nums[i]=nums[i]+max*(nums[max_index]%max);
                max_index++;
            }
        }
        for(int i=1;i<nums.length-1;i++){
            nums[i]/=max;
        }
        return nums;
    }
}
