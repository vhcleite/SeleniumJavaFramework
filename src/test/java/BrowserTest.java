import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String []args) {
		
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", ProjectPath + "/drivers/geckodriver/geckodriver");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver/chromedriver");
		
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		driver.close();
	}
}
