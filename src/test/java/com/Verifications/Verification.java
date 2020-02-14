package com.Verifications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification 
{
	
	SoftAssert softAssert=new SoftAssert();
  	
	  @Test
	  public void test() throws Exception 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\himalesh\\git\\Java\\drivers\\chromedriver.exe");
		  
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		  
		  Assert.assertEquals(true, true); //Hard assertion if fails the subsequent lines wont be executed.
		  
		  driver.get("https://www.amazon.in");
		  
		  driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
		  
		  driver.findElement(By.id("ap_email")).sendKeys("himalesh.play@gmail.com");
		  
		  driver.findElement(By.id("continue")).click();
		  
		  driver.findElement(By.id("ap_password")).sendKeys("Nalam19**");
		  
		  driver.findElement(By.id("signInSubmit")).click();
		  
		  softAssert.assertEquals(true, false, "Soft assert created...");
		  
		  driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		  
		  softAssert.assertAll(); //
		  
		  Thread.sleep(500);
		  driver.quit();
	  }
}
