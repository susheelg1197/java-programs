package first_tutorial;
import java.util.*;
public class CellsWithOddMatrix {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices));
    }

   static int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        Map <Integer,Integer> row=new HashMap<>();
        Map <Integer,Integer> col=new HashMap<>();

        int oddCount=0,evenCount=n;
        for(int i=0;i<indices.length;i++){
                /*
                0->1  0->0
                1->1  1->2
                      2->0
                */
            if(row.get(indices[i][0])==null){
                row.put(indices[i][0],1);
                oddCount++;
            }else{
                row.put(indices[i][0],row.get(indices[i][0])+1);
                if(row.get(indices[i][0])%2==1)
                    oddCount++;
                else
                    oddCount=oddCount==0?0:oddCount-1;
            }
            if(col.get(indices[i][1])==null){
                col.put(indices[i][1],1);
                evenCount--;
            }else{
                col.put(indices[i][1],col.get(indices[i][1])+1);
                if(col.get(indices[i][1])%2==1)
                    evenCount--;
                else
                    evenCount=evenCount==n?n:evenCount+1;
            }

        }
        return oddCount*evenCount;

    }
}
