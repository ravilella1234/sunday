package com.icici.loans.carloans;

public class SecondClass 
{
	
	//data  -- properties(data variables)
	//Operations  -- behaviours(method)
	
	int a=10,b=20,c; // properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Adition of A & B is : " + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Substarction of A & B is :" + c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello ");
		SecondClass obj=new SecondClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
		
		SecondClass obj1=new SecondClass();
		obj1.add();
		obj1.sub();
	}
	
	
}
