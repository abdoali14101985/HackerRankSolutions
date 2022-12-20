import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        for (int i=A.length()-1;i>=0;i--) {
        	B=B+A.charAt(i);
        }
        System.out.print(A.equalsIgnoreCase(B) ? "Yes" : "No");
        /* Enter your code here. Print output to STDOUT. */
        
    }

}
