package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.loginpage;

public class TC01_logintest extends DriverScript{
	@BeforeMethod
	public void Precondition()
	{
		initBrowser();
		LaunchApplication();
	}
	
@Test
	public void testloginfunctions()	
	{
		loginpage loginpage = new loginpage();
		loginpage.logintoApplication("admin", "manager");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
@Test
    public void testverifylogodisplayed()
    {
    	loginpage loginpage = new loginpage();
    	boolean flag = loginpage.verifylogo();
    	System.out.println(flag);
    }

    @AfterMethod
    public void Postcondition()
    {
		CloseApplication();
	}

}
