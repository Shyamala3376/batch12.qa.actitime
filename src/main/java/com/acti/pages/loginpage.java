package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class loginpage extends DriverScript {

	/* Name : LoginPage
	 * Description: Elements and Actions 
	 * Developed by : Shyamala
	 * Date: 11/7/20
	 */
	
	
	//*******************************************Page Element *************************************************//
	@FindBy(id="username") WebElement usernameTB;
	@FindBy(name="pwd") WebElement passwordTB;
	@FindBy(id="loginButton")WebElement LoginButton;
	@FindBy(className="atLogoImg") WebElement actitimeLogo; 
	
	//*******************************************Page Initialization *******************************************//
	
	public loginpage()
	{
		PageFactory.initElements(driver,this);
	}
	

	//*******************************************Page Actions****************************************************//
	/* You should never hard code the test data. so it has to be parameterised.
	public void logintoApplication()
	{
		usernameTB.sendKeys("admin");
		passwordTB.sendKeys("manager");
		LoginButton.click();
	}*/
	
	public void logintoApplication(String username,String password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		LoginButton.click();
	}
	public boolean verifylogo()
	{
		return actitimeLogo.isDisplayed();
	}
	public String verifypagetitle()
	{
	    return driver.getTitle();
	}
	

}
