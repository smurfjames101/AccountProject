package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {
	AccountMapRepository repo = new AccountMapRepository();
	@Before
	public void setup() {
		//repo.createAccount("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}");
	}
	@Ignore
	@Test
	public void addAccountTest() {
		assertEquals("Success",repo.createAccount("{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666}"));
	}
	
	@Test
	public void add2AccountsTest() {
		assertEquals("Success", repo.createAccount("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}"));	
		assertEquals("Success", repo.createAccount("{ \"lastName\": \"Josh\",\"accountNumber\": 1}"));	
	}
	@Ignore
	@Test
	public void removeAccountTest() {
		assertEquals("Account has been removed.",repo.deleteAccount((long) 1,1));
			
	}
	
	@Test
	public void testGetAllAccounts() {
		assertEquals("{\"0\":{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666},\"1\":{\"firstName\":\"Johnny\",\"lastName\":\"Bravo\",\"accountNumber\":42}}",repo.getAllAccounts());
	}
	@Ignore
	@Test
	public void remove2AccountsTest() {
		fail("TODO");	
	}
	@Ignore
	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
		fail("TODO");	
	}
	@Ignore
	@Test
	public void jsonStringToAccountConversionTest() {
		// testing JSONUtil
		fail("TODO");	
	}

	@Ignore
	@Test
	public void accountConversionToJSONTest() {
		//testing JSONUtil
		fail("TODO");	
	}
	@Ignore
	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
		//For a later piece of functionality
		fail("TODO");	
	}
	@Ignore
	@Test
	public void getCountForFirstNamesInAccountWhenOne() {
		//For a later piece of functionality
		fail("TODO");	
	}
	@Ignore
	@Test
	public void getCountForFirstNamesInAccountWhenTwo() {
		//For a later piece of functionality
		fail("TODO");	
	}

}
