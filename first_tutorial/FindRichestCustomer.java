package first_tutorial;

public class FindRichestCustomer {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {1,3,5}
        };
        System.out.println(richestCustomer(arr));

    }

    static int richestCustomer(int[][] arr){
       int ans=sum(arr[0]);
       for(int row=1;row<arr.length;row++){
           int sumCost=sum(arr[row]);
           if(ans<sumCost){
               ans=sumCost;
           }
       }
       return ans;
    }
    static int sum(int[] money){
        if(money.length==0){
            return 0;
        }
        int sum=money[0];
        for(int i=1;i<money.length;i++){
            sum+=money[i];
        }
        return sum;
    }
}
