package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class SumOfSquares {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                printSumOfSquaresDifference(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static void printSumOfSquaresDifference(int limit) {
        long sumOfValues = (limit * (limit+1))/2;
        long squareOfSum = sumOfValues * sumOfValues;
        long sumOfSquares = 0;
        for (int i=1; i<=limit; i++){
            sumOfSquares+= (i*i);
        }
        System.out.println(squareOfSum - sumOfSquares);
    }
}
