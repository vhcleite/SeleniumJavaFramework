import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void mySleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
		}
	}

	public static void main(String []args) throws InterruptedException {

		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", ProjectPath + "/drivers/geckodriver/geckodriver");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver/chromedriver");

		//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));

		searchBox.sendKeys("Victor Hugo da Costa Leite");
		searchBox.sendKeys(Keys.ENTER);

		mySleep(5000);
		driver.close();
	}
}
