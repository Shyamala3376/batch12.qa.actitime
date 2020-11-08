package com.acti.testcase;

import org.testng.annotations.Test;

public class TC01_logintest extends BaseTest{
	
@Test
	public void testloginfunctions()	
	{
		loginpage.logintoApplication("admin", "manager");
	}
@Test
    public void testverifylogodisplayed()
    {
    	boolean flag = loginpage.verifylogo();
    	System.out.println(flag);
    }    

}
