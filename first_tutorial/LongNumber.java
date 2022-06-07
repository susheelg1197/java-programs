package first_tutorial;

public class LongNumber {
    public static void main(String[] args) {
        double number=0;
        int[] num={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k=516;
        for(int i=0;i<num.length;i++){
            number+=num[i]*(Math.pow(10,num.length-i-1));
            System.out.println(number);
        }
        System.out.println(number);
    }
}
