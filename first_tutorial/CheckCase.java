package first_tutorial;

import java.util.Scanner;

public class CheckCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Character: ");
        char c =sc.next().trim().charAt(0);
        if (c >='a' && c<='z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }
    }

}
