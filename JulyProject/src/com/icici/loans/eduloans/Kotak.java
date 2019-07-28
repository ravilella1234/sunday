package com.icici.loans.eduloans;

public class Kotak implements Rbi
{

	public static void main(String[] args) 
	{
		Kotak k=new Kotak();
		k.deposit();
		k.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overridden withdrawl from Kotak");
	}

	@Override
	public void deposit() {
		System.out.println("iam overridden deposit from Kotak");
	}

}
