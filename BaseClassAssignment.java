package week5.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassAssignment {
	
	public RemoteWebDriver driver;
	
	
	@Parameters({"browser","url","Username", "Password"})
	
	@BeforeMethod
	public void preCondAssignment(String browser1,String url1,String username1, String password1)
	{

	
		if(browser1.equalsIgnoreCase("Chrome"))
		{
		 driver=new ChromeDriver();
		}
		else if(browser1.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url1);
	
	driver.findElement(By.id("username")).sendKeys(username1);
	driver.findElement(By.id("password")).sendKeys(password1);
	}
	
	@AfterMethod
	public void postCondAssignment()
	{
		driver.close();
	}
	
}
