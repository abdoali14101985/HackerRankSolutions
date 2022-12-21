package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MagicSquare {



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = formingMagicSquare(s);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int formingMagicSquare(List<List<Integer>> s) {
        String[] possibleMagicSquares = {"618753294", "276951438", "294753618", "672159834",
                "816357492", "438951276", "492357816", "834159672"};
        int result = Integer.MAX_VALUE;
        StringBuilder squareStr = new StringBuilder(9);
        for(int i=0; i<s.size(); i++){
            for(Integer value : s.get(i)){
                squareStr.append(value);
            }
        }
        //System.out.println(squareStr);
        for(String magicSquare : possibleMagicSquares){
            int diff =0;
            for(int i=0; i<magicSquare.length(); i++){
                diff+= Math.abs(magicSquare.charAt(i)-squareStr.charAt(i));
            }
            result = Math.min(diff,result);
        }
        //System.out.println(result);
        return result;
    }

    /*private static int formingMagicSquare_alt(List<List<Integer>> s) {
        int cost = 0;
        List<Integer> possibleCorners = Arrays.asList(2,4,6,8);
        List<Integer> possibleEdges = Arrays.asList(1,3,7,9);
        List<Integer> squareCorners =  new ArrayList<>();
        List<Integer> squareEdges =  new ArrayList<>();
        int squareCenter=0;
        // populating corners, edges and center of square values
        for(int i=0; i<s.size(); i++){
            for(int j=0; j< s.get(i).size(); j++){
                if(i==1 && j==1){
                    squareCenter = s.get(i).get(j);
                }else if(i+j==0 || i+j==2 || i+j==4){
                    squareCorners.add(s.get(i).get(j));
                }else {
                    squareEdges.add(s.get(i).get(j));
                }
            }
        }
        System.out.println(squareCorners);
        System.out.println(squareEdges);
        //Checking for center cost
        if(squareCenter != 5){
            cost+= Math.abs(squareCenter-5);
        }
        // checking for corners
        for(Integer corner : possibleCorners){
            int minCost = Integer.MAX_VALUE;
            if(!squareCorners.contains(corner)){
                for(Integer sqrCorner : squareCorners){
                    minCost = Math.min(minCost, Math.abs(sqrCorner-corner));
                }
            }
            if(minCost < Integer.MAX_VALUE){
                cost+= minCost;
            }

        }
        // checking for edges
        for(Integer edge : possibleEdges){
            int minCost = Integer.MAX_VALUE;
            if(!squareEdges.contains(edge)){
                for(Integer sqrEdge : squareEdges){
                    minCost = Math.min(minCost, Math.abs(sqrEdge-edge));
                }
            }
            if(minCost < Integer.MAX_VALUE){
                cost+= minCost;
            }
        }
        System.out.println(cost);
        return cost;
    }*/
}
