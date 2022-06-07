package first_tutorial;

public class LeastLargestSum {
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{10,20,40,5,6},2));
    }
    public static int splitArray(int[] nums, int m) {
        int high=sum(nums);
        if(m==1)
            return high;
        int low= max(nums);
        if(m==nums.length)
            return low;

        //Perform binary search
        return binarySearch(low,high,nums,m);

    }
    public static int binarySearch(int low, int high, int[] nums,int m){
        while(low!=high){
            int mid=low+(high-low)/2;
            int sum=0, chunks=1;

            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>mid){
                    chunks++;
                    sum=nums[i];
                }

            }
            if(chunks<=m)
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
    public static int max(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=nums[i]>max?nums[i]:max;
        return max;

    }
    public static int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        return sum;
    }
}
