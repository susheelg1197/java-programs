package first_tutorial;

public class EvenDigitsCount {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,6784,-56};

        System.out.println(digitCount2(-12121));
    }
    static int isEvenDigits(int[] arr){
       int count=0;
       for(int num: arr){
           if(digitCount(num)%2==0){
                count++;
           }
       }

        return count;

    }
    static int digitCount2(int num){
        // for negative numbers
        if(num<0){
            num*=-1;
        }
        return (int)Math.log10(num)+1; // optimized way to find number of digits
    }
    static int digitCount(int num){
        int digits=0;
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        while(num!=0){
            num=num/10;
            digits++;
        }
        return digits;
    }
}
