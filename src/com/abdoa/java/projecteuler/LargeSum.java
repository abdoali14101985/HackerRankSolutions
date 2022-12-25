package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LargeSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> numberList = new ArrayList<>();
        IntStream.range(0, t).forEach(tItr -> {
            try {
                numberList.add(bufferedReader.readLine().trim());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        print10DigitsOfSum(numberList);
        bufferedReader.close();
    }

    private static void print10DigitsOfSum(List<String> numberList) {
        BigInteger sum = BigInteger.ZERO;
        for (String numberString : numberList) {
            BigInteger number = new BigInteger(numberString);
            sum = sum.add(number);
        }
        System.out.println(sum.toString().substring(0,10));
    }
}
