/*
Logic:
Used two HashMap

1) Map<String>Integer : That keeps a count of that word
2) Map<Character>Integer : That keeps count of that letter
For pattern used an array of int
in both maps added integer value for keys and checked with pattern array

Another solution
using two maps
1st Map<Character>String -> To map each character with that word
2nd Map<String>Boolean -> To map each string whether used or not

Simple logic here used is
check if the word is already used
if not then use it and set flag as true
else if its already used then return false

 */


package first_tutorial;
import java.util.*;
public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern2("abba","dog cat cat dog"));
    }

    static boolean wordPattern2(String pattern, String s){
        Map<Character,String> mpCharToWord= new HashMap<>();
        Map<String,Boolean> mpWordUsed=new HashMap<>();

        String[] arrString=s.split(" ");
        for(int i=0;i<arrString.length;i++){
                if(mpCharToWord.get(pattern.charAt(i))!=null && mpWordUsed.get(mpCharToWord.get(pattern.charAt(i)))!=null)
                    if(mpWordUsed.get(mpCharToWord.get(pattern.charAt(i))) && !mpCharToWord.get(pattern.charAt(i)).equals(arrString[i]))
                        return false;
               mpCharToWord.put(pattern.charAt(i),arrString[i]);
               mpWordUsed.put(arrString[i],true);
        }
        return true;
    }
   static boolean wordPattern(String pattern, String s) {
        String[] liststr=s.split(" ");
        if(pattern.length()!=liststr.length){
            return false;
        }

        Map<String,Integer> mapStr= new HashMap<>();
        int j=1;
        int[] arr=new int[liststr.length];
        mapStr.put(liststr[0],j);
        arr[0]=j;
        for(int i=1;i<liststr.length;i++){
            if(mapStr.get(liststr[i])==null){
                mapStr.put(liststr[i],j+1);
                arr[i]=j+1;
                j++;
            }else{
                arr[i]=mapStr.get(liststr[i]);
            }
        }
        Map<Character,Integer> mpc=new HashMap<>();
        j=1;
        mpc.put(pattern.charAt(0),1);
        for(int i=1;i<pattern.length();i++){
            System.out.println(arr[i]);
            if(mpc.get(pattern.charAt(i))!=null && mpc.get(pattern.charAt(i))!=arr[i])
                return false;
            if(mpc.get(pattern.charAt(i))==null){
                if(arr[i]!=j+1)
                    return false;
                mpc.put(pattern.charAt(i),j+1);
                j++;
            }
        }

        return true;
    }
}
