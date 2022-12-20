import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/*Given five positive integers, find the minimum and maximum values that can be c
alculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two 
space-separated long integers.

For example, . Our minimum sum is  and our maximum sum is . We would print

16 24*/
public class MinMaxSum {

	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long minSum=0,maxSum=0;
    	for(int i=0;i<arr.length;i++) {
    		long sum=0;
    		for(int j=0;j<arr.length;j++) {
    			if(i!=j) sum+=arr[j];
    		}
    			if(i==0) minSum=sum;
    			minSum= sum<minSum ? sum : minSum;
    			maxSum= sum>maxSum ? sum : maxSum;
    	}
    	System.out.print(minSum+" "+maxSum);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        List<Integer> intList =Arrays.stream(arr)
        		.boxed()
        		.sorted()
        		.collect(Collectors.toList());
        System.out.println(intList);
        

        miniMaxSum(arr);

        scanner.close();
    }

}
