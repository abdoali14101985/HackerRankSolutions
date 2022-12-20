package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class SmallestMultiple {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                printSmallestMultiple(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static void printSmallestMultiple(int n) {
        // create array of length n with values 1....n;
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = i+1;
        }
        System.out.println(lcmOfArray(array, 0));
    }

    private static long lcmOfArray(int[] array, int index) {
        if(index == array.length-1){
            return array[index];
        }
        long a = array[index];
        long b = lcmOfArray(array, index+1);
        return (a*b) / gcd(a,b);

    }

    private static long gcd(long a, long b) {
        return b==0? a : gcd(b, a%b);
    }

}
