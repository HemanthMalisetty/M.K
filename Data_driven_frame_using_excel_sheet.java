package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.Data_driven_framework_using_excel_sheet;

public class Data_driven_frame_using_excel_sheet {
	
	WebDriver driver=null;
	Data_driven_framework_using_excel_sheet data=null;
	Object[][] objs=null;
	
	@Test(dataProvider="wordpressdata")
	public void wordpress(String username,String password) throws Exception
	{
		
		boolean flag=true; 
		
		if(flag=true)
		{
		
		//creating the driver class obj
		driver=new FirefoxDriver();
		
		//maximizing the page
		driver.manage().window().maximize();
		
		//making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//launching the url
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		//typing the username
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(username);
		
		//typing the password
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(password);
		
		//clicking on the login button
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		
		flag=false;
		
		}
		//making the thread to wait for 5 seconds
		Thread.sleep(5000);		
		
		if(flag=true)
		{
		//comparing the page title
		Assert.assertTrue(driver.getTitle().contains("Dashboard ‹ WordPress Demo Install — WordPress"),"User in not able to login");
		
		//printing the result
		System.out.println("Page title verified-user is able to login");
		}
		}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

	@DataProvider(name="wordpressdata")
	public Object[][] passdata() 
	{
		int i=0;
		
		//creating the object for utility class
		data=new Data_driven_framework_using_excel_sheet("D:\\javaPrograms\\Selinium\\Selenium_first\\ExcelData\\Data.xlsx");
				
		//gathering the row count
		int count=data.rowCount(0);
		
		//gathering the data into an array
		objs=new Object[count][2];
		
		for(i=0;i<count;i++)
		{
			objs[i][0]=data.getData(0, i, 0);
			objs[i][1]=data.getData(0, i, 1);
		}
		 
		//returning the data
		return objs;
		
	}
	
}
