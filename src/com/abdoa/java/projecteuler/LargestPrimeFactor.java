package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class LargestPrimeFactor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());
                getLargestPrimeFactor(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static void getLargestPrimeFactor(long n) {
        /*long divisor = 2;
        Set<Long> primeFactors = new TreeSet<>();
        while (n > 1) {
            if(n % divisor == 0 ){
                primeFactors.add(divisor);
                n/=divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(primeFactors.stream().mapToLong(l -> l).max().getAsLong());*/
        Set<Long> primeFactors = new TreeSet<>();
        while(n%2 ==0){
            primeFactors.add(2L);
            n/=2;
        }
        for(long i=3; i<=Math.sqrt(n); i=i+2){
            while(n%i == 0){
                primeFactors.add(i);
                n/=i;
            }
        }
        if(n > 2){
            primeFactors.add(n);
        }
        System.out.println(primeFactors.stream().mapToLong(l -> l).max().getAsLong());
    }
}
