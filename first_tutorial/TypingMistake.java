package first_tutorial;
import java.util.*;
import java.util.Arrays;
import java.io.*;
public class TypingMistake {
        public static void main(String[] args) {
            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
            for (int i = 1; i <= t; ++i) {
                String I = in.next();
                String P = in.next();
                System.out.println("Case #"+i+": "+findTypingMistake(I,P));
            }
        }
        public static String findTypingMistake(String I, String P){

            Map<Character,Integer> mapI=new HashMap<>();
            for(Character c : I.toCharArray()){
                Integer val=mapI.containsKey(c)?mapI.get(c):0;
                mapI.put(c,++val);
            }
            for(Character c: P.toCharArray()){
                if(mapI.containsKey(c)) {
                    Integer val = mapI.get(c);
                    mapI.put(c, --val);
                }
            }
            for(Character key: mapI.keySet()){
                if(mapI.get(key)>0)
                    return "IMPOSSIBLE";
            }

            return String.valueOf(P.length()-I.length());
        }
        public static boolean binarySearch(char[] p, char key){
            int low=0,high=p.length-1;

            while(low<=high){
                int mid=low+(high-low)/2;
                if(p[mid]==key)
                    return true;
                else if(p[mid]<key)
                    low=mid+1;
                else
                    high=mid-1;
            }
            return false;
        }
}
