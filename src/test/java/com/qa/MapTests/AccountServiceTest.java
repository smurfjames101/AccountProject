package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {

	AccountMapRepository repo;

	@Before
	public void setup() {
		repo = new AccountMapRepository();
	}

	@Test
	public void addAccountTest() {
		assertEquals("Account Added, size:", repo.createAccount("oranges"));
	}
	
//	@Ignore
//	@Test
//	public void add2AccountsTest() {
//		fail("TODO");
//	}

	@Test
	public void removeAccountTest() {
		assertEquals("Account Deleted",repo.deleteAccount((long) 1));
	}
//	@Ignore
//	@Test
//	public void remove2AccountsTest() {
//		fail("TODO");
//	}
//	@Ignore
//	@Test
//	public void remove2AccountTestAnd1ThatDoesntExist() {
//		fail("TODO");
//	}
//	@Ignore
//	@Test
//	public void jsonStringToAccountConversionTest() {
//		// testing JSONUtil
//		fail("TODO");
//	}
//	@Ignore
//	@Test
//	public void accountConversionToJSONTest() {
//		// testing JSONUtil
//		fail("TODO");
//	}
//	@Ignore
//	@Test
//	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
//		// For a later piece of functionality
//		fail("TODO");
//	}
//	@Ignore
//	@Test
//	public void getCountForFirstNamesInAccountWhenOne() {
//		// For a later piece of functionality
//		fail("TODO");
//	}
//	@Ignore
//	@Test
//	public void getCountForFirstNamesInAccountWhenTwo() {
//		// For a later piece of functionality
//		fail("TODO");
//	}

}
