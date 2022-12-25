package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class PythagoreanTriplet {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                long maxProduct = -1;
                long product;
                int a,b ,c;
                for( a = 1; a < n/3; a++){
                    b = ((n*n) - (2*n*a))/ ((2*n) - (2*a));
                    c = n-a-b;
                    if((a*a)+(b*b) == (c*c)){
                        product = a*b*c;
                        maxProduct= Math.max(maxProduct, product);
                    }

                }
                System.out.println(maxProduct);


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }


}
