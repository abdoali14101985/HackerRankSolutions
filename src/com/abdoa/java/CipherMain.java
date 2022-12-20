package com.abdoa.java;

import java.io.*;
import java.util.*;

interface AnonymousInterface
{
    void getCipher(ArrayList<String> list);
}

class Cipher_Anonymous
{
    void anonymousClass(ArrayList<String> list) 
    {
        //Enter your Code here
    	AnonymousInterface obj = new AnonymousInterface(){
            
            @Override
            public void getCipher(ArrayList<String> list) {
                // TODO Auto-generated method stub
                for(String x:list){
                    System.out.print(x);
                }
                
            }
        };
        obj.getCipher(list);
    }
}

class Cipher_MethodRef
{
    void methodReference(ArrayList<String> list)        
    {
        //Enter your Code here
    	AnonymousInterface obj = (list1) ->{
            list1.forEach(System.out::print);  
          };
          obj.getCipher(list);
    }
}

class Cipher_LambdaExp
{
    void lambdaExpression(ArrayList<String> list) 
    {
        //Enter your Code here
    	AnonymousInterface obj = lst -> {
    		for(int i=0;i<lst.size();i++) {
        		int ch = lst.get(i).charAt(0);
        		lst.set(i,ch+lst.get(i).substring(1));
        		if(lst.get(i).equals("32")) {
        			lst.set(i, "#$");
            	}
        		StringBuilder sb = new StringBuilder(lst.get(i));
        		lst.set(i, sb.reverse().toString());
        	}
    		lst.forEach(System.out::print);
    	};
    	obj.getCipher(list);
    	
    }
}

public class CipherMain
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list=new ArrayList<>();
		
		String input=br.readLine();
		String inputarr[]=input.split(" ");
		
		list.add(inputarr[0]);
		for(int i=0;i<inputarr.length-1;i++)
		 {
			list.add(" ");
			list.add(inputarr[i+1]);
		 }
		//list.forEach(System.out::println);
		
		Cipher_LambdaExp l1=new Cipher_LambdaExp();
		System.out.print("Lambda Expression : ");
		l1.lambdaExpression(list);
		
		Cipher_MethodRef m1=new Cipher_MethodRef();
		System.out.print("\nMethod Reference : ");
		m1.methodReference(list);
		
		Cipher_Anonymous a1=new Cipher_Anonymous();
		System.out.print("\nAnonymous Class : ");
		a1.anonymousClass(list);
    }
}

