package com.acti.testcase;

import org.testng.annotations.Test;

public class TC02_CreateCustomer extends BaseTest {
	@Test
	public void testCreateCustomer() throws InterruptedException
	{
		
	    loginpage.logintoApplication("admin", "manager");		
		enterTimePage.clickTaskMenu();		
		taskpg.clickAddNewButton();
		taskpg.clickNewCustomerItem();
		taskpg.enterCustomerName("TestRaj1");
		taskpg.enterCustDesc("The new Employee");
		taskpg.selectCustomer();
		taskpg.selectGalopt();
		taskpg.createCustomerButton();
		System.out.println(taskpg.gettoastmessage());
}
}