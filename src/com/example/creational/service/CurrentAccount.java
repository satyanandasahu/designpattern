package com.example.creational.service;

public class CurrentAccount implements IAccount {
	
	@Override
	public int deposit(Object deposit) {
		System.out.println( this.getClass().getName() + "  Deposit");
		return 1;
	}

	@Override
	public int withdrawl(Object withdrawl) {
		System.out.println( this.getClass().getName() + "  Withdrawl");
		return 1;
	}


}
