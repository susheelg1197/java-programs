/*
https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
 */
package first_tutorial;
import java.util.Arrays;
public class Panagram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("abcdefghijklmnopqurstuvwxyz"));
    }
    static boolean checkIfPangram(String sentence){
        for(int i=0;i<26;i++){
            if(sentence.indexOf((char)i+97)<0){
                return false;
            }
        }
        return true;
    }
//    static boolean checkIfPangram(String sentence) {
//        int[] count = new int[26];
//        for(char c:sentence.toCharArray()){
//            count[(int)c-(int)'a']++;
//        }
//        for(int i=0;i<count.length;i++){
//            if(count[i]==0){
//                return false;
//            }
//        }
//        return true;
//    }
}
