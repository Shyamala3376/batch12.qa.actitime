package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.util.Generic;

public class TasklistPage extends DriverScript {
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement customerNameTextbox;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement custDescriptionTextArea;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustomerButton;
	@FindBy(xpath="//span[@class='innerHtml']")WebElement toastmessage ;
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")WebElement SelectCustomerDropdown;
	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Galaxy Corporation']")WebElement galaxycorporationoption;
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
	public void enterCustDesc(String CustDesc)
	{
		custDescriptionTextArea.sendKeys(CustDesc);
	}
	public void createCustomerButton()
	{
		createCustomerButton.click();
	}
	public String gettoastmessage()
	{
		return toastmessage.getText();
	}
	public void selectCustomer()
	{
		SelectCustomerDropdown.click();
		Generic.fn_sleep();
	}
	public void selectGalopt()
	{
		galaxycorporationoption.click();
	}

}
