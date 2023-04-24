package week5.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Assignment extends BaseClassAssignment {

	@Test
	public  void runCodeAssignment() throws InterruptedException {
		// TODO Auto-generated method stub

		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allList=new ArrayList<String>(windowHandles);
		Thread.sleep(3000);
		driver.switchTo().window(allList.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String title2 = driver.getTitle();
		if(title.equals(title2))
		{
			System.out.println("Window is not Redirected");
		}
		else
		{
			System.out.println("Window is Redirected Successfully");
		}
		Thread.sleep(3000);
		Shadow shd=new Shadow(driver);
		shd.setImplicitWait(5);
		shd.findElementByXPath("//span[text()='Learning']").click();
		Actions act=new Actions(driver);
		WebElement shadowpath = shd.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(shadowpath).perform();
		Thread.sleep(3000);
		WebElement path2 = shd.findElementByXPath("//h2[text()='Learning on Trailhead']");
		act.moveToElement(path2).perform();
		shd.setImplicitWait(5);
		WebElement path3 = shd.findElementByXPath("//a[text()='Salesforce Certification']");
		act.scrollToElement(path3).perform();
		shd.setImplicitWait(5);
		shd.findElementByXPath("//a[text()='Salesforce Certification']").click();
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("administrator")) {
			System.out.println("Page is Verified Successfully and it was in Administator");
		} else {
			System.out.println("Page is Verified Successfully and it was not in Administator");
		}
		List<String> allList1 = new ArrayList<String>();
		WebElement path4 = driver.findElement(By.xpath(
				"//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']"));
		act.scrollToElement(path4).perform();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[1]/div)/div[3]/a"))
				.getText();
		allList1.add(text);
		String text1 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[2]/div)/div[3]/a"))
				.getText();
		allList1.add(text1);
		String text2 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[3]/div)/div[3]/a"))
				.getText();
		allList1.add(text2);
		String text3 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[4]/div)/div[3]/a"))
				.getText();
		allList1.add(text3);
		String text4 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[5]/div)/div[3]/a"))
				.getText();
		allList1.add(text4);
		String text5 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[6]/div)/div[3]/a"))
				.getText();
		allList1.add(text5);
		String text6 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[7]/div)/div[3]/a"))
				.getText();
		allList1.add(text6);
		String text7 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[8]/div)/div[3]/a"))
				.getText();
		allList1.add(text7);

		System.out.println(allList1);
		
		
	}

}
