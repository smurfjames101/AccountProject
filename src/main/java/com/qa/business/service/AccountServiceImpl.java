package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.JSONUtil;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;

	private JSONUtil util;
	
	@Override
	public String createAccount(String account) {
		Account newAccount = util.getObjectForJSON(account, Account.class);
		String temp = "" + newAccount.getAccountNumber();
		if(temp.contains("9"))
		{
			return "Account Could Not Be Added";
		}
		return repo.createAccount(account);
	}

	@Override
	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	@Override
	public String getAnAccount(Long accountId) {
		return repo.getAnAccount(accountId);
	}

	@Override
	public String updateAccount(String account, Long id) {
		return repo.updateAccount(id, account);
	}

	@Override
	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}

	@Override
	public String getNAccounts(int n) {
		return repo.getNAccounts(n);
	}

}
