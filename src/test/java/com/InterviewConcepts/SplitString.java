package com.InterviewConcepts;

public class SplitString 
{

	public static void main(String[] args) 
	{
		String str="12ABCD8@7JUYH0O%*";
		StringBuffer alpha=new StringBuffer(), num=new StringBuffer(), special=new StringBuffer();
		
		for(int i=0; i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha.append(str.charAt(i));
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num.append(str.charAt(i));
			}
			else
				special.append(str.charAt(i));
				
		}
		System.out.println("Charecters: "+alpha);
		System.out.println("Numbers: "+num);
		System.out.println("Special: "+special);

	}

}
