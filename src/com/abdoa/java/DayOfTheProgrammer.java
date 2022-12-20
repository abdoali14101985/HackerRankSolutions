package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfTheProgrammer {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static String dayOfProgrammer(int year) {
        int noOfDaysOfFirstEightMonths = 0;
        int month = 9;
        int dayOfMonth = 1;
        LocalDate date= LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // for gregorian  calculation
        if(year > 1918){
            date = LocalDate. ofYearDay(year, 256);
        } else if (year < 1918) { // checking for julian calendar
            if(year % 4 ==0) { // checking for julian leap year
                noOfDaysOfFirstEightMonths = 31+29+31+30+31+30+31+31;
                dayOfMonth = 256 - noOfDaysOfFirstEightMonths;
                date = LocalDate.of(year, month, dayOfMonth);
            } else {
                noOfDaysOfFirstEightMonths = 31+28+31+30+31+30+31+31;
                dayOfMonth = 256 - noOfDaysOfFirstEightMonths;
                date = LocalDate.of(year, month, dayOfMonth);
            }
        } else { // for julian to Gregorian conversion year
            noOfDaysOfFirstEightMonths = 31+15+31+30+31+30+31+31;
            dayOfMonth = 256 - noOfDaysOfFirstEightMonths;
            date = LocalDate.of(year, month, dayOfMonth);
        }

        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        return formattedDate;
    }
}
