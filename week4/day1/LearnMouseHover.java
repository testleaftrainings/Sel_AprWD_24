package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement eleFashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
	
	Actions builder =new Actions(driver);
	builder.moveToElement(eleFashion).perform();
	WebElement eleClick = driver.findElement(By.linkText("Men's T-Shirts"));
	builder.click(eleClick).perform();
}
}
