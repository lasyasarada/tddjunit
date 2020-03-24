package com.epam.tddjunit;

import java.util.Scanner;

public class Main {	
	public String get(String s)
	{   
		String str="";
		int length=s.length();
		if(length>=2)
		{
			if(s.charAt(0)!='A')
			{
				str=str+s.charAt(0);
			}
			if(s.charAt(1)!='A')
			{
				str=str+s.charAt(1);
			}
			if(length>2)
			{
				str=str+s.substring(2,length);
			}			
		}
		else
		{
			if(length==1)
			{
				if(s.charAt(0)!='A')
				{
					str=str+s.charAt(0);
				}	
			}
		}
		return(str);
	}
	public static void main(String arg[]) {
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		System.out.println(m.get(string));
		
	}
}