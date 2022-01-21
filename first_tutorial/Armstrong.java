package first_tutorial;

import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isArmstrong(num,numberOfDigit(num)));
    }
    static boolean isArmstrong(int num,int n) {
        double arm=0;
        int unchangednum=num;
        while(num!=0){
            arm=arm+Math.pow(num%10,n);
            num=num/10;
        }
        if(arm==unchangednum){
            return true;
        }
        return false;
    }
    static int numberOfDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
    return count;
    }
}
