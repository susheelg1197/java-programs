package first_tutorial;
import java.util.Arrays;
/*
https://leetcode.com/problems/couples-holding-hands/submissions/
 */
public class CoupleHandshake {
    public static void main(String[] args) {
        System.out.println(minSwapsCouples(new int[]{0,2,4,6,7,1,3,5}));
    }
    public static int minSwapsCouples(int[] row) {
        int swaps=0;
        int[] maps= new int[row.length];

        for(int i=0;i<maps.length;i++){
            maps[row[i]]=i;

        }
        System.out.println(Arrays.toString(maps));
        int left=0,right=1;

        while(right<row.length){
            System.out.println(row[left]+"and:: "+row[right]+"and "+Arrays.toString(maps));
            if(Math.abs(row[left]-row[right])==1)
            {
                left=right+1;
                right=right+2;
                continue;
            }
            if(row[left]%2==1){
                System.out.println(left);

                row=swap(row,maps[row[left]-1],right);
                maps=swap(maps,row[left]-1,row[right]);
                swaps++;
            }else{
                row=swap(row,maps[row[left]+1],right);
                maps=swap(maps,row[left]+1,row[right]);
                swaps++;
            }
            left=right+1;
            right=right+2;
        }


        return swaps;
    }
    public static int[] swap(int[] arr, int f, int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
        return arr;
    }

}
