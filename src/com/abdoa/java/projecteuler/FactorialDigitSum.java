package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class FactorialDigitSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = factorialDigitSum(n);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static int factorialDigitSum(int n) {
        BigInteger factorial = BigInteger.ONE;
        for(int i =2; i<=n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        BigInteger digitSum = BigInteger.ZERO;
        while(factorial.compareTo(BigInteger.ZERO)>0){
            digitSum = digitSum.add(factorial.remainder(BigInteger.TEN));
            factorial = factorial.divide(BigInteger.TEN);
        }
        return digitSum.intValue();
    }
}
