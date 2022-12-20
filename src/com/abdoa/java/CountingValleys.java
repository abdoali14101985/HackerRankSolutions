package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int countingValleys(int steps, String path) {
        int valleysCount =0;
        int positionFromSeaLevel = 0;
        for(int i =0; i< steps; i++){
            if(path.charAt(i)== 'U'){
                positionFromSeaLevel++;
            }else {
                positionFromSeaLevel--;
                if(positionFromSeaLevel == -1){
                    valleysCount++;
                }
            }
        }
        return valleysCount;
    }
}
