package com.icici.loans.eduloans;

public class FirstClass 
{
	//properties (data)
	int a=10,b=20,c;
	
	//Behaviours (operations or methods)
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A  & B is : " + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Substarct of A & B is : " + c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi ...");	
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1=new FirstClass();
		obj1.add();
		obj1.sub();
	}

}
