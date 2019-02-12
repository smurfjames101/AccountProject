package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {
	AccountMapRepository repo = new AccountMapRepository();
	@Before
	public void setup() {
	}
	
	@Test
	public void addAccountTest() {
		assertEquals("Success",repo.createAccount("{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666}"));
	}
	
	@Test
	public void add2AccountsTest() {
		assertEquals("Success", repo.createAccount("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}"));	
		assertEquals("Success", repo.createAccount("{ \"lastName\": \"Josh\",\"accountNumber\": 1}"));	
	}
	
	@Test
	public void removeAccountTest() {
		assertEquals("Account has been removed.",repo.deleteAccount((long) 1,1));
			
	}
	
	@Test
	public void testGetAllAccounts() {
		assertEquals("{\"0\":{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666},\"1\":{\"firstName\":\"Johnny\",\"lastName\":\"Bravo\",\"accountNumber\":42}}",repo.getAllAccounts());
	}
	@Test
	public void remove2AccountsTest() {	
	}

	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
	}
	
	@Test
	public void jsonStringToAccountConversionTest() {
	}

	
	@Test
	public void accountConversionToJSONTest() {
	}
	
	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
	}
	
	@Test
	public void getCountForFirstNamesInAccountWhenOne() {

	}
	
	@Test
	public void getCountForFirstNamesInAccountWhenTwo() {	
	}

}
