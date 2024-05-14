package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame(0);
	
	WebElement eleDrag = driver.findElement(By.id("draggable"));
	
	Actions builder=new Actions(driver);
	builder.dragAndDropBy(eleDrag, 100, 200).perform();
	
	
	
	
	
	
	
}
}
