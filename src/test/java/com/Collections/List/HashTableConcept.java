package com.Collections.List;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> t1=new Hashtable<Integer, String>();
		
		t1.put(1, "Capt. America");
		t1.put(2, "Black Widow");
		t1.put(3, "Iron Man");
		t1.put(4, "Thor");
		
		//Creating clone/ shallow copy
		
		Hashtable<Integer, String> t2=new Hashtable<Integer, String>();
		
		t2=(Hashtable)t1.clone();
		
		System.out.println("Values from t1: "+t1);
		System.out.println("Values from t2: "+t2);
		
		t1.clear();
		
		System.out.println("Values from t1: "+t1);
		System.out.println("Values from t2: "+t2);
		
		//contains value
		Hashtable<String, String> t3=new Hashtable<String, String>();
		t3.put("G", "Groot");
		t3.put("B", "Black Widow");
		t3.put("C", "Captian Marvel");
		
		t3.containsValue("Groot");
		System.out.println("Available");
		
		Hashtable<String, String> t4=new Hashtable<String, String>();
		t4.put("G", "Groot");
		t4.put("B", "Black Widow");
		t4.put("C", "Captian Marvel");
		
		t4.remove("C");
		
		System.out.println("Values from t4: "+t4);
		
		//to print or iterate values from hash table --Enumeration, we use elements() method.
		
		System.out.println("Printing values from hash table using enumeration: ");
		Enumeration enm = t3.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		
		System.out.println("Printing values from hash table using entrySet(): ");
		
		Set<Entry<String, String>> es = t3.entrySet();
		System.out.println(es);
		
		System.out.println("To check both hash tables are equal or not:");
		if(t3.equals(t4))
		{
			System.out.println("Both hash tables are equal...");
		}
		
		System.out.println("To get hash code value: "+t4.hashCode());
	}

}
//It is synchronized.
//Similar to HashMap.
//Key-->Object-->HashCode (HashCode is unique object 32 bit number created by JVM. Two equal objects have same hashcode)
//Stores on basis of key and value.
//Stores the value with hashcode of the key. <223443, "Tom">
