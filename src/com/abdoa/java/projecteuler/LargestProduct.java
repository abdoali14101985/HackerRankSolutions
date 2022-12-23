package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LargestProduct {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                String num = bufferedReader.readLine();
                printLargestProductOfNDigits(num, k);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static void printLargestProductOfNDigits(String number, int n) {
        long maxProduct = Long.MIN_VALUE;
        for(int i =0; i<number.length()-n; i++){
            long productOfNDigits = 1;
            for(int j = i; j<i+n; j++ ){
                productOfNDigits = productOfNDigits * Long.parseLong(number.substring(j,j+1));
            }
            maxProduct = Math.max(maxProduct, productOfNDigits);
        }
        System.out.println(maxProduct);

    }

    private static List<BigInteger> getDigitList(BigInteger number) {
        List<BigInteger> result = new ArrayList<>();
        int index = 0;
        while(number.doubleValue()>0){
            result.add(index++, number.remainder(BigInteger.TEN));
            number = number.divide(BigInteger.TEN);
        }
        Collections.reverse(result);
        return result;
    }
}
