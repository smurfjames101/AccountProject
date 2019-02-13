package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {
	AccountMapRepository repo; 
	@Before
	public void setup() {
		repo = new AccountMapRepository(0);
	}
	@Ignore
	@Test
	public void addAccountTest() {
		assertEquals("Success",repo.createAccount("{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666}"));
	}
	@Ignore
	@Test
	public void add2AccountsTest() {
		assertEquals("Success", repo.createAccount("{ \"firstName\": \"Josh\",\"lastName\": \"Josh\",\"accountNumber\": 1}"));	
		assertEquals("Success", repo.createAccount("{ \"lastName\": \"Josh\",\"accountNumber\": 1}"));	
	}
	@Ignore
	@Test
	public void removeAccountTest() {
		assertEquals("Account has been removed.",repo.deleteAccount((long) 1));
			
	}
	@Ignore
	@Test
	public void testGetAllAccounts() {
		assertEquals("{\"0\":{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666},\"1\":{\"firstName\":\"Johnny\",\"lastName\":\"Bravo\",\"accountNumber\":42}}",repo.getAllAccounts());
	}
	@Ignore
	@Test
	public void remove2AccountsTest() {	
	}
	@Ignore
	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
	}
	@Ignore
	@Test
	public void jsonStringToAccountConversionTest() {
	}

	@Ignore
	@Test
	public void accountConversionToJSONTest() {
	}
	@Ignore
	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
	}
	@Ignore
	@Test
	public void getCountForFirstNamesInAccountWhenOne() {

	}
	@Ignore
	@Test
	public void getCountForFirstNamesInAccountWhenTwo() {	
	}

}
