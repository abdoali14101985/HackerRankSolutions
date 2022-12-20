package com.abdoa.java.projecteuler;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class LargestPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                largestPalindrome(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static long largestPalindrome( int limit){
        long largestPalindrome = 0;
        long result =0;
        for(int i = 999; i>99; i--){
            for( int j = 999; j> 99; j--){
                result = i * j;
                if(isPalindrome(result) && result < limit){
                    largestPalindrome = Math.max(largestPalindrome, result);
                }
            }
        }
        System.out.println(largestPalindrome);
        return largestPalindrome;

    }

    private static boolean isPalindrome(long number) {
        return reverse(number) == number;
    }

    private static long reverse(long number) {
        long lastDigit;
        long reversedNumber =0;
        while(number>0){
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number/=10;
        }
        return reversedNumber;
    }

}
