package steps;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import background.Backgroundchange;
import background.Testbase;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefinitiion extends Testbase{

	Backgroundchange backgroundChange;
	@Before
	public void beforeRun() {
		
		
		backgroundChange=PageFactory.initElements(driver, Backgroundchange.class);
	
	}
	
	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String button) throws Throwable {
init();
	
		if(button.equalsIgnoreCase("Set SkyBlue Background")) {
			backgroundChange.blueskyBackgroundButtonExist();
			
		}
		else if(button.equalsIgnoreCase("Set White Background")){
			backgroundChange.whiteBackgroundbuttonExist();
			
		}
	  
	}

	@When("^I click on the \"([^\"]*)\" button$")
	public void i_click_on_the_button(String backgroundButton) throws Throwable {
		if(backgroundButton.equalsIgnoreCase("Set SkyBlue Background")) {
			backgroundChange.clickBlueBackgroundButton();
		}
		else if(backgroundButton.equalsIgnoreCase("Set White Background")) {
			backgroundChange.clickWhiteBackgroundButton();
			
		}
	  
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		backgroundChange.verifyBackgroundIsBlue();
		
	  
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		backgroundChange.verifyBackgroundIsBlue();
		
	 
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}