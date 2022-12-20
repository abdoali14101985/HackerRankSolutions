import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeFormatConversion {

	/*
     * Complete the timeConversion function below.
     * 07:05:45PM
     */
    static String timeConversion(String s) {
    	
    	LocalTime t= LocalTime.parse(s,DateTimeFormatter.ofPattern("hh:mm:ssa"));
    	return t.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.print(result);

    }

}
