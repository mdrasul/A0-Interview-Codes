package multicard.steps.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import multicard.pages.object.model.HomePage;
import multicard.pages.object.model.MyaccountPage;
import multicard.pages.object.model.OrderPage;
import multicard.test.data.User;

public class MctTestHelper {
	
	private WebDriver driver;
	private User james; 
	private HomePage home;
	private MyaccountPage myaccount;
	private OrderPage order;

	// Single Ton Mthods 
	
	public WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}		
		return driver;
	}
		
	public User getJames() {
		if(james==null) {
			james=new User();
		}		
		return james;
	}

	public HomePage getHome() {
		if(home==null) {
			home=new HomePage(getDriver());
		}		
		return home;
	}
	
	public MyaccountPage getMyaccount() {
		
		if(myaccount==null) {
			myaccount=new MyaccountPage(getDriver());
		}		
		
		return myaccount;
	}

	public OrderPage getOrder() {
		
		if(order==null) {
			order=new OrderPage(getDriver());
		}		
		
		return order;
	}


}
