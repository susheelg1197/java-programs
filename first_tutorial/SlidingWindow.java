package first_tutorial;
import java.util.*;
import java.util.Arrays;
/*
10 Problems on sliding window
************* FIXED Sliding Window (size of window is fixed) *************
1) Max Sum Subarray for size =k
2) Find first negative integer in every sub array of size k
3) Count Occurrences Of Anagrams
************* Variable Sliding Window (size of wind is to be identified) *************
 */

public class SlidingWindow {
    public static void main(String[] args) {
//        System.out.println(maxSumKSubArray(new int[]{1,1,1,2,10,2,2,4,4},3));
//        System.out.println(Arrays.toString(firstNegative(new int[]{12,-1,-7,8,-15,30,16,28},3)));
        System.out.println(findAnagrams("abacbabc","abc"));
    }
    static int[] firstNegative(int[] arr, int k){
        int[] ans=new int[arr.length-k+1]; // the final answer array
        List<Integer> ls = new ArrayList<>(); //a list or a queue can be used in order to store the computation of negative numbers

        int i=0,j=0,index=0;

        while(j<arr.length){// till j reaches the last element
            if(j-i<k){ // for the first window i=0,j=0 ... j till k
                if(arr[j]<0) // compute if arr[j]<0 then add it to a list
                    ls.add(arr[j]);
                j++;
            }else if(j-i==k){ // when the window size is hit
                if(ls.size()==0) { // if the list is empty then assign 0 value
                    ans[index] = 0;
                }else{ // else assign the first element in the list
                    ans[index] = ls.get(0);
                }
                if(arr[i]==ls.get(0)){ // to clean the list check if the element will not be there in a window in future
                        ls.remove(ls.get(0)); // hence remove the element
                }

                if(arr[j]<0) // at the same time add arr[j] < 0 elements in the list
                    ls.add(arr[j]);

                // increment index values
                index++;
                i++;
                j++;
            }
        }



        return ans;
    }
    static int maxSumKSubArray(int[] arr, int k){
        int max=0;
        int sum=0;
        for(int i=0;i<k;i++){
            max+=arr[i];
        }
        sum=max;
        int left=0;
        int right=left+k;
        while(right<arr.length){
            sum=sum-arr[left]+arr[right];
            left++;
            right++;
            max=sum>max?sum:max;
        }
        return max;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> cp=new HashMap<>();
        int distinct_cnt=0;

        //Compute frequency and distinct count
        for(int i=0;i<p.length();i++){
            if(mp.containsKey(p.charAt(i))){
                mp.put(p.charAt(i),mp.get(p.charAt(i))+1);
            }else{
                mp.put(p.charAt(i),1);
                distinct_cnt++;
            }

        }
        cp.putAll(mp);

        int i=0,j=0,k=p.length();
        // Compute sliding window

        while(j<s.length()){
            if(j-i<k){
                if(mp.containsKey(s.charAt(j))) {
                    Integer ele = mp.get(s.charAt(j)) - 1;
                    mp.put(s.charAt(j), ele);
                    if (ele == 0)
                        distinct_cnt--;
                    else if (ele == -1)
                        distinct_cnt++;
                }
                j++;
            }else if(j-i==k){
                if(distinct_cnt==0) {
                    l.add(i);
                }
                if(mp.containsKey(s.charAt(i))){
                    mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                    if(mp.get(s.charAt(i))==1)
                        distinct_cnt++;
                    if(mp.get(s.charAt(i))==0)
                        distinct_cnt--;
                }
                if(mp.containsKey(s.charAt(j))){
                    mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                    if(mp.get(s.charAt(j))==0)
                        distinct_cnt--;
                    if(mp.get(s.charAt(j))==-1)
                        distinct_cnt++;
                }
                i++;
                j++;
            }

        }

        if(distinct_cnt==0)
            l.add(i);
        return l;
    }
}
