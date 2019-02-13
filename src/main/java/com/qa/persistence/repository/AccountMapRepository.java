package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.qa.persistence.domain.Account;

public class AccountMapRepository implements AccountRepository {
	ObjectMapper util = new ObjectMapper();
	private long id;

	Map<Long, Account> accountMap = new HashMap<Long, Account>();
	Account startAccount = new Account(id++,"orange", "seven", 3);
	// You must provide concrete implementation for each of these methods
	// do not change the method signature

	public String getAllAccounts() {
		Account newAccount = new Account(id++,"Bobby", "Bobson", 666);
		Account newAccount2 = new Account(id++,"Johnny", "Bravo", 42);
		accountMap.put(id++, newAccount);
		accountMap.put(id++, newAccount2);
		//util.writeValueAsString(accountMap);
		try {
			return "Success";
		} catch (Exception e) {
			return "fail";
		}
	}

	public String createAccount(String account) {
		try {
			accountMap = util.readValue(account, new TypeReference<Map<String, String>>(){});
			return "Success";
		} catch (Exception o) {
			return "Oops";
		}

	}

	public String deleteAccount(Long id, int account) {
		startAccount.setAccountNumber(666);
		startAccount.setFirstName("Bobby");
		startAccount.setLastName("Bobson");
		this.accountMap.remove(id);
		return "Account has been removed.";
	}

	public String updateAccount(Long id, String account) {
		return "Account updated.";
	}

	public int cycleAccounts(String firstName){
		getAllAccounts();
		int nameCount =0;
		if(accountMap.isEmpty())
		{
			return 0;
		}
		for(long i = 0;i < accountMap.size();i++)
		{
			if(firstName.equals(accountMap.get(i).getFirstName()))	{
					nameCount++;
					}
		}
		return nameCount;
	}
}
