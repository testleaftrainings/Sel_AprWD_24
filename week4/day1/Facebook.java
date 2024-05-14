package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
public static void main(String[] args) {
	//Launch Chrome Browser
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://www.facebook.com/");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add wait here
		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		
		By locator = By.xpath("//input[@name='firstname']");
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		driver.findElement(locator).sendKeys("Aravind");
}
}
