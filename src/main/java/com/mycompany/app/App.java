package com.mycompany.app;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
		
	
 @Test
	  public void Open_Browser()
	  {
		
		//setting property for Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Desktop\\Akshata\\Study\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open google in Chrome browser
		driver.get("https://www.google.com");
		WebElement searchbutton=driver.findElement(By.name("q"));
		//search for "sap fiori trial"
		searchbutton.sendKeys("sap fiori trial");
		searchbutton.submit();
		//click on First link
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div[1]/div/div/div[1]/a/div/cite")).click();
		//click on Demo button
		driver.findElement(By.xpath("//*[@id=\"experience\"]/div[2]/div[3]/div/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//click on popup
		driver.findElement(By.xpath("//*[@id=\'__button11-content\']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll the page		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click on the Last Tile(DSO)
		driver.findElement(By.xpath("//*[@id=\'__tile41-subHdr-text\']")).click();
		driver.close();
		System.out.println("project executed successfully");
	}

}
