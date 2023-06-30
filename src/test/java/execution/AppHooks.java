package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser()
	{
		DriverFactory df = new DriverFactory();
		driver = df.initBrowser();
		driver.manage().window().maximize();
	}
	
	@After(order = 2)
	public void tearDown()
	{
		System.out.println("its tear down line");
	}
	
	@After(order = 1)
	public void quiteBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
