package com.demo;

public class Account {

	
	private  int balance ;
	
	
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public void withdraw(int amount) throws BalanceException
	{
		 if( amount > balance )
		 {
			 throw new BalanceException("Insufficient Balance ");
		 }
		  balance -= amount ;
		 
    }
	
}
