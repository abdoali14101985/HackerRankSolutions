package com.abdoa.java;

import java.io.*;
import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class PrimeComposite_Factorial
{
    void primeOrComposite(int n)
    {
        //Enter your Code here
		/*
		 * IntPredicate isDivisible = index -> n % index == 0; boolean isPrime = n > 1
		 * && IntStream.rangeClosed(2, n/2) .noneMatch(isDivisible); if(n == 1) {
		 * System.out.println("Niether Prime Nor Composite"); }else {
		 * 
		 * if(isPrime) { System.out.println("Prime"); }else {
		 * System.out.println("Composite"); } }
		 */
    	if(n<=1)
            System.out.println("Neither Prime Nor Composite");          
        else{ 
            Predicate<Integer> lesser = (x) -> {
                boolean res = IntStream.rangeClosed(2,x/2).noneMatch(i-> x%i==0);
                return res;
            };
                if(lesser.test(n))
                {
                    Consumer<Integer> lesserthan = (x) -> {
                        System.out.println("Prime");
                    };
                lesserthan.accept(n);    
                }
                else{
                    System.out.println("Composite");
                }
        }
    	
    }

	void findFactorial(int n)
    {
        //Enter your Code here
		/*
		 * long factorial = LongStream.rangeClosed(1, n) .reduce(1, (a, b) -> a*b);
		 * System.out.println(factorial);
		 */
		Consumer<Integer> con = (a) -> {
            BigInteger n1 = BigInteger.valueOf(n);
            BigInteger sum = BigInteger.ONE;
            for(BigInteger i = BigInteger.ONE;i.compareTo(n1) <= 0;i=i.add(BigInteger.ONE))                  {
                    sum = sum.multiply(i);
                  }
            System.out.println(sum);
        };
        con.accept(n);
    }
}

public class PrimeComposite_FactorialMain
{
    public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
				
		 PrimeComposite_Factorial xyz=new PrimeComposite_Factorial();
		 
		 xyz.primeOrComposite(n);
		 xyz.findFactorial(n);
		
	}
}
