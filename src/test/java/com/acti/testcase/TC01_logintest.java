package com.acti.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.acti.util.Excellib;

public class TC01_logintest extends BaseTest{
	
//@Test
	public void testloginfunctions()	
	{
		loginpage.logintoApplication("admin", "manager");
	}
//@Test
    public void testverifylogodisplayed()
    {
    	boolean flag = loginpage.verifylogo();
    	System.out.println(flag);
    }    

@Test(dataProvider="actidata")
    public void testloginformultiuser(String username,String password)
    {
		loginpage.logintoApplication(username,password);
	}
@DataProvider(name="actidata")
public Object[][] testData()
{
	Excellib xl = new Excellib();
	int row = xl.getRowCount(0);
	
	Object[][] data = new Object[row][2];
	
	for(int i=0;i<row; i++)
	{
		data[i][0]=xl.getCellData(0,i,0);
		data[i][1]=xl.getCellData(0,i,1);
		
	}
	return data;}
	
    }

