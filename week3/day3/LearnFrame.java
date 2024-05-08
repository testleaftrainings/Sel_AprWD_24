package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {

		//Launch Chrome Browser
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/frame.xhtml");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add wait here
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on click me
		//1st i have to handle frame, after thet you should click the button
		driver.switchTo().frame(0);
		WebElement eleClickMe = driver.findElement(By.id("Click"));
		eleClickMe.click();
		String text = eleClickMe.getText();
		System.out.println(text);

		//controll move to out of the frame
		driver.switchTo().defaultContent();


		//Handle Nested Frame  
		//This is a outframe
		driver.switchTo().frame(2);
		// move to inner frame
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@name='frame2']"));
		driver.switchTo().frame(eleFrame);
		WebElement ele = driver.findElement(By.id("Click"));
		ele.click();
		String text2 = ele.getText();
		System.out.println(text2);
	}
}
