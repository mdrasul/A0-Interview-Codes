package com.suite2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SnapDeal {

	WebDriver driver = new ChromeDriver();
	String username = "user"; // Change to your username and passwrod
	String password = "pass";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.demo.iscripts.com/multicart/demo/");
	}

	// To log in flipkart
	@Test
	public void login() {
		driver.findElement(By.id("dLabellogin")).click();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='jqLogin']")).click();
	}

	// Search For product
	@Test
	public void searchAndSelectProduct() {
		driver.findElement(By.xpath(".//*[@id='search_header_top']/form/input[4]")).click();

		driver.findElement(By.xpath(".//*[@id='search_header_top']/form/input[4]")).sendKeys("Black Kajal");
		//driver.findElement(By.cssSelector("search-bar-submit.fk-font-13.fk-font-bold")).click();

		// select the first item in the search results
		//String xpath = ".gd-row.browse-grid-row:nth-of-type(1) > div:nth-child(1)>div>div:nth-child(2)>div>a";
		driver.findElement(By.xpath(".//*[@id='107']")).click();
	}

/*	@Test
	public void buyAndRemoveFromCart() {
		driver.findElement(By.cssSelector(".btn-express-checkout.btn-big.current")).click();
		driver.findElement(By.cssSelector(".remove.fk-inline-block")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	@Test
	public void logout() {
		Actions s = new Actions(driver);
		WebElement user = driver.findElement(By.partialLinkText(username));
		s.moveToElement(user).build().perform();
		driver.findElement(By.linkText("Logout")).click();
	}*/

	@AfterClass
	public void quit() {
		driver.close();
	}
}