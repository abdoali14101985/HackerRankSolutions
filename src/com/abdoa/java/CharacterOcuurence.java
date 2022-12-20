package com.abdoa.java;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'getMaxOccuredChar' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING input as parameter.
     * 
     */

    public static char getMaxOccuredChar(String input) {
    	
    	String uniqueCharsString=input.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
    	char[] uniqueChar=uniqueCharsString.toCharArray();
    	char maxChar='1';
    	long maxCount=0;
    	for(int i=0;i<uniqueChar.length;i++) {
    		char tempChar=uniqueChar[i];
    		long tempCount=input.chars().filter(ch -> Character.toLowerCase(ch)==Character.toLowerCase(tempChar)).count();
    		if(tempCount > maxCount) {
    			maxChar=Character.toLowerCase(tempChar);
    			maxCount=tempCount;
    		}
    		
    	}
    	return maxChar;
    
    }

}

public class CharacterOcuurence {
    public static void main(String[] args) throws IOException {
        Scanner readInput = new Scanner(System.in);
        String inputString = readInput.nextLine();
        char result = Result.getMaxOccuredChar(inputString);
        System.out.println(result);
    }
}

