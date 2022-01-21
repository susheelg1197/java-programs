package first_tutorial;
/*
public : access specifier
Main Function: if java file is run then it looks for main function, entry point
main function is made public 
static : it doesnt depend on object, execute main function without creating an object
otherwise we require an object 
void : return type of main function
Command line arguments: command line arguments are passed to main function

javac -d <directory_name> <file_name>.java -> compile java file with location
package : package is a folder. it is used to group java files
*/

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}