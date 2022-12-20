import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String delimiters = " |!|\\,|\\?|\\.|_|\\'|@";
        StringTokenizer st= new StringTokenizer(s,delimiters);
        System.out.println(st.countTokens());
        while (st.hasMoreElements()) {
        	System.out.println(st.nextElement());
        }
		/*
		 * String[] splitArray = s.split("\\s|!|\\,|\\?|\\.|_|\\'|@");
		 * System.out.println(splitArray.length); Arrays.asList(splitArray) .forEach(str
		 * -> System.out.println(str));
		 */

        scan.close();
    }

}
