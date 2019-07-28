package com.icici.loans.eduloans;

public class ChildClass extends FirstAbstarct
{

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();

	}
	
	public void m1()
	{
		System.out.println("iam m1 overridden method from Child Class...");
	}

	@Override
	public void m2() 
	{
		System.out.println("Iam m2 overriden method in Child Class");
		
	}

}
