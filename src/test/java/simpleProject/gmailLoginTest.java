package simpleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class gmailLoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void dologin() {
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("karthikbdvt6");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("shcfdjce");
		 * //driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]")).sendKeys(
		 * "sfefeffef");
		 */	}

	@AfterSuite
	public void teardown() {
		
		//driver.quit();
		
	}
	
	
	
}
