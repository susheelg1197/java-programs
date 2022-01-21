/*

Input and output
 */

package first_tutorial;
import java.util.Scanner; // These are public thats why we can import
public class Input {
    public static void main(String args[]){
        // if out =file then print output on file
        System.out.println("Your name??"); // current out is null so print on cmdline
        // Scanner is a class that accepts input and using object we will take input
        Scanner sc = new Scanner(System.in);// system.in standard input stream keyboard, you can add file,etc
        // input object will contain all the functions of scanner class
        System.out.println(sc.next());

        int rn= sc.nextInt();
        System.out.println("Roll Number is: "+rn);

        int a=20_0_0; // _ is nothing but comma
        System.out.print(a);

        String name = sc.nextLine();//full line and next is just the word

        float marks =11; // it will round of and if int is given then type cast

    }
}
