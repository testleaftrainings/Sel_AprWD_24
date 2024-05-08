package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	
	//Launch Chrome Browser
	ChromeDriver driver =new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0h2xkcbn0i4fbtrcabe4lbk6x779882.node0");
	//To maximize the browser
	driver.manage().window().maximize();
	//Add wait here
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	//click on show button
	driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined']")).click();
	Thread.sleep(3000);
	Alert simpleAlert = driver.switchTo().alert();
	simpleAlert.accept();
	
	//Confirmation Alert
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	Thread.sleep(3000);
	Alert confiramationAlert = driver.switchTo().alert();
	//confiramationAlert.accept();
	confiramationAlert.dismiss();
	
	//Handle Prompt Alert
	driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
	Alert promptAlert = driver.switchTo().alert();
	promptAlert.sendKeys("Testleaf");
	promptAlert.accept();
	
	String text = driver.findElement(By.id("confirm_result")).getText();
	System.out.println(text);
	
	
}
}
