package com.gaurav.assignment;

public class Armstrong 
{
	public static void main(String[] args) 
	{
	
	for(int i=1;i<=153;i++)
	{
		int temp=i;
		double result = 0;
		int rem=0;
		
		while(temp!=0) 
		{
			rem=temp%10;
			result= result+rem*rem*rem;
			temp=temp/10;
		}
		if(result==i) 
		{
			System.out.println("Armstrong Numbers are :");
			System.out.println(result);
		}
	}
}
}