package first_tutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DivisibleBy9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            long number = in.nextLong();

            System.out.println("Case #"+i+": "+ChallengeNine(number));
        }
    }
    static long ChallengeNine(long number){
        int length = (int) (Math.log10(number)+1)-1;
        int newDigit= 9-sumOfDigits(number)%9;
        long answer=0;
        while(number!=0){
            int firstDigit=(int)(number/Math.pow(10,length));
            if(newDigit==9){
                newDigit=0;
                answer+= firstDigit*Math.pow(10,length+1)+(long)number%Math.pow(10,length);
                return answer;
            }else{

                if(newDigit<firstDigit){
                    answer+=newDigit*Math.pow(10,length+1)+number%Math.pow(10,length+1);

                    return answer;
                }
                answer+=firstDigit*Math.pow(10,length+1);
            }
            number-=firstDigit*Math.pow(10,length);
            length--;
        }

        return answer+newDigit;
    }
    static int sumOfDigits(long number){
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
