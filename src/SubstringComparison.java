import java.util.Scanner;

public class SubstringComparison {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0;i<s.length()-(k-1);i++) {
        	if(i==0) smallest=s.substring(i,i+k);
        	smallest = s.substring(i,i+k).compareTo(smallest)<0 ? s.substring(i,i+k) : smallest;
        	largest = s.substring(i,i+k).compareTo(largest) > 0 ? s.substring(i,i+k) : largest;
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
