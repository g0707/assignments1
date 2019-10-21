package com.gaurav.assignment;

public class SimpleAndCompoundInterest 
{
	double si;
	double ci;
	double amount;
	int p;
	int r;
	int t;
	
	public void si(int p,int r,int t) 
	{
		si=(p*r*t)/100;
		System.out.println("Simple Interest is : "+si);
	}
	public void ci(int p,int r,int t) 
	{
		amount = p * Math.pow((1 + (r / 100.0)),t);
		ci=amount-p;
		System.out.println("Compound Interest is : "+ci);
		
	}
	
	public static void main(String[] args) 
	{
		SimpleAndCompoundInterest saci=new SimpleAndCompoundInterest();
		saci.si(2000,5,2);
		saci.ci(2000,5,2);
	}
}
