package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulDays {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = beautifulDays(i, j, k);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int beautifulDays(int i, int j, int k) {
        int result=0;
        for(int n = i; n<= j; n++){
            StringBuilder stringNumber = new StringBuilder(String.valueOf(n));
            String reverseNumber = stringNumber.reverse().toString();
            int diffrence = Math.abs(n - Integer.parseInt(reverseNumber));
            if(diffrence%k == 0){
                result++;
            }
        }
        //System.out.println(result);
        return result;
    }
}
