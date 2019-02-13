package com.qa.business.service;

public interface AccountService {
	
	//C
	String createAccount(String product);
	//R
	String getAllAccounts();
	String getAnAccount(Long productId);
	//U
	String updateAccount(String product, Long id);
	//D
	String deleteAccount(Long id);
	String getNAccounts(int n);
}
