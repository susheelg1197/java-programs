package first_tutorial;

public class PermutationWithSpaces {
    public static void main(String[] args) {
        permutationWithSpaces("abc","");
    }
    public static void permutationWithSpaces(String ip, String op){
        // Base Condition
        if(ip.length()==1){
            op+=ip;
            System.out.println(op);
            return;
        }
        // Hypothesis
        String op1=op+ip.charAt(0);
        String op2=op+ip.charAt(0)+"_";
        ip=ip.substring(1,ip.length());

        //Induction
        permutationWithSpaces(ip,op1);
        permutationWithSpaces(ip,op2);

    }
}
