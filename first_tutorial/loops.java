package first_tutorial;

public class loops {
    public static void main(String args[]) {
        int a = 10;
        if (a == 10) {
            System.out.println("yes");
        } else if (a == 5) {
            System.out.println("no");
        } else {
            System.out.println("Maybe");
        }
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
