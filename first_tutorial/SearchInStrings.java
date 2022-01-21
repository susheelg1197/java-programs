package first_tutorial;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        String s="Susheel";
        char c='s';
        System.out.println(linearSearch(s,c));

    }
    static int linearSearch(String str, char key){
        for(char c:str.toCharArray()){
            if(c==key){
                return str.indexOf(c);
            }
        }
        return -1;
    }
}
