package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository implements AccountRepository {

	ObjectMapper util = new ObjectMapper();
	private static long id;

	Map<Long, Account> accountMap = new HashMap<Long, Account>();

	// You must provide concrete implementation for each of these methods
	// do not change the method signature

	public String getAllAccounts() {
		Account newAccount = new Account("Bobby", "Bobson", 666);
		Account newAccount2 = new Account("Johnny", "Bravo", 42);
		accountMap.put(id++, newAccount);
		accountMap.put(id++, newAccount2);
		
		try {
			return util.writeValueAsString(accountMap);
			}
		catch (Exception e) {
			return "It Borked";
		}
		
	}

	public String createAccount(String account) {
		try {
		accountMap = util.readValue(account, new TypeReference<Map<String,String>>(){});
		return "Success";
		}
		catch (Exception o)
		{
			return "Oops";	
		}
		
	}

	public String deleteAccount(Long id, int account) {
		if (accountMap.get(id).getAccountNumber() != account) {
			return "Could not remove account";
		} else {
			this.accountMap.remove(id);
		}
		return "Account has been removed.";
	}

	public String updateAccount(Long id, String account) {
		//this.accountMap.replace(id, util.getObjectForJSON(account, Account.class));
		return "Account updated.";
	}

}
