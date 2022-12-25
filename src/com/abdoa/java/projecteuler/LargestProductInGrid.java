package com.abdoa.java.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LargestProductInGrid {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> grid = new ArrayList<>();

        IntStream.range(0, 20).forEach(i -> {
            try {
                grid.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        printLargestProduct(grid, 4);


        bufferedReader.close();
    }

    private static void printLargestProduct(List<List<Integer>> grid, int numberOfElements) {
        long largestProduct = Long.MIN_VALUE;
        long product = 1;
        for(int i=0; i< grid.size(); i++){
            for(int j=0; j< grid.size(); j++){
                //getting product of numbers in up direction
                if(i>numberOfElements-2){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i-k).get(j);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in down direction
                if(i<= grid.size()-numberOfElements){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i+k).get(j);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in right direction
                if(j <= grid.size()-numberOfElements){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i).get(j+k);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in left direction
                if(j > numberOfElements-2){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i).get(j-k);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in diagonal right down direction
                if(i <= grid.size()-numberOfElements && j<= grid.size() -numberOfElements){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i+k).get(j+k);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in diagonal right up direction
                if(i >= numberOfElements-1 && j<= grid.size() -numberOfElements){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i-k).get(j+k);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in diagonal left up direction
                if(i >= numberOfElements-1 && j>= grid.size() -numberOfElements){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i-k).get(j-k);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
                //getting product of numbers in diagonal left down direction
                if(i <= grid.size()-numberOfElements && j>= numberOfElements-1){
                    product=1;
                    for(int k=0;k<numberOfElements;k++){
                        product *= grid.get(i+k).get(j-k);
                    }
                    largestProduct= Math.max(largestProduct,product);
                }
            }
        }
        System.out.println(largestProduct);
    }
}
