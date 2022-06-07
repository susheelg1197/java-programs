/*
Problem Statement:
text="ABCDEFGHIJKL"
pattern="DEFG"

Find where is that pattern
IDnetify niave problem then KMp (Knuth morris pratt)
Problem with naive is that it backtracks and rechecks the already matched pattern


Worst case of basic algo
text:: aaaaaaaaab
pattern:: aaab

worst Case BigO(m*n)

KMP
Terminology used
1) Prefix
2) Suffix

Why is it used ?
To check if any beginning pattern is present somewhere else too

longest prefix suffix
How table is created?
pi table
P1: abcdabcd
    00001234

O(m+n)
 */

package first_tutorial;

public class KMPPatternMatching {
    public static void main(String[] args) {
        String text="AAAB";
        String pattern="ZZ";
        int[] lps=new int[pattern.length()];
        //Step 1: Find out the LPS array
        computeLPS(lps,pattern);
        //Step 2: Find pattern
        System.out.println("Pattern at index: "+patternKMP(lps,pattern,text));
    }
    static int patternKMP(int[] lps, String pattern, String text){
        int i=0,j=0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)) {
                i++;
                j++;
            }else{
                if(j==0){
                    i++;
                }else {
                    j = lps[j - 1];
                }
            }
            if(j==pattern.length()){
                return i-j;
            }
        }

        return -1;
    }

    static void computeLPS(int[] lps,String pattern){
        int i=1,j=0;

        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            }else{
                if(j==0){
                    lps[i]=j;
                    i++;
                }else{
                    j=lps[j-1];
                }
            }
        }
    }
}
