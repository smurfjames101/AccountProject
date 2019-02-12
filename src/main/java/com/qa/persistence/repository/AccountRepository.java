package com.qa.persistence.repository;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface AccountRepository {

	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(Long id, int account);
	String updateAccount(Long id, String account);
	int cycleAccounts(String accountName) throws JsonProcessingException;
}
