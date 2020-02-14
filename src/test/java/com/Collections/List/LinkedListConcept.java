package com.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept 
{

	public static void main(String[] args) 
	
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("QTP");
		ll.add("Selenium");
		
		System.out.println("Linked list contains: "+ll);
		
		for(int i=0; i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		//addFirst()
		System.out.println("***addFirst()***");
		ll.addFirst("Automtion Tools");
		System.out.println("Linked list contains: "+ll);
		
		//addLast()
		System.out.println("***addLast()***");
		ll.addLast("Protractor");
		System.out.println("Linked list contains: "+ll);
		
		//get()
		System.out.println("Value in index 0: "+ll.get(0));
		
		//set()
		ll.set(0, "Hello QA");
		System.out.println("Value in index 0 after adding new value: "+ll.get(0));
		
		//removeFirst()
		System.out.println("***removeFirst()***");
		ll.removeFirst();
		System.out.println("Linked list contains: "+ll);
		
		//Iterating between all values in list
		System.out.println("*******Iterating and printing all values...");
		
		System.out.println("**********");		
		System.out.println("Using for loop...");		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("Value in the LinkedList at the index location "+ i + " is: "+ll.get(i));
		}
		
		System.out.println("**********");
		System.out.println("Using advance for loop...");
		for(String str: ll)
		{
			System.out.println("Value in the LinkedList is: "+ str);
		}
		
		System.out.println("**********");
		System.out.println("Using iterator...");
		
		Iterator<String> itr = ll.iterator();		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("**********");
		System.out.println("While loop...");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}

	}

}
