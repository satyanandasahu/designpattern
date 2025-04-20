package com.example.creational.service;

public class FixedAccount implements IAccount {
	
	@Override
	public int deposit(Object deposit) {
		System.out.println( this.getClass().getName() + "  Deposit");
		return 0;
	}

	@Override
	public int withdrawl(Object withdrawl) {
		System.out.println( this.getClass().getName() + "  Withdrawl");
		return 0;
	}


}
