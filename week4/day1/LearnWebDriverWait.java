package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {
public static void main(String[] args) {
	//Launch Chrome Browser
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/waits.xhtml");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add wait here
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='I am here']"));
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
		boolean displayed = ele.isDisplayed();
		System.out.println(displayed);
		if(ele.isDisplayed()) {
			System.out.println("I am here button is displayed succesfully");
		}
		//driver.findElement(locator).sendKeys("Aravind");
}
}
