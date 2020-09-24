package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property extends SelectBrowser {

	public static void setproperty() {
		System.setProperty("webdriver.chrome.driver","E:\\Durgesh Automation\\Software\\chromedriver\\Update\\85 version\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");

	}

}
