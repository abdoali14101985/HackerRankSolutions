package com.abdoa.java;

import java.io.IOException;
import java.util.Scanner;

public class CloudHopping {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        /*for (int i = 0; i<c.length; i++){
            System.out.println(c[i]);

        }*/

        int result = jumpingOnClouds(c, k);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

    private static int jumpingOnClouds(int[] c, int k) {
        int result = 100;
        int n = c.length;
        int i =0;
        do{
            if(c[(i+k)%n] == 1){
                result-=3;
            }else {
                result--;
            }
            i = (i+k)%n;
        }while(i!=0);
        return result;
    }
}
