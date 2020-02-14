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
		System.out.println("Array list 'ar' size is: " + ar.size());
		ar.add(40);
		System.out.println("Array list 'ar' size after adding one object is: " + ar.size());
		
		System.out.println("Value in 3rd position of 'ar' is: " + ar.get(2));
		
		//to traverse or print all values we need to use for loop or iterator
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println("Objecct value in 'ar': "+ar.get(i));
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
		System.out.println("Using iterater for printing all values in arraylist...");
		Iterator<Employee> it = ar4.iterator(); //iterator wont work on index. Returns iterator type reference
		while(it.hasNext()) //hasNext points to the first node in the array
		{
			Employee emp = it.next();	//next will point to the first object. 
										//As the value returned is employee type we are saving it in employee reference
			System.out.println("Age: "+ emp.age);
			System.out.println("Name: "+ emp.empname);
			System.out.println("Dept: "+ emp.empdept);
		}
		
		//addAll() -adds two array list objects into one
		System.out.println("*****addAll()*****");
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Java");
		ar5.add("Selenium");
		ar5.add("Pinpong");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Collections");
		ar6.add("Strings");
		ar6.add("Pinpong");
		
		ar5.addAll(ar6);
		System.out.println(ar5.size());
		System.out.println(ar5);
		
		for(int i=0; i<ar5.size(); i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//removeAll() -remove two array list objects
		System.out.println("*****removeAll()*****");
				
		ar5.removeAll(ar6);
		System.out.println("Size of ar5 after removing objects of ar6: "+ar5.size());
		for(int j=0;j<ar5.size();j++)
		{
			System.out.println(ar5.get(j));
		}
		
		//retainAll() --to get common objects from two array list.
		System.out.println("*****retainAll()*****");
		
		ArrayList<String> ar7=new ArrayList<String>();
		
		ar7.add("One");
		ar7.add("Two");
		ar7.add("Three");
		
		ArrayList<String> ar8=new ArrayList<String>();
		
		ar8.add("Three");
		ar8.add("Four");
		ar8.add("Five");
		
		ar7.retainAll(ar8);
		System.out.println(ar7);
				
	}

}

//1. It can contain duplicate values.
//2. Maintains insertion order.
//3. Not synchronized.
//4. Allow random access to fetch any element because it stores values on basis of indexes.