/*
https://leetcode.com/problems/first-bad-version/solution/
 */
package first_tutorial;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(4));
    }
    static int firstBadVersion(int n) {
        int low=1,high=n,mid;
        while(low<high){
            mid=low+(high-low)/2; // because when low+high is added there are chances that the sum would exceed the int range
            if(isBadVersion(mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    static boolean isBadVersion(int ele){ // returns true false
        return Math.random()%2==0;
    }
}

