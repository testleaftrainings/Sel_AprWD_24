package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropabble {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame(0);
	
	WebElement from = driver.findElement(By.id("draggable"));
	
	WebElement to = driver.findElement(By.id("droppable"));
	
	Actions builder=new Actions(driver);
	builder.dragAndDrop(from, to).perform();
	
	
	
	
	
}
}
