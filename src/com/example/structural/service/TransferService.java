package com.example.structural.service;

public class TransferService {

	public void transferFunds(String fromAccount, String toAccount, double amount) {
		System.out.println("Transferring " + amount + " from account " 
								+ fromAccount + " to account " + toAccount);
	}
}
