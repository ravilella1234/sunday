package com.icici.loans.eduloans;

public abstract class FirstAbstarct 
{
	
	public void m1()
	{
		System.out.println("iam m1 concrete method from FirstAbstract...");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) {
		//FirstAbstarct f=new FirstAbstarct();
		
		FirstAbstarct a=new ChildClass();
		a.m1();
		a.m2();
		
	}
	

}
