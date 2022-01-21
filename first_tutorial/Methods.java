package first_tutorial;

public class Methods {
    public static void main(String[] args) {
        System.out.println(sum(10,20));// non static methods cant be invoked by static
    }
    static int sum(int num1, int num2){
        return num1+num2;
    }

}

