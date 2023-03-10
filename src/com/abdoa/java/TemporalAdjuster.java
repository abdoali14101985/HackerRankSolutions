package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

class TemporalAdjusterSolution 
{
public static String friendShipDay(int inputYear) {
        //Write your code here
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date = LocalDate.of(inputYear, Month.AUGUST, 1);
	LocalDate friendshipDay = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
	//System.out.println(friendshipDay);
	return friendshipDay.format(dtf);
    }
}
public class TemporalAdjuster 
{
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inputYear = Integer.parseInt(br.readLine().trim());
    br.close();
    String result = TemporalAdjusterSolution.friendShipDay(inputYear);
    System.out.println("In the year " + inputYear + ", Friendship Day falls on " + result);
   }
}
