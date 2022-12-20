package com.abdoa.java;

import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class ResultBetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());
        int result=0;
        //Set<Integer> factorsOfA = new HashSet<>();
        for(int i=a.get(a.size()-1); i<=b.get(0); i++){
            boolean flag=true;
            for (Integer value : a) {
                if(i % value != 0){
                    flag = false;
                    break;
                }
            }
            for (Integer value : b) {
                if( value % i != 0){
                    flag = false;
                    break;
                }

            }

            if(flag)
                result++;
        }
        /*Set<Integer> factorsOfB = new HashSet<>();
        for (Integer num: factorsOfA) {
            boolean flag = false;
            for (Integer value : b) {
                if(value%num != 0){
                    flag = false;
                    break;
                }
                flag = true;
            }
            if(flag){
                factorsOfB.add(num);
            }

        }*/
        return result;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = ResultBetweenTwoSets.getTotalX(arr, brr);
        System.out.println(total);

        //bufferedWriter.write(String.valueOf(total));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}