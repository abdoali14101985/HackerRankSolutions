package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class NthPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        //int index = 0;
        int[] primeNumberArray = new int[10000];
        int index = 0;
        for(int i=1; i<Integer.MAX_VALUE && index<10000; i++){
            if(isPrime(i)){
                primeNumberArray[index++] = i;
            }
        }

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(primeNumberArray[n-1]);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n > 2 && n % 2 == 0) {
            return false;
        } else {
            long sqrt = (long) Math.sqrt((double) n);
            boolean flag = true;
            for (long i = 3; i <= sqrt; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            } else {
                return false;
            }
        }
    }
}
