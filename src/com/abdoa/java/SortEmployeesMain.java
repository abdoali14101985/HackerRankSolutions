package com.abdoa.java;

import java.io.*;
import java.util.*;

class Employee
{
    //Create the Constructor here
	private String name;
	private int id;
	private int age;

	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
   
}

class SortEmployees 
{
    void sortEmployees(ArrayList<Employee> empList) 
    {

        //Enter your Code here
    	Comparator<Employee> compareByName = (e1, e2) ->
    											e1.getName().compareTo(e2.getName());
    											
    	Collections.sort(empList, compareByName);
        
    }
}

public class SortEmployeesMain
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> empList=new ArrayList<>();
		
		 int n=Integer.parseInt(br.readLine().trim());
		 for(int i=0;i<n;i++)
		 {
			 String inp=br.readLine();
	         String inparr[]=inp.split(" ");
			 
			 Employee ws=new Employee(inparr[0],Integer.parseInt(inparr[1]), Integer.parseInt(inparr[2]));
			 empList.add(ws);
		 }
		
		SortEmployees s1=new SortEmployees();
		s1.sortEmployees(empList);
		empList.forEach(e -> System.out.println(e.getName()));
    }
}
