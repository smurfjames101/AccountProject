package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.persistence.domain.App;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {
	AccountMapRepository repo = new AccountMapRepository();
	@Before
	public void setup() {
		
	}
	@Ignore
	@Test
	public void testCycleAccounts()
	{
		repo.createAccount("{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666}");
		repo.createAccount("{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666}");
		repo.createAccount("{\"firstName\":\"Bobby\",\"lastName\":\"Bobson\",\"accountNumber\":666}");
		assertEquals(3,repo.cycleAccounts("Bobby"));
	}
	@Test
	public void testLog()
	{
		assertEquals("success",App.log());
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
		assertEquals("Account has been removed.",repo.deleteAccount((long) 0,666));
			
	}
	
	@Test
	public void testGetAllAccounts() {
		assertEquals("Success",repo.getAllAccounts());
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
