package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends SelectBrowser {

	public static void main(String[] args) throws Exception {

		SelectBrowser.browserType("ChromeDriver");
		Property.setproperty();
		register();

	}
	
	public static void register() throws Exception {
		try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Logger logger = Logger.getLogger("Registration");
		PropertyConfigurator
				.configure("E:\\Durgesh Automation\\Software\\workspace\\CrossAssystTest\\log4j.properties");

		System.out.println(SelectBrowser.driver);
		driver.findElement(By.xpath("//*[@class='login']")).click();

		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("durgeshms27@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		String error = driver.findElement(By.xpath("//*[@id='create_account_error']")).getText();
		System.out.println("error is =" + error);
		if (error.equalsIgnoreCase(
				"An account using this email address has already been registered. Please enter a valid password or request a new one. ")) {
			logger.info("Already used emailid");
		} else {
			logger.info("Do register");
			 Login.login1();
		}

		driver.findElement(By.xpath("//input[@id='id_gender1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Durgesh");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Sawkhedkar");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("durgeshms27@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Durgesh@123");

		// Select date of birthday
		List<WebElement> birthDay = driver.findElements(By.xpath("//select[@id='days']/option"));
		System.out.println("Total dropdown foe birth day are=" + birthDay.size());
		birthDay.get(27).click();

		// Select Month of birthday
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='months']/option"));
		System.out.println("Total dropdown foe birth month are=" + birthMonth.size());
		birthMonth.get(5).click();

		// Select Month of birthday
		List<WebElement> birthYear = driver.findElements(By.xpath("//select[@id='years']/option"));
		System.out.println("Total dropdown foe birth Year are=" + birthYear.size());
		birthYear.get(19).click();

		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Durgesh");
		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Sawkhedkar");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Navi Mumbai");

		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Dhule");
		// driver.findElement(By.xpath("//*[@id='id_state']")).sendKeys("Maharashtra");

		List<WebElement> state = driver.findElements(By.xpath("//*[@id='id_state']/option"));
		System.out.println("Total dropdown for States are=" + state.size());
		state.get(1).click();

		driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("00000");

		List<WebElement> country = driver.findElements(By.xpath("//*[@id='id_country']/option"));
		System.out.println("Total dropdown for Country are=" + country.size());
		birthYear.get(1).click();

		driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("9028365616");
		driver.findElement(By.xpath("//*[@id='alias']")).clear();
		driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("Deopur Dhule");
		driver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	}
		catch(Exception e) {
			System.out.println("Exception handleds");
		}
	}
}
