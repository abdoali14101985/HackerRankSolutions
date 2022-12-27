package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViralAdvertising {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = viralAdvertising(n);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int viralAdvertising(int n) {
        int result =0;
        int peopleShared=5;
        int peopleLiked = 0;
        for(int i=0; i<n; i++){
            peopleLiked = peopleShared/2;
            result+= peopleLiked;
            peopleShared = peopleLiked * 3;

        }
        System.out.println(result);
        return result;
    }
}
