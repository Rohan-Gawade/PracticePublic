package execution;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	
	
	HomePage home = new HomePage(DriverFactory.getDriver());
	
	@Given("User is on the home page")
	public void user_is_on_the_home_page()
	{
	   WebDriver driver = DriverFactory.getDriver();
	   driver.get("https://letcode.in/test");
	}

	@When("User clicks on input module")
	public void user_clicks_on_input_module()
	{
	   home.clickOnEdit();
	}

	@Then("User navigate to the next page")
	public void user_navigate_to_the_next_page() throws InterruptedException
	{
	    home.validatAction();
	}

}
