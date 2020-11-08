package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Name : Driver Script
 * Description: XXXXXXXX
 * Developed by : Shyamala
 * Date: 11/7/20
 */


public class DriverScript {
	
	public static WebDriver driver;
	static Properties prop;
	//Create a constructor for getting the file 
	public DriverScript()
	{
		try
		{
			File file = new File("./src/test/resources/configfiles/config.properties");
			FileInputStream FIS = new FileInputStream(file);
			prop = new Properties();
			prop.load(FIS);
			
		}
		catch(Exception e)
		{
			System.out.println("Unable to read the file" + e.getMessage());    
		}
	}	
		
		//Create a method to open the browser
	
		public static void  initBrowser()
		{
			String browser = prop.getProperty("browser");
			if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./src/test/resources/browsers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./src/test/resources/browsers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else
			{
				System.out.println("Unsupported Browser Name");			
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}

     public static void LaunchApplication()

    {
	    String url = prop.getProperty("qaurl");
        driver.get(url);
     }
     
     public static void CloseApplication()
     {
    	 driver.quit();
     }

}
