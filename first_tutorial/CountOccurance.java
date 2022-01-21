/*
Problem Statement: Find occurances of number 7
 */
package first_tutorial;

public class CountOccurance {
     public static void main(String args[]){
         long n=123788970007l;
         int count=0;
         while(n!=0){
             if(n%10==7){
                 count++;
             }
             n/=10;
         }
         System.out.println(count);
     }
}
