package first_tutorial;
import java.util.*;
public class Fibonacci {
    public static void main(String args[]) {
    // find nth fibonacci number
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fib1=0,fib2=1,res=0;
        for(int i=1;i<n;i++){
            res=fib1+fib2;
            fib1=fib2;
            fib2=res;
        }
        System.out.println(res);
    }
}
