package com.Collections.List;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Selenium");
		map.put(2, "QTP");
		map.put(3, "UFT");
		map.put(4, "RTC");
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.get(5)); //gives null as no data is stored in key 5.
		
		//To print all values in hash map
		System.out.println("Iterating using Entry method...");
		System.out.println("Iterating and printing all vaues in map...");
		for(Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//To remove
		map.remove(5);
		System.out.println("Data after removing one object...");
		
		System.out.println(map);
		
		//Class object
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee("Peter", 25, "Rabit");
		Employee e2=new Employee("Ramsey", 35, "Bolten");
		Employee e3=new Employee("Tony", 45, "Stark");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//Traverse the hash map
		System.out.println("Printing values from hash table using entrySet(): ");
		for(Entry<Integer, Employee> e : emp.entrySet())
		{
			int key = e.getKey();
			Employee val = e.getValue();
			
			System.out.println("Employee " + key +" Info");
			System.out.println(val.empname +" "+val.age +" "+val.empdept);
		}

	}

}

//Extends abstract map
//Its a class implements map interface
//Only unique values
//Stores in key and value pair
//maintains no order
//It is non synchronized, multiple threads can handle simultaneously. Hence its not thread safe. 
//It give concurrent modification exception. Called fail fast condition 