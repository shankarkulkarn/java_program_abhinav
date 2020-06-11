package com.demo;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		try
		{
		
		
		account.setBalance(1000);
		
		account.withdraw(1500);
		}
		catch(IllegalArgumentException  e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(" Balance = "+account.getBalance());

	}

}
