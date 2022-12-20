package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution 
{
public static String manipulation(String stringInputDate, int days, int months, int years) {
	
        //Write your code here
	String[] inputDateArray = stringInputDate.split("-");
	LocalDate date = LocalDate.of(Integer.parseInt(inputDateArray[2]), Integer.parseInt(inputDateArray[1]), Integer.parseInt(inputDateArray[0]));
	
	LocalDate datePlusDay=date.plusDays(days);
	LocalDate datePlusMonth = datePlusDay.plusMonths(months);
	LocalDate datePlusYears = datePlusMonth.plusYears(years);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	//System.out.println(date.format(dtf));
	return datePlusYears.format(dtf);
    }
}

public class DateManipulation {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stringInputDate = br.readLine();
		int days = Integer.parseInt(br.readLine().trim());
		int months = Integer.parseInt(br.readLine().trim());
		int years = Integer.parseInt(br.readLine().trim());
		br.close();
		String result = Solution.manipulation(stringInputDate, days, months, years);
		System.out.println(result);
	}
}
