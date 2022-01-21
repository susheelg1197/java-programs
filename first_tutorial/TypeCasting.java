/*
Automatic type conversion:
1) Input integer and convert to float. (type should be compatible)
2) Destination type should be greater than the soure type LHS> RHS
NArrowing conversion -> narrow float into integer
 */

package first_tutorial;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        float f=sc.nextFloat();
        //type casting
        int num = (int)67.56;
        System.out.println(num);

        //auto type promotion
        int a=260;
        byte b= (byte)a;
        System.out.println(b);//a%256 i.e remainder because max is 256

        byte b1=24;
        char c='a';
        short s=1024;
        int i=111111;
        float f=128.23f;
        double dd=0.1234;
        System.out.println((f*b)+" "+(i/c)+" "+(dd-s));


    }
}
