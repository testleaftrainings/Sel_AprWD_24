package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame(0);
	WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	WebElement ele5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	
	Actions builder=new Actions(driver);
	//builder.keyDown(Keys.CONTROL)
	//.click(ele1).click(ele2).click(ele3).click(ele4).click(ele5).keyUp(Keys.CONTROL).perform();
	builder.clickAndHold(ele1).clickAndHold(ele5).release().perform();
	
	
	
	
	
	
	
}
}
