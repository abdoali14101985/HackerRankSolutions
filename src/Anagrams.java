import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
        if(a.length()!=b.length()) return false;
            int[] A= new int[26];
            int[] B= new int[26];
            for(int i=0;i<a.length();i++) {
            	A[a.charAt(i)- 'a']++;
            	B[b.charAt(i)-'a']++;
            }
            for(int j=0;j<26;j++) {
            	if(A[j]!=B[j]) return false;
            }
        return true;
    }
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
