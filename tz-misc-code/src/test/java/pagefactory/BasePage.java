package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	@FindBy(id= "username") 
	private WebElement userName;
	
	@FindBy(id= "password") 
	private WebElement password;
	
	@FindBy(id= "login") 
	private WebElement loginBtn;

	
	WebDriver driver;
	
	//Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	

	public void userLogin(String userName, String password) {
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
		loginBtn.click();
	}
}
