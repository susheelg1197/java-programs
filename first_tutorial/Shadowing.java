/*
Shadowing in java is using the same variable
 */

package first_tutorial;

public class Shadowing {
    static int x=90;   // object dependant things on object independent things cant be used
    // this will be shadowed, higher level is overlapped
    public static void main(String[] args) {
       int x=10; // the class variable is shadowed, scope will begin only when its initialized
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }

}
