package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TasklistPage extends DriverScript {
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement customerNameTextbox;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement custDescriptionTextArea;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustomerButton;
	
	public TasklistPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton()
	{
		addNewButton.click();
	}
	
	public void clickNewCustomerItem()
	{
		newCustomerItem.click();
	}
	
	public void enterCustomerName(String customerName)
	{
		customerNameTextbox.sendKeys(customerName);
	}

}
