/*
Write a function that xors a to b

we know the patter in xor from 0 to a

where ,
a%4=0 ->a
a%4=1 -> 1
a%4=2 -> a+1
a%4=3 -> 0
 */

package first_tutorial;

public class xorinrange {
    public static void main(String[] args) {
        int a=3,b=9;
        System.out.println(xorInRange(a-1)^xorInRange(b));
    }
    static int xorInRange(int a){
        if(a%4==0)
            return a;
        else if(a%4==1)
            return 1;
        else if(a%4==2)
            return a+1;
        return 0;
    }
}

