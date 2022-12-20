/*
 * PROBLEM STATEMENT Points: 30
Given an array of N elements, check if it is possible to obtain a sum of S, 
by choosing some (or none) elements of the array and adding them.

Input:
First line of the input contains number of test cases T. Each test case has three lines.
First line has N, the number of elements in array.
Second line contains N space separated integers denoting the elements of the 
array.
Third line contains a single integer denoting S.

Output:
For each test case, print "YES" if S can be obtained by choosing some(or none)
 elements of the array and adding them. Otherwise Print "NO".

Note that 0 can always be obtained by choosing none.

Constraints
1 ≤ T ≤10
1 ≤ N ≤ 15
-10^6 ≤ A[i] ≤ 10^6 for 0 ≤ i < N
 */
import java.util.Scanner;

public class TestSol1 {
	
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int arrLen= s.nextInt();
			int[] arr = new int[arrLen];
			for(int j=0;j<arrLen;j++) {
				arr[j]=s.nextInt();
			}
			int possibleSum=s.nextInt();
			String flag="";
			for(int x=0;x<arrLen;x++) {
				int sum=arr[x];
				for(int y=x+1;y<arrLen;y++) {
					sum+=arr[y];
					if(sum==possibleSum || arr[x]+arr[y]==possibleSum) {
						flag="Yes";
					}else {
						flag="No";
					}
					if(flag.equalsIgnoreCase("Yes")) break;
				}
				if(flag.equalsIgnoreCase("Yes")) break;
			}
			System.out.println(flag);
		}

    }

}
