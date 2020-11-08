package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class Entertimepage extends DriverScript {
	@FindBy(xpath="//a[@class='content tasks']") WebElement taskMenu;
	@FindBy(id="logoutLink") WebElement logoutLink;
	
	public Entertimepage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutlink()
	{
		logoutLink.click();
	}
	
	public void clickTaskMenu()
	{
		taskMenu.click();
	}

}
