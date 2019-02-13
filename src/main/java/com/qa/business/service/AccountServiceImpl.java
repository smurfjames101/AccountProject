package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;

	@Override
	public String createAccount(String Account) {
		return repo.createAccount(Account);
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
