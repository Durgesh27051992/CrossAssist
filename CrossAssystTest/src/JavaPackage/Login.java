package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends SelectBrowser {

	public static void login1() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='login']")).click();
		Logger logger=Logger.getLogger("Login");
		PropertyConfigurator.configure("E:\\Durgesh Automation\\Software\\workspace\\CrossAssystTest\\log4j.properties");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("durgeshms27@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Durgesh@123");
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		logger.info("Login successfully");
		
		
		// Click on Women section
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")).click();
		logger.info("Women section selected");

		int totalframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("totalframes are=" + totalframes);

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		logger.info("Item added to cart successfully");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-default button button-medium']"))).click();
		logger.info("Introduce Explicitwait");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"))).click();
	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button btn btn-default button-medium']"))).click();

		// click on checkbox
		driver.findElement(By.xpath("//*[@id='cgv']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"))).click();
		driver.findElement(By.xpath("//*[@class='bankwire']")).click();
		driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']")).click();
		driver.findElement(By.xpath("//*[@class='account']")).click();
		driver.findElement(By.xpath("//*[@class='icon-list-ol']")).click();

	}
}
