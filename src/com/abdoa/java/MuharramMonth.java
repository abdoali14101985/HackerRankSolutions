package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

class MuharramMonthStartEnd {
    public static String MuharramMonthStartDate(int inputYear) {
        //Write the code here
        LocalDate firstDayOfYear = LocalDate.of(inputYear, Month.JANUARY, 1);
        int nextHijriYear;
        HijrahDate hijriDate = HijrahDate.from(firstDayOfYear);
        if(hijriDate.get(ChronoField.DAY_OF_MONTH)>2 && hijriDate.get(ChronoField.MONTH_OF_YEAR) >= 1){
            nextHijriYear = hijriDate.get(ChronoField.YEAR)+1;

        }else {
            nextHijriYear = hijriDate.get(ChronoField.YEAR);
            System.out.println("Muharram 1st");
        }
        HijrahDate firstMuharram = HijrahDate.of(nextHijriYear, 1, 1);
        LocalDate gregorianFirstMuharram = LocalDate.from(firstMuharram);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(hijriDate);
        System.out.println(gregorianFirstMuharram.format(dtf));
        return gregorianFirstMuharram.format(dtf);
    }

    public static String MuharramMonthEndDate(int inputYear, String stringMuharramStart) {
        //Write the code here
        return "";
    }
}

public class MuharramMonth {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(br.readLine().trim());
        br.close();
        String result = MuharramMonthStartEnd.MuharramMonthStartDate(inputYear);
        System.out.println("Start Of Muharram Month : " + result);
        String result1 = MuharramMonthStartEnd.MuharramMonthEndDate(inputYear, result);
        System.out.println("End Of Muharram Month   : " + result1);
    }
}
