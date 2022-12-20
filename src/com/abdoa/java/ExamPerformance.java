package com.abdoa.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//the function accepts five Integer arrays and return Integer ArrayList

class ExamPerformanceResult {

    public static ArrayList<Integer> performance(Integer[] tamil, Integer[] english, Integer[] maths, Integer[] science,
            Integer[] social) {
    	ArrayList<Integer> performanceList= new ArrayList<Integer>();
    	List<Integer> tamilMarks= Arrays.asList(tamil);
    	List<Integer> englishMarks= Arrays.asList(english);
    	List<Integer> mathsMarks= Arrays.asList(maths);
    	List<Integer> scienceMarks=  Arrays.asList(science);
    	List<Integer> socialMarks=  Arrays.asList(social);
    	performanceList.add((int)tamilMarks.stream().mapToInt(n->n.intValue()).average().getAsDouble());
    	performanceList.add((int)englishMarks.stream().mapToInt(n->n.intValue()).average().getAsDouble());
    	performanceList.add((int)mathsMarks.stream().mapToInt(n->n.intValue()).average().getAsDouble());
    	performanceList.add((int)scienceMarks.stream().mapToInt(n->n.intValue()).average().getAsDouble());
    	performanceList.add((int)socialMarks.stream().mapToInt(n->n.intValue()).average().getAsDouble());
    	performanceList.add(tamilMarks.stream().mapToInt(n -> n).max().getAsInt());
    	performanceList.add(englishMarks.stream().mapToInt(n -> n).max().getAsInt());
    	performanceList.add(mathsMarks.stream().mapToInt(n -> n).max().getAsInt());
    	performanceList.add(scienceMarks.stream().mapToInt(n -> n).max().getAsInt());
    	performanceList.add(socialMarks.stream().mapToInt(n -> n).max().getAsInt());
    	performanceList.add(tamilMarks.stream().mapToInt(n -> n).min().getAsInt());
    	performanceList.add(englishMarks.stream().mapToInt(n -> n).min().getAsInt());
    	performanceList.add(mathsMarks.stream().mapToInt(n -> n).min().getAsInt());
    	performanceList.add(scienceMarks.stream().mapToInt(n -> n).min().getAsInt());
    	performanceList.add(socialMarks.stream().mapToInt(n -> n).min().getAsInt());
    	performanceList.add((int)tamilMarks.stream().filter(n-> n < 35).count());
    	performanceList.add((int)englishMarks.stream().filter(n-> n < 35).count());
    	performanceList.add((int)mathsMarks.stream().filter(n-> n < 35).count());
    	performanceList.add((int)scienceMarks.stream().filter(n-> n < 35).count());
    	performanceList.add((int)socialMarks.stream().filter(n-> n < 35).count());
    	return performanceList;
    }
}

public class ExamPerformance {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(b.readLine().trim());
		Integer[] tamil = new Integer[n];
		for (int i = 0; i < n; i++) {
			tamil[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] english = new Integer[n];
		for (int i = 0; i < n; i++) {
			english[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] maths = new Integer[n];
		for (int i = 0; i < n; i++) {
			maths[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] science = new Integer[n];
		for (int i = 0; i < n; i++) {
			science[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] social = new Integer[n];
		for (int i = 0; i < n; i++) {
			social[i] = Integer.parseInt(b.readLine().trim());
		}
		b.close();

		ArrayList<Integer> solution = ExamPerformanceResult.performance(tamil, english, maths, science, social);
		for (int i = 0; i < solution.size(); i++) {
			System.out.println(solution.get(i));
		}

	}

}
