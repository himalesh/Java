package com.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration 
{

	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("GOT");
		ar.add("Breaking Bad");
		ar.add("Vampire Dairies");
		ar.add("Suits");
		
		System.out.println("Using for each loop and lambda expression in java 8: ");
		
		ar.forEach(shows -> 
			{
				System.out.println(shows);
			}
		);
		System.out.println("****************");
		
		System.out.println("Using iterator: ");		
		Iterator<String> it = ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("****************");
		
		System.out.println("Using iterator and forEachRemaining() in java 8: ");		
		it=ar.iterator();
		it.forEachRemaining(show -> {System.out.println(show);});
		System.out.println("****************");
		
		System.out.println("Using for each loop: ");
		for(String show : ar)
		{
			System.out.println(show);
		}
		System.out.println("****************");
		
		System.out.println("Using for each loop with index: ");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("****************");
		
		System.out.println("listIterator()");
		
		ListIterator<String> itr = ar.listIterator(ar.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		
		
		

	}

}
