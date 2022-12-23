package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class SummationOfPrimes {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        Map<Long, Long> sumOfPrimes = new HashMap<>();
        long sum =0;
        for(long i =1; i<=1000000; i++){
            if(isPrime(i)){
                sum+=i;
            }
            sumOfPrimes.put(i,sum);
        }

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(sumOfPrimes.get((long)n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static boolean isPrime(long n) {
        if(n==1) {
            return false;
        }else if(n==2) {
            return true;
        }else if(n>2 && n%2==0) {
            return false;
        }else {
            long sqrt=(long) Math.sqrt((double)n);
            boolean flag=true;
            for(long i=3;i<=sqrt;i++) {
                if(n%i==0) {
                    flag=false;
                    break;
                }
            }
            return flag;
        }
    }
}
