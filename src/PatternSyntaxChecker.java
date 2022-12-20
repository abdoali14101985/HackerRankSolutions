import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			/*Pattern pat= Pattern.compile(pattern);
			System.out.println(pat.toString());*/
          	//Write your code
			try {
				Pattern pat= Pattern.compile(pattern);
				if(pat!= null) System.out.println("Valid");
			}catch (Exception ex){
				System.out.println("Invalid");
			}
			testCases--;
		}
	}

}
