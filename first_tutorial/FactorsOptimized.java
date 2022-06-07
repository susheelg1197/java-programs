package first_tutorial;

import java.util.*;
public class FactorsOptimized {
    public static void main(String[] args) {
        int n=40;
        // store half in array list
        List al=new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0) {
                if(n/i==i)
                    System.out.println(i);
                else {
                    System.out.print(i + " ");
                    al.add(n/i);
                }
            }

        }
        for(int i= al.size()-1;i>=0;i--){ // to sort the list the time and space complexity will be O(sqrt(n))
            System.out.print(al.get(i)+" ");
        }
    }
}

