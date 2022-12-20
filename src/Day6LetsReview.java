import java.util.Scanner;

public class Day6LetsReview {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int T= scanner.nextInt();
		scanner.nextLine();
		for (int i=0;i<T;i++) {
			String S=scanner.nextLine();
			String oddIndex="",evenIndex="";
			for(int j=0;j<S.length();j++) {
				if(j%2!=0) oddIndex+=S.charAt(j);
				else evenIndex+=S.charAt(j);
			}
			System.out.println(evenIndex+" "+oddIndex);
		}
	}
}
