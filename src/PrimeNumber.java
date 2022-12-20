import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		for(int i=0;i<tc;i++) {
			long n=sc.nextInt();
			primeOrNot(n);
		
		}
    }

	public static void primeOrNot(long n) {
		if(n==1) {
			System.out.println("Not prime");
		}else if(n==2) {
			System.out.println("Prime");
		}else if(n>2 && n%2==0) {
			System.out.println("Not prime");
		}else {
			long sqrt=(long) Math.sqrt((double)n);
			boolean flag=true;
			for(long i=3;i<=sqrt;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		}
	}

}
