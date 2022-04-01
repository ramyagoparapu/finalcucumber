package background;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-workspace\\finalpracticecucucmber\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("http://techfios.com/test/101/");
		
		}
}
