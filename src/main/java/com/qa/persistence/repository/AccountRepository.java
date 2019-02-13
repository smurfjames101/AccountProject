package com.qa.persistence.repository;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface AccountRepository {

	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(Long id);
	String updateAccount(Long id, String account);
	String getAnAccount(Long id);
	String getNAccounts(int n);

	int cycleAccounts(String accountName) throws JsonProcessingException;
}
