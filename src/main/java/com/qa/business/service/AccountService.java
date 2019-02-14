package com.qa.business.service;

public interface AccountService {
	
	//C
	String createAccount(String account);
	//R
	String getAllAccounts();
	String getAnAccount(Long accountId);
	//U
	String updateAccount(String account, Long id);
	//D
	String deleteAccount(Long id);
	String getNAccounts(int n);
}
