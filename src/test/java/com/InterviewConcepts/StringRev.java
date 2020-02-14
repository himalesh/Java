package com.InterviewConcepts;

public class StringRev 
{

	public static void main(String[] args) 
	{
		String str="Himalesh";
		String rev="";
		char[] ch = str.toCharArray();
		int len = str.length();
		//Using loops
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Reverse string: "+ rev);
		
		//Using string buffer
		StringBuffer sb=new StringBuffer(str);
		
		sb.reverse();
		sb.toString();
		
		System.out.println("Using string buffer: "+sb);
	}

}
