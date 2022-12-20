package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class EvenFibonocciNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());
                printSumOfEvenFibonocciTerms(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static void printSumOfEvenFibonocciTerms(long n) {
        long previousTerm = 1;
        long currentTerm = 2;
        long nextTerm;
        long sumOfEvenTerms = 2;
        while(previousTerm+currentTerm < n){
            nextTerm = currentTerm + previousTerm;
            if(nextTerm % 2 == 0){
                sumOfEvenTerms+= nextTerm;
            }
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
        System.out.println(sumOfEvenTerms);
    }
}
