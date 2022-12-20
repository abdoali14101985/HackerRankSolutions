package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PickingNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = pickingNumbers(a);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int pickingNumbers(List<Integer> a) {
        int result =0;
        a.sort(Comparator.naturalOrder());
        Map<Integer, Integer> occurenceCount = new TreeMap<Integer, Integer>();
        for (Integer i : a){
            if(occurenceCount.containsKey(i)){
                occurenceCount.put(i, occurenceCount.get(i)+1);
            }else {
                occurenceCount.put(i, 1);
            }
        }
        Set<Integer> keySet = occurenceCount.keySet();
        for (Integer key : keySet){
            Integer numberOfIntegers = occurenceCount.get(key);
            if(occurenceCount.containsKey(key+1)){
                numberOfIntegers+= occurenceCount.get(key+1);
            }
            result = Math.max(result, numberOfIntegers);
        }
        System.out.println(result);
        return result;
    }
}
