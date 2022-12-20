import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class kangaroo {

	// Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	String result="";
    	if(x1<x2 && v1<v2) {
    		result="No";
    	}else if(x1>x2 && v1>v2) {
    		result="No";
    	}else if(x1<x2 && v1>v2){
    		for(int i=1;i>0;i++) {
    			if(x1+(i*v1) == x2+(i*v2)) {
    				result="Yes";
    				break;
    			}else if (x1+(i*v1)>x2+(i*v2)) {
    				result="No";
    				break;
    			}
    		}
    	}else {
    		for(int i=1;i>0;i++) {
    			if(x1+(i*v1) == x2+(i*v2)) {
    				result="Yes";
    				break;
    			}else if (x1+(i*v1)<x2+(i*v2)) {
    				result="No";
    				break;
    			}
    		}
    	}
    	return result.toUpperCase();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

        

        scanner.close();
    }

}
