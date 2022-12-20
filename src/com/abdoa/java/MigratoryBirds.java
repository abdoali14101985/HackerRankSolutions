package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int migratoryBirds(List<Integer> arr) {
        int result =0;
        arr.sort(Comparator.naturalOrder());
        Map<Integer,Integer> birdsCount = new LinkedHashMap<>();
        for (Integer bird : arr ) {
            if(birdsCount.containsKey(bird)){
                birdsCount.put(bird, birdsCount.get(bird)+1);
            } else {
                birdsCount.put(bird, 1);
            }
        }
        OptionalInt maxCount = birdsCount.values().stream().mapToInt(i -> i).max();
        Set<Integer> keySet = birdsCount.keySet();
        for (Integer key : keySet ) {
            if(birdsCount.get(key).equals(maxCount.getAsInt())){
                result = key;
                break;
            }

        }
        return result;
    }
}
