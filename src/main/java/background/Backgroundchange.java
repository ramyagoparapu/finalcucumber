package background;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Backgroundchange {
	WebDriver driver;
	public Backgroundchange(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy (how=How.XPATH, using = "//*[@id=\"extra\"]/button[1]") WebElement SKYBLUE_BACKGROUND_BUTTON;
    @FindBy (how=How.XPATH, using = "//*[@id=\"extra\"]/button[2]") WebElement WHITE_BACKGROUND_BUTTON;
    @FindBy (how=How.TAG_NAME, using = "body") WebElement BACKGROUND_PAGE_BODY;
    
    public void blueskyBackgroundButtonExist() {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(SKYBLUE_BACKGROUND_BUTTON));
    }
    public void whiteBackgroundbuttonExist() {
    	WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(WHITE_BACKGROUND_BUTTON));

    }
    public void clickBlueBackgroundButton(){
        SKYBLUE_BACKGROUND_BUTTON.click();
    
    }

    public void clickWhiteBackgroundButton(){
        WHITE_BACKGROUND_BUTTON.click();
    
    }
    public void verifyBackgroundIsBlue() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.attributeContains(BACKGROUND_PAGE_BODY, "style", "background-color: skyblue;"));

    }
    
    public void verifyBackgroundIsWhite() {
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.attributeContains(BACKGROUND_PAGE_BODY, "style", "background-color: white;"));
    }


}