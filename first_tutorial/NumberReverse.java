package first_tutorial;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt(),rev=0;
        while(num!=0){
            rev=(rev*10)+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
