/*
Ceiling of a number
arr=[2,3,]
 */

package first_tutorial;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 9, 14, 18};
        int target = 17;
        System.out.println(findCeilingNumber(arr, target)+"and"+findFloorNumber(arr,target));
    }

    // Check for mid
    // Updated enhanced code
    // USe binary Search code and make changes
    static int findCeilingNumber(int[] arr, int target) {
        if(target>arr[arr.length-1])
            return -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                    low = mid + 1;
            } else if (arr[mid] == target) {
                return arr[mid];
            } else {
                high = mid - 1;
            }
        }

        return arr[high]; // why? it returns index of the smalles greatest number than target
    }

    static int findFloorNumber(int[] arr, int target) {
        int floor = -1, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else if (arr[mid] == target) {
                floor = arr[mid];
                break;
            } else {
                if(mid!=0) {
                    floor = arr[mid];
                    high = mid - 1;
                }else{
                    floor=-1;
                    break;
                }
            }
        }
        return floor;
    }
}
