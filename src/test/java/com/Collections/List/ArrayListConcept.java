package com.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) 
	{
		int a[]=new int[4]; // static array of fixed size
		//dynamic array -- array list
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(20);
				
		System.out.println("Array list size is: " + ar.size());
		
		ar.add(40);
		System.out.println("Array list size is: " + ar.size());
		
		System.out.println("Value in 3rd position: " + ar.get(2));
		
		//to traverse or print all values we need to use for loop or iterator
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generics
		//if no data type is defined then it is non generic
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(45);
		
		ArrayList<E> ar2=new ArrayList<E>(); // we will pass when we dont know what kind of objects we add in array list
		
		//class objects
		System.out.println("Using class objects and itertor");
		
		Employee e1=new Employee("Himalesh", 31, "Testing");
		Employee e2=new Employee("Anusha", 26, "Admin");
		Employee e3=new Employee("Junior", 1, "Playing");
		
		//creating array list
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator
		Iterator<Employee> it = ar4.iterator(); //iterator wont work on index
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println("Age: "+emp.age);
			System.out.println("Name: "+emp.empname);
			System.out.println("Dept: "+emp.empdept);
		}
	}

}

//1. It can contain duplicate values.
//2. Maintains insertion order.
//3. Not synchronized.
//4. Allow random access to fetch any element because it stores values on basis of indexes.