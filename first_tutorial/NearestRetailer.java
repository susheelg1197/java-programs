package first_tutorial;
import java.util.Arrays;
public class NearestRetailer {
        public static void main(String[] args) {
            int[][] retailers={{1,2},{2,3},{1,5}};
            int[][] requests={{1,1},{1,4}};

            System.out.println(Arrays.toString(solve(retailers,requests)));
        }
        static int[] solve(int[][] retailers,int[][] requests){
            int[] count=new int[requests.length];
            for(int i=0;i<requests.length;i++){
                for(int j=0;j<retailers.length;j++){
                    if(retailers[j][0]>=requests[i][0] && retailers[j][1]>=requests[i][1]){
                        count[i]++;
                    }
                }
            }

            return count;

        }

   }


