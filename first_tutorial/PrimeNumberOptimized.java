/*
Optimized way of find prime numbers less than and equal to N
 */

package first_tutorial;

public class PrimeNumberOptimized {
    public static void main(String[] args) {
        int N=40;
        boolean arr[]= new boolean[N+1];

        for(int i=2;i<Math.sqrt(N);i++){
            if(arr[i])
                continue;
            if(!isPrime(i))
                continue;
            for(int j=2*i;j<=N+1;j+=i){
                arr[j]=true;
            }

        }
        for(int i=2;i<arr.length;i++){
            if(!arr[i])
                System.out.println(i);
        }
    }
    static boolean isPrime(int num){
        int i=2;
        while(i<Math.sqrt(num)){
            if(num%i==0)
                return false;
            i++;
        }
        return true;
    }
}
