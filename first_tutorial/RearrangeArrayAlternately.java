/*
Rearrange Array Alternately in O(1) space complexity and O(N) Time Complexity Geeksforgeeks Solution
To get in Space complexity O(1)

Simple mathematics
Reason of using this is we want two values at a single place
We can do it in a sorted array
Divident=Divisor*Quotient+Remainder
Divisor=max
Quotient=new_value
Remainder=old_value
We want both old and new value together
We also know that,
Quotient= Divident/Divisor
Remainder= Divident%Divisor

Eg: 1,2,3 -> 3,2,1
max 4
[0]= 4*(3%4)+1=13 -> 13/4=3 i.e new value and 13%4=1 old value
EG: [2,0,1]-> [0,1,2]
divisor=3
[0]-> 3*0+2-> 2 -> /3 -> 0
[1]-> 3*1+0->4 -> /3 -> 1
[2]->3*2+2->8  -> /3 -> 2

Question:
[1,2,3,4,5,6] -> [6,1,5,2,4,3]
 */
package first_tutorial;
import java.util.Arrays;
public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    static int[] rearrangeArray(int[] arr){
        int maxIndex=arr.length-1, minIndex=0,max=arr[arr.length-1]+1,i=0;
        while(maxIndex>=minIndex){
            if(i%2==0){
                arr[i]=max*(arr[maxIndex]%max)+arr[i];
                maxIndex--;
            }else{
                arr[i]=max*(arr[minIndex]%max)+arr[i];
                minIndex++;
            }
            i++;
        }
        for(int j=0;j<arr.length;j++){
            arr[j]/=max;
        }
        return arr;
    }
}
