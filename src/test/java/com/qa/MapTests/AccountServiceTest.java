package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {
	AccountMapRepository repo = new AccountMapRepository();

	@Before
	public void setup() {
	
	}
	
	@Test
	public void addAccountTest() {
		assertEquals("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}", repo.createAccount("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}"));	
	}
	
	@Test
	public void add2AccountsTest() {
		assertNotEquals("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}", repo.createAccount("{ \"lastName\": \"Josh\",\"accountNumber\": 1}"));	
	}

	@Test
	public void removeAccountTest() {
		assertEquals("Account has been removed.",repo.deleteAccount( (long) 1));
			
	}
	
	@Test
	public void remove2AccountsTest() {
		fail("TODO");	
	}
	
	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
		fail("TODO");	
	}
	
	@Test
	public void jsonStringToAccountConversionTest() {
		// testing JSONUtil
		fail("TODO");	
	}


	@Test
	public void accountConversionToJSONTest() {
		//testing JSONUtil
		fail("TODO");	
	}

	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
		//For a later piece of functionality
		fail("TODO");	
	}
	
	@Test
	public void getCountForFirstNamesInAccountWhenOne() {
		//For a later piece of functionality
		fail("TODO");	
	}

	@Test
	public void getCountForFirstNamesInAccountWhenTwo() {
		//For a later piece of functionality
		fail("TODO");	
	}

}
