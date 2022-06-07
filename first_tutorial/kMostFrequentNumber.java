package first_tutorial;

import java.util.*;
public class kMostFrequentNumber {
    public static void main(String[] args) {
        int[] arr={5, 2, 1, 3, 2};
        //Output : 5 2 5 1 2 5 1 2 3 5 2 1 3 5
        int k=4;
        System.out.println(calculateKmostFrequent(arr,k));
    }
    static List<Integer> calculateKmostFrequent(int[] arr, int k){
        List<Integer> finalList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int counter=0;
            Map<Integer,Integer> freqchecker =new HashMap<>();
            for(int j=i;j>=0 && j>j-k;j--){
                freqchecker.put(arr[j],freqchecker.get(arr[j])!=null?freqchecker.get(arr[j])+1:1);
                if(freqchecker.get(arr[j])==null || freqchecker.get(arr[j])==1){
                    finalList.add(arr[j]);
                    counter++;
                }
            }
            Collections.sort((finalList.subList(finalList.size()-counter,finalList.size())),(t1,t2)->{
                return freqchecker.get(t1)>freqchecker.get(t2)?-1:t1>=t2?1:-1;
            });
        }
        return finalList;
    }
}
