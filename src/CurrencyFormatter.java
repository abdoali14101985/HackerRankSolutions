import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        NumberFormat nfUS = NumberFormat.getCurrencyInstance();
	        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat nfFrench = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
	        String us = nfUS.format(payment);
	        String china = nfChina.format(payment);
	        String france = nfFrench.format(payment);
	        String india = nfIndia.format(payment);

	        // Write your code here.
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }

}
