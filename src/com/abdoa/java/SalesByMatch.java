package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SalesByMatch {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = sockMerchant(n, ar);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int sockMerchant(int n, List<Integer> ar) {
        int result = 0;
        Map<Integer, Integer> sockCount = new HashMap<>();
        for (Integer sock : ar ) {
            if(sockCount.containsKey(sock)){
                sockCount.put(sock, sockCount.get(sock)+1);
            } else {
                sockCount.put(sock, 1);
            }
        }
        Set<Integer> keySet = sockCount.keySet();
        for (Integer key : keySet ) {
            result += sockCount.get(key)/2;
        }
        System.out.println(result);
        return result;
    }
}
