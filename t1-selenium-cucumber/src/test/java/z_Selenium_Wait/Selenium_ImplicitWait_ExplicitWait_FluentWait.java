package z_Selenium_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import z_selenium_sample_server.SampleJettyServer;

public class Selenium_ImplicitWait_ExplicitWait_FluentWait {

	static WebDriver driver;
	static SampleJettyServer sampleServer;
	static long totalTime;
	static long start;
	static long finish;


	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("############### Executing Element Load Check ############### (" + i + ")");
			implicitWaitAndExplicit();
		}
	}

	
	
	/**
	 * Interview Notes: Implicit Wait
	 * 
	 * 
	 */
	public static void implicitWaitAndExplicit() {

		// Starting The Sample Server
		runSampleServer();

		// Setting Up the Driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Navigate to Test Page
		String url = "http://localhost:" + SampleJettyServer.PORT + "/Sample-Web/dynamicWebElementLoading.htm";
		driver.get(url);

		// Setting up the driver to wait implicitly
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		try {
			//_______________________________________________Load Element 1 ( Takes 1 Second )__________
			// Click Load Element Button
			String loadButtonXpath = "//button[contains(text(),'Load Element 1')]";
			driver.findElement(By.xpath(loadButtonXpath)).click();

			// Target "Hello World!" Element can be found in 1 Second
			String targetEleXpath = "//h4[contains(text(),'Hello World!')]";
			WebElement targetElement = driver.findElement(By.xpath(targetEleXpath));
			System.out.println("Element Available1 : " + targetElement.isDisplayed());

			// ######### Load Element 2 ( Takes 2 Second ) #########
			// Click Load Element Button
			driver.findElement(By.xpath("//button[contains(text(),'Load Element 2')]")).click();

			// Target "Hello World!" Element can be found in 2 Second
			WebElement targetElement2 = driver.findElement(By.xpath("//h4[contains(text(),'Hello World2!')]"));
			System.out.println("Element Available2 : " + targetElement2.isDisplayed());

			// ######### Load Element 3 ( Takes 3 Second ) #########
			// Click Load Element Button
			driver.findElement(By.xpath("//button[contains(text(),'Load Element 3')]")).click();

			// Target "Hello World!" Element can be found in 3 Second
			WebElement targetElement3 = driver.findElement(By.xpath("//h4[contains(text(),'Hello World3!')]"));
			System.out.println("Element Available3 : " + targetElement3.isDisplayed());
			
			// ######################## Load Element 4 ( Random Second Between 1-400 )
			// Click Load Element Button
			driver.findElement(By.xpath("//button[contains(text(),'Load Element 4')]")).click();

			trackTimeBeforeDriverAction();
			
			// Explicitly Wait for the Object
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement targetElement4 = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World4!')]")));
			System.out.println("Element Available4 : " + targetElement4.isDisplayed());
			
			trackTimeAfterDriverAction();
			
		} catch (Exception e) {
			trackTimeAfterDriverAction();
			e.printStackTrace();
		} finally {
			driver.close();
			stopSampleServer();
		}

		System.out.println("End OF Functions ");
	}

	/** Tracking Web Driver Actions Time */
	public static void trackTimeBeforeDriverAction() {
		start = System.currentTimeMillis();
	}
	public static void trackTimeAfterDriverAction() {
		finish = System.currentTimeMillis();
		totalTime = finish - start;
		System.out.println("Total Time for Element load - " + totalTime);
	}
	
	public static void runSampleServer() {
		try {
			sampleServer = new SampleJettyServer(SampleJettyServer.PORT);
			sampleServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/** Start Stop Sample Web Server  */
	public static void stopSampleServer() {
		try {
			sampleServer.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
