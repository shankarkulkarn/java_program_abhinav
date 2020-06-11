package com.demo;

public class Account {

	
	private  int balance ;
	
	
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public void withdraw(int amount)
	{
		 if( amount > balance )
		 {
			 throw new IllegalArgumentException("Insufficient Balance ");
		 }
		  balance -= amount ;
		 
    }
	
}
