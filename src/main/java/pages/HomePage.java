package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[text()='Edit']")WebElement editbtn;
	@FindBy(xpath = "//*[@id='fullName']")WebElement name;
	@FindBy(xpath = "//*[@id='join']")WebElement tab;
	@FindBy(xpath = "//*[@id='getMe']")WebElement testBox;
	@FindBy(xpath = "//*[@id='clearMe']")WebElement clearText;
	@FindBy(xpath = "//*[@id='noEdit']")WebElement disableText;
	@FindBy(xpath = "//*[@id='dontwrite']")WebElement readOnly;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEdit()
	{
		editbtn.click();
	}
	
	public void validatAction() throws InterruptedException
	{
		name.sendKeys("jhon");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		String atvalue = testBox.getAttribute("value");
		System.out.println(atvalue);
		Thread.sleep(2000);
		
		clearText.clear();
		Thread.sleep(2000);
		
		boolean test = disableText.isEnabled();
		System.out.println(test);
		Thread.sleep(2000);
		
		String text = readOnly.getAttribute("value");
		System.out.println(text);
		Thread.sleep(2000);
	}
	

}
