package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Default
public class AccountDBRepository implements AccountRepository {

	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	@Transactional(REQUIRED)
	public String createAccount(String account) {
		Account anAccount = util.getObjectForJSON(account, Account.class);
		manager.persist(anAccount);
		return "{\"message\": \"Account has been added\"}";
	}

	@Override
	public String getAllAccounts() {
		Query query = manager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}

	@Override
	public String getAnAccount(Long id) {
		return util.getJSONForObject(manager.find(Account.class, id));
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		if (manager.contains(manager.find(Account.class, id))) {
			manager.remove(manager.find(Account.class, id));
		}
		return "{\"message\": \"Account sucessfully deleted\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateAccount(Long id, String account) {
		Account temp = new Account();
		temp = util.getObjectForJSON(account, Account.class);
		manager.persist(temp);
		String delOut = deleteAccount(id);
		return "Account updated."+delOut;
	}

	@Override
	public String getNAccounts(int n) {
		Query query = manager.createQuery("Select a FROM Account a");
		query.setMaxResults(n);
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}

	@Override
	public int cycleAccounts(String accountName) throws JsonProcessingException {
		// TODO Auto-generated method stub
		return 0;
	}
}