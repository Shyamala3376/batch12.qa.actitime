package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.acti.base.DriverScript;
import com.acti.pages.Entertimepage;
import com.acti.pages.TasklistPage;
import com.acti.pages.loginpage;
import com.acti.util.Excellib;

public class BaseTest extends DriverScript {
	loginpage loginpage;
	Entertimepage enterTimePage;
	TasklistPage taskpg;
	
	@BeforeMethod
	public void Precondition()
	{
		initBrowser();
		LaunchApplication();
		loginpage = new loginpage();
		enterTimePage = new Entertimepage();
		taskpg = new TasklistPage();
	}
	

	
//	@AfterMethod
    public void Postcondition()
    {
		CloseApplication();
	}

}
