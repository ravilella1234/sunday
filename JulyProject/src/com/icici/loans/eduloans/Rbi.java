package com.icici.loans.eduloans;

public interface Rbi 
{
	public void withdrawl(); // abstarct method
	public void deposit();
	
	
	public static void main(String[] args) {
		/*Rbi i=new Hdfc();
		i.deposit();
		i.withdrawl();
		
		Rbi i1=new Kotak();
		i1.deposit();
		i1.withdrawl();*/
		
		
		Rbi i;
		
		i=new Hdfc();
		i.deposit();
		i.withdrawl();
		
		i=new Kotak();
		i.deposit();
		i.withdrawl();
	}
	
}
