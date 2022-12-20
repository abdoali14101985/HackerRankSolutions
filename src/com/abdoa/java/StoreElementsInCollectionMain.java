package com.abdoa.java;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Consumer; 
import java.util.function.Supplier;

class StoreElementsInCollection
{
    static void storeElements(String input)
    {
        //Enter your Code here
    	List<String> sandwiches = new ArrayList<>();
    	Consumer<String> consumer = str -> {
    		String[] sandwichArray = input.split(",");
        	for(int i =0;i<sandwichArray.length;i++) {
        		if(sandwichArray[i].equals("corn sandwich") ||
        				sandwichArray[i].equals("cheese sandwich") ||
        				sandwichArray[i].equals("mix veg sandwich")) {
        			sandwiches.add(sandwichArray[i]);
        		}else {
        			 System.out.println("Incorrect Input");
                     return;
        		}
        	}
        	Supplier<List<String>> supplier = () -> sandwiches;
        	supplier.get().forEach(System.out::println);
        	
    	};
    	consumer.accept(input);
    	
        
    }
}

public class StoreElementsInCollectionMain
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
		String input=br.readLine();
		
		StoreElementsInCollection.storeElements(input);
    }
}

