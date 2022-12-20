package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DrawingBook {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static int pageCount(int n, int p) {
        int result = 0;
        if(n%2!= 0 && (p == 1 || p == n || p== n-1)){
            return result;
        }else if (p < (n/2)) {
            for(int i=2; i<=(n/2)+1; i= i+2){
                result++;
                if(p == i || p == i+1){
                    break;
                }
            }
        }else {
            for (int i= n-2;i > (n/2) ; i=i-2){
                result++;
                if(p == i || p == i-1){
                    break;
                }
            }
        }
        return result;
    }

}
