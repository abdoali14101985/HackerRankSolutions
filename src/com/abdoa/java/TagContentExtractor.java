package com.abdoa.java;

/*
<h1><h2>This is the Text</h2></h1>
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            List<String> startTagList = getTagList(line,"<([^\\s>/]+)");
            List<String> endTagList = getTagList(line,"</([^\\s>/]+)");
            startTagList.forEach(System.out::println);
            System.out.println("------------------");
            endTagList.forEach(System.out::println);
            //Write your code here
            testCases--;
        }
    }

    private static List<String> getTagList(String line,String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(line);
        List<String> tagList = new ArrayList<>();
        while(matcher.find()){
            tagList.add(matcher.group(1));

        }
        return tagList;
    }
}
