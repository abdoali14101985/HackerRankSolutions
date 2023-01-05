package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Encryption {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = encryption(s);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static String encryption(String s) {
        StringJoiner result = new StringJoiner(" ");
        String trimmedString = s.trim();
        int strLength = trimmedString.length();
        int row = (int) Math.sqrt(strLength);
        int column =0;
        if(row * row == strLength){
            column = row;
        }else {
            column = row + 1;
        }
        for(int i=0; i<column; i++){
            int index=i;
            StringBuilder str = new StringBuilder();
            while(index<= strLength-1){
                str.append(trimmedString.charAt(index));
                index+= column;
            }
            result.add(str);
        }
        return result.toString();
    }
}
