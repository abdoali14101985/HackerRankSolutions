/*
 * 
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5
 */
		

import java.util.Scanner;

public class HourGlassSum {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int maxSum=0,sum,count=0;
        for(int x=0;x<4;x++) {
        	for(int y=0;y<4;y++) {
        		sum=arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];
				/*
				 * count++; System.out.println(count);
				 * System.out.println(arr[x][y]+" "+arr[x][y+1]+" "+arr[x][y+2]);
				 * System.out.println(" "+arr[x+1][y+1]);
				 * System.out.println(arr[x+2][y]+" "+arr[x+2][y+1]+" "+arr[x+2][y+2]);
				 * System.out.println("####");
				 */
        		if(x==0 && y==0) maxSum=sum;
        		if(sum>0 && sum>maxSum) maxSum=sum;
        		
        	}
        }
        System.out.println(maxSum);

        scanner.close();
    }

}
