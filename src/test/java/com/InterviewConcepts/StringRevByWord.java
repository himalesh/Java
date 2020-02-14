package com.InterviewConcepts;

public class StringRevByWord 
{

	public static void main(String[] args) 
	{
		String str="Its Java String Program";
		String[] words=str.split("\\s");
		String rev="";
		
//		for(String wr : words)
//		{
//			StringBuilder sb=new StringBuilder(wr);
//			sb.reverse();
//			rev+=sb.toString()+" ";
//		}
		for(int i=0;i<words.length;i++)
		{
			if(i==words.length-1)
				rev=words[i]+rev;
			else
				rev=" "+words[i]+rev;
		}
		
		System.out.println(rev);

	}

}
