package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class FindDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = findDigits(n);
                System.out.println(result);

                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int findDigits(int n) {
        int count = 0;
        String numStr = String.valueOf(n);
        for(int i=0; i< numStr.length(); i++){
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            if(digit != 0 && n % digit== 0){
                count++;
            }
        }
        return count;
    }
}
