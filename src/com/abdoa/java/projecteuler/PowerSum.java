package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class PowerSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                printSumOfDigitsOfNthPowerOfTwo(n);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
    }

    private static void printSumOfDigitsOfNthPowerOfTwo(int n) {
        BigInteger number = BigInteger.TWO;
        BigInteger nthPower = number.pow(n);
        //System.out.println(nthPower);
        String nthPowerString = String.valueOf(nthPower);
        //System.out.println(nthPowerString);
        int sum=0;
        for(int i=0; i<nthPowerString.length(); i++){
            String digit = String.valueOf(nthPowerString.charAt(i));
            sum+= Integer.parseInt(digit);
        }
        System.out.println(sum);
    }
}
