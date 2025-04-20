package com.example.factory;

import com.example.constant.AccountConstantValues;
import com.example.creational.service.CurrentAccount;
import com.example.creational.service.FixedAccount;
import com.example.creational.service.IAccount;
import com.example.creational.service.RecurringAccount;
import com.example.creational.service.SavingAccount;

public class AccountFactory {
	
	IAccount accountObject = null;

	public static IAccount getAccountObject(String accountType){
		
		if (AccountConstantValues.SAVING_ACCOUNT.equals(accountType))
			return new SavingAccount();
		if (AccountConstantValues.CURRENT_ACCOUNT.equals(accountType))
			return new CurrentAccount();
		if (AccountConstantValues.FIXED_ACCOUNT.equals(accountType))
			return new FixedAccount();
		if (AccountConstantValues.RECURING_ACCOUNT.equals(accountType))
			return new RecurringAccount();
		
		return null;
			
		
	}

}
