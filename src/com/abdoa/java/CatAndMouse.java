package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatAndMouse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = bufferedReader.readLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);

            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        bufferedReader.close();
    }

    private static String catAndMouse(int x, int y, int z) {
        int steps = 0;
        while(true){
            if( z > x && z > y){
                steps++;
                x++; y++;
            }
            if(z < x && z < y){
                steps++;
                x--; y--;
            }
            if(z < x && z > y){
                steps++;
                x--; y++;
            }
            if(z > x && z < y){
                steps++;
                x++; y--;
            }
            if(z== x && z!= y){
                return "Cat A";
            }
            if(z ==  y && z!= x) {
                return "Cat B";
            }
            if(z ==  y && z== x) {
                return "Mouse C";
            }
        }
    }


}
