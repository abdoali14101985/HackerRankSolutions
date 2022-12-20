import java.util.Scanner;

public class CheckUsername {
	class UsernameValidator {
	    /*
	     * Write regular expression here.
	     */
	    public static final String regularExpression = "^(?=[a-zA-Z0-9_]{8,30}$)[^0-9_].*$";
	    /*
	     * [a-zA-Z0-9_] = contains this characters.
	     * {8,20} = 8-20 characters long.
	     * [^0-9_].* = does not start with digit or '_'.
	     */
	}

private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }

}
