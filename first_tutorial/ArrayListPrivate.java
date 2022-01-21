/*
ArrayList is a class
Collection framework
Why use ArrayList?
ArrayList size is fixed but when array list fills by some amount it creates a new list
double the size, old elements are copied on the new list and old list is deleted
 */
package first_tutorial;
import java.util.ArrayList;
public class ArrayListPrivate {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list=new ArrayList<>();// <datatype> optional + you can specify the capacity
        // generics is what is the type of data u will store
        // cant pass primitive need wrapper classes
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        //add as many over than capacity
        list.set(0,99);
        list.remove(2);
        System.out.println(list);//this in itself calls to string

        for(int i=0;i< list.size();i++) {
            System.out.println(list.get(i));
        }

    }
}
