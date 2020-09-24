package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {
	public static WebDriver driver;

	public static void browserType(String browsertype) {
		switch (browsertype) {

		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "ChromeDriver":
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;

		default:
			driver = new ChromeDriver();
			System.out.println("the browser " + browsertype + " not found hence we wiil open default chrome driver");
		}
	}

}
