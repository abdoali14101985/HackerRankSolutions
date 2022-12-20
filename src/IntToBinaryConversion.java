import java.util.Scanner;

public class IntToBinaryConversion {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryString= Integer.toBinaryString(n);
        int countOfConsecutiveOnes=0,finalCount=0;
        for(int i=0;i<binaryString.length();i++) {
        	if (binaryString.charAt(i)=='1') {
        		countOfConsecutiveOnes++;
        		if (countOfConsecutiveOnes > finalCount) finalCount=countOfConsecutiveOnes;	
        	}
        	else countOfConsecutiveOnes=0;
        }
        System.out.println(finalCount);
        scanner.close();
    }

}
