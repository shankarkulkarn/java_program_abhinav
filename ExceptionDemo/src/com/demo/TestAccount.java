package com.demo;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		
		
		account.setBalance(1000);
		
		try {
			account.withdraw(1500);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(" Balance = "+account.getBalance());

	}

}
