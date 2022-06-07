package first_tutorial;
/*
Print this pattern for any n
Patterns
1)
****
***
**
*
2)
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

3)
*
**
***
****
***
**
*

4)
      *
     * *
    * * *
   * * * *
    * * *
     * *
      *

1)Steps taken identify the number of lines = n so outer loop will be n
2)Step identify for one row what is column
3)What to fill in that row
 */
public class pattern3 {
    public static void main(String[] args) {
        int n=7;
        numberPattern(n);
        rightSideTriangle(n);
        trianglepattern(n);
    }
    static void trianglepattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

            }
        }
    }
    public static void rightSideTriangle(int n){
        for (int i=1;i<=n;i++){
            if(i<=(n+1)/2){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }}else{
                for(int j=i;j<=n;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }    }
    public static void numberPattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void reverseStarPattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
