package com.example.main;

import com.example.constant.AccountConstantValues;
import com.example.creational.service.IAccount;
import com.example.factory.AccountFactory;
import com.example.factory.EmployeeSingleton;
import com.example.vo.SQLConnection;

public class CreationalPatternMain {

	
	public static void main(String[] args) {
	
		/*
		//Singleton Test
		SQLConnection employee = SQLConnection.getSQLConnection();//EmployeeSingleton.getEmployee();
		System.out.println("Employee " + employee.hashCode() );
		
		employee = SQLConnection.getSQLConnection();
		System.out.println("Employee " + employee.hashCode());
	
		employee = SQLConnection.getSQLConnection();
		System.out.println("Employee " + employee.hashCode());
	
		employee = SQLConnection.getSQLConnection();
		System.out.println("Employee " + employee.hashCode());
		
		*/
		
		//Factory method test
		IAccount account = null;
		Object object = null;
		account = AccountFactory.getAccountObject(AccountConstantValues.SAVING_ACCOUNT);
		account.deposit(object);
		account.withdrawl(object);
		
		
		account = AccountFactory.getAccountObject(AccountConstantValues.CURRENT_ACCOUNT);
		account = AccountFactory.getAccountObject(AccountConstantValues.FIXED_ACCOUNT);
		account = AccountFactory.getAccountObject(AccountConstantValues.RECURING_ACCOUNT);
		
	}
}
