package com.abdoa.java;

import java.io.*;
import java.util.*;

class Candidates
{
    //Create the Constructor here
	public String name;
	public String locality;
	public int age;
	public Candidates(String name, String locality, int age) {
		super();
		this.name = name;
		this.locality = locality;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class Interview_Candidates
{
    boolean areNatives(ArrayList<Candidates> candidatesList)
    {
        //Enter your Code here
    	boolean flag = true;
    	long nonNativeCount = candidatesList.stream()
    									   .filter(c -> !c.getLocality().equals("Native"))
    									   .count();
    	if(nonNativeCount > 0) {
    		flag = false;
    	}
    			
        return flag;
    }
    
	
	  Candidates youngestCandidate(ArrayList<Candidates> candidatesList) { 
		  //Enter your Code here
		  Candidates c = candidatesList.stream()
				  					  .min(Comparator.comparing(Candidates::getAge))
				  					  .get();
		  return c;
	  
	  }
	 
}

public class Interview_CandidatesMain
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Candidates> candidatesList=new ArrayList<>();
				
		 int n=Integer.parseInt(br.readLine().trim());
		 
		 for(int i=0;i<n;i++)
		 {
			 String inp=br.readLine();
	         String inparr[]=inp.split("-");
	         
	         Candidates cnd=new Candidates( inparr[0], inparr[1], Integer.parseInt(inparr[2]) );
	         candidatesList.add(cnd);         
		 }
		 
		 
		 Interview_Candidates ic=new Interview_Candidates();
		 
		 boolean ans= ic.areNatives(candidatesList);
		 if(ans)
			  	System.out.println("All candidates are Natives");
		 else
				System.out.println("All candidates are not Natives");
		 
		 
		  Candidates youngest=ic.youngestCandidate(candidatesList);
        
		  System.out.println("Details of the Candidate with youngest age : Name = "+youngest.name+", Locality = "+youngest.locality+", Age = "+youngest.age);
    }
}

