package com.Java.Collections.List;

public class Employee 
{
	String empname;
	int age;
	String empdept;
	
	Employee(String empname, int age, String empdept) // constructor for employee class
	{
		this.age=age;
		this.empname=empname;
		this.empdept=empdept;
	}

}

//If the global and local variable names are same as above we need to use "this" keyword