import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*You are in charge of the cake for your niece's birthday and have decided the cake will 
have one candle for each year of her total age. When she blows out the candles, 
she’ll only be able to blow out the tallest ones. Your task is to find out how many 
candles she can successfully blow out.

For example, if your niece is turning  years old, and the cake will have  
candles of height , , , , she will be able to blow out  candles successfully, 
since the tallest candles are of height  and there are  such candles.*/

public class BirthdayCandkes {
	static int birthdayCakeCandles(int[] ar) {
		int count=0;
		List<Integer> candleList =Arrays.stream(ar)
        		.boxed()
        		.sorted()
        		.collect(Collectors.toList());
        int tallestCandle=candleList.get(candleList.size()-1);
        count= (int)candleList.stream()
    		   .filter(c -> c==tallestCandle)
    		   .count();
		return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }

}
